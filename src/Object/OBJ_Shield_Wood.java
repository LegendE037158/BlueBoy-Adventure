package Object;

import java.awt.Graphics2D;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import Entity.Entity;
import Main.GamePanel;

public class OBJ_Shield_Wood extends Entity{
    GamePanel gp;
    public OBJ_Shield_Wood(GamePanel gp){
        super(gp);
        this.gp = gp;

        name = "Woodern Shield";
        type = type_shield;
        try {
            image = ImageIO.read(new FileInputStream("res/Objects/shield_wood.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        defenseValue = 1;
        despiction = "["+name+"]/nMade by Wood.";
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

