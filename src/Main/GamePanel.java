package Main;

import javax.swing.JPanel;

import Entity.Entity;
import Entity.Player;
import Tile.TileManager;
import Tile_Interactive.InteractiveObject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class GamePanel extends JPanel implements Runnable{
    //SCREEN SETTINGS
    final int originalTileSize = 16;
    final int scale = 3;
    final public int tileSize = originalTileSize * scale; // 48x48 tile
    final public int maxScreenCol = 16;
    final public int maxScreenRow = 12;
    final public int screenWidth = tileSize * maxScreenCol;
    final public int screenHeight = tileSize * maxScreenRow;

    // World Settings
    public final int maxWorldCol = 50;
    public final int maxWorldRow = 50;
    
    //Music
    Music music = new Music();
    Music se = new Music();
    
    // Frame Per Second
    int fps = 60;

    public KeyHandler keyH = new KeyHandler(this);
    Thread gameThread;
    public AssetSetter aSetter = new AssetSetter(this);
    public Player player = new Player(this, keyH);
    public UI ui = new UI(this);
    public CollisionChecker cChecker = new CollisionChecker(this);
    public TileManager tileManager = new TileManager(this);
    public InteractiveObject tileInteractiveObject[] = new InteractiveObject[50];
    public Entity obj[] = new Entity[50];
    public Entity npc[] = new Entity[10];
    public Entity monster[] = new Entity[20];
    public ArrayList<Entity> projectileList = new ArrayList<>();

    // Game State
    public int gameState;
    public final int titleState = 0;
    public final int playState = 1;
    public final int pauseState = 2;
    public final int dialogueState = 3;
    public final int inventoryState = 4;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);


    }

    public void setupGame() {
        aSetter.setObject();
        aSetter.setNCP();
        aSetter.setMonster();
        aSetter.setInteractiveTile();
        gameState = titleState;
    }
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {
        double drawInterval = 1000000000/fps;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;
        while(gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;
            
            if (delta >= 1){
                update();
                repaint(); 
                delta--;
                drawCount++;
            }  
            
            if (timer >= 1000000000) {
                System.out.println("FPS: " + drawCount);
                drawCount = 0;
                timer = 0;
                    
            }
        }

    }

    public void update() {
        if (gameState == playState && ui.gameFinished == false){
            // Player
            player.update();
            // NPC
            for (int i = 0; i < npc.length; i++){
                if (npc[i] != null){
                    npc[i].update();
                }
            }
            for (int i = 0; i < monster.length; i++){
                if (monster[i] != null){
                    if (monster[i].alive == true && monster[i].dying == false){
                        monster[i].update();
                    }
                    if (monster[i].alive == false){
                        monster[i] = null;
                    }
                }
            }

            for (int i = 0; i < projectileList.size(); i++){
                if (projectileList.get(i) != null){
                    if (projectileList.get(i).alive == true){
                        projectileList.get(i).update();
                    }
                    else if (projectileList.get(i).alive == false){
                        projectileList.remove(i);
                    }
                }
            }

            for(int i = 0; i < tileInteractiveObject.length; i++){
                if (tileInteractiveObject[i] != null){
                    tileInteractiveObject[i].update();
                }
            }
            
        }
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        if (gameState == titleState){
            ui.draw(g2);
        } else {
            tileManager.draw(g2);
            for (int i = 0; i < tileInteractiveObject.length; i++) {
                if (tileInteractiveObject[i] != null){
                    tileInteractiveObject[i].draw(g2);
                }
            }
            for (int i = 0; i < obj.length; i++) {
                if (obj[i] != null){
                    obj[i].draw(g2);
                }
            }
            for (int i = 0; i < npc.length; i++) {
                if (npc[i] != null){
                    npc[i].draw(g2);
                }
            }
            for (int i = 0; i < monster.length; i++) {
                if (monster[i] != null){
                    monster[i].draw(g2);
                }
            }
            for (int i = 0; i < projectileList.size(); i++) {
                if (projectileList.get(i) != null){
                    projectileList.get(i).draw(g2);
                }
            }
            player.draw(g2);
            ui.draw(g2);
        }
        g2.dispose();
    }
    public void playMusic(int i) {
        music.SetFile(i);
        music.play();
        music.loop();
    }
    public void stopMusic() {
        music.stop();
    }
    public void playSE(int i) {
        se.SetFile(i);
        se.play();
    }
    
}
