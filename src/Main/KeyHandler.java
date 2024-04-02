package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

    GamePanel gp;
    public boolean upPressed, downPressed, leftPressed, rightPressed, enterPressed, cPressed, shotKeyPressed;

    public KeyHandler(GamePanel gp){
        this.gp = gp;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (gp.gameState == gp.titleState){
            if (gp.ui.titleScreenRate == 0){
                if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
                    gp.ui.cmdIndex--;
                    if (gp.ui.cmdIndex < 0){
                        gp.ui.cmdIndex = 2;
                    }
                }
                
                if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                    gp.ui.cmdIndex++;   
                    if (gp.ui.cmdIndex > 2){
                        gp.ui.cmdIndex = 0;
                    }
                } 
    
                if (code == KeyEvent.VK_ENTER){
                    if (gp.ui.cmdIndex == 0){
                        gp.ui.titleScreenRate = 1;
                        gp.playMusic(0);
                    }
                    if (gp.ui.cmdIndex == 1){
                        // add later
                    }
                    if (gp.ui.cmdIndex == 2){
                        System.exit(0);
                    } 
                }
            } else if (gp.ui.titleScreenRate == 1){
                if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
                    gp.ui.cmdIndex--;
                    if (gp.ui.cmdIndex < 0){
                        gp.ui.cmdIndex = 2;
                    }
                }
                
                if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                    gp.ui.cmdIndex++;   
                    if (gp.ui.cmdIndex > 3){
                        gp.ui.cmdIndex = 0;
                    }
                } 
    
                if (code == KeyEvent.VK_ENTER){
                    if (gp.ui.cmdIndex == 0){
                        gp.player.playerRole = gp.player.fighterRole;
                        gp.gameState = gp.playState;
                    }
                    if (gp.ui.cmdIndex == 1){
                        gp.player.playerRole = gp.player.theifRole;
                        gp.gameState = gp.playState;
                    }
                    if (gp.ui.cmdIndex == 2){
                        gp.player.playerRole = gp.player.scorererRole;
                        gp.gameState = gp.playState;
                    } 
                    if (gp.ui.cmdIndex == 3){
                        gp.ui.titleScreenRate = 0;
                    }
                }
            } 
        }
        if (gp.gameState == gp.playState){
            if (code == KeyEvent.VK_W) {
                upPressed = true;
            }
            
            if (code == KeyEvent.VK_S) {
                downPressed = true;    
            } 

            if (code == KeyEvent.VK_A) {
                leftPressed = true;    
            } 

            if (code == KeyEvent.VK_D) {
                rightPressed = true;    
            }
            
            if (code == KeyEvent.VK_ESCAPE) {
                gp.gameState = gp.pauseState;
            }
            if (code == KeyEvent.VK_ENTER) {
                if (gp.player.playerRole == gp.player.fighterRole || gp.player.playerRole == gp.player.scorererRole)
                    enterPressed = true;
            }
            if (code == KeyEvent.VK_C){
                if (gp.player.playerRole == gp.player.fighterRole){
                    cPressed = true;
                }
            }
            if (code == KeyEvent.VK_E) {
                gp.gameState = gp.inventoryState;
            }
            if (code == KeyEvent.VK_F){
                shotKeyPressed = true;
            }
        }
        if (gp.gameState == gp.pauseState){
            if (code == KeyEvent.VK_ENTER) {
                gp.gameState = gp.playState;
            }
        }
        if (gp.gameState == gp.dialogueState){
            if (code == KeyEvent.VK_ENTER) {
                gp.gameState = gp.playState;
            }
        }
        if (gp.gameState == gp.inventoryState){
            if (code == KeyEvent.VK_ESCAPE) {
                gp.gameState = gp.playState;
            }
            if (code == KeyEvent.VK_W) {
                if (gp.ui.slotRow > 0){
                    gp.ui.slotRow--;
                }
            }
            if (code == KeyEvent.VK_S) {
                if (gp.ui.slotRow < 3){
                    gp.ui.slotRow++;
                }
            }
            if (code == KeyEvent.VK_A) {
                if (gp.ui.slotCol > 0){
                    gp.ui.slotCol--;
                }
            }
            if (code == KeyEvent.VK_D) {
                if (gp.ui.slotCol < 4){
                    gp.ui.slotCol++;
                }
            }
            if (code == KeyEvent.VK_ENTER) {
                gp.player.selectItem();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W) {
            upPressed = false;
        }
        
        if (code == KeyEvent.VK_S) {
            downPressed = false;    
        } 

        if (code == KeyEvent.VK_A) {
            leftPressed = false;    
        } 

        if (code == KeyEvent.VK_D) {
            rightPressed = false;    
        } 
        if (code == KeyEvent.VK_ENTER) {
            enterPressed = false;
        }
        if (code == KeyEvent.VK_C){
            if (gp.player.playerRole == gp.player.fighterRole){
                cPressed = false;
            }
        }
        if (code == KeyEvent.VK_F){
            shotKeyPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
  
        
    }
    
    
}
