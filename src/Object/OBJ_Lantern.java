package Object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Lantern extends Entity{
    GamePanel gp;
    public OBJ_Lantern(GamePanel gp){
        super(gp);

        this.gp = gp;
        name = "Lantern";
        type = type_light;
        solidArea = new Rectangle();
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 48;
        solidArea.height = 48;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        lightRadius = 250;
        try {
            image = ImageIO.read(new FileInputStream("res/Objects/lantern.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
        collisionOn = true;
        despiction = "["+name+"]/nIlluminates your /nsurroundings.";

    }
    public void draw(Graphics2D g2) {
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;
        if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
            worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
            worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
            worldY - gp.tileSize < gp.player.worldY + gp.player.screenY
        ) {
            g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);

        }
    }
}
