package Main;

import Tile_Interactive.IT_DryTree;
import Object.OBJ_Axe;
import Object.OBJ_Blue_Shield;
import Object.OBJ_Boot;
import Object.OBJ_Chest;
import Object.OBJ_Door;
import Object.OBJ_Key;
import Entity.NPC_OldMan;
import Monster.MON_Bat;
import Monster.MON_Orc;
import Monster.MON_RedSlime;
import Monster.MON_Slime;

public class AssetSetter {
    GamePanel gp;
    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }
    public void setObject() {
        gp.obj[0] = new OBJ_Key(gp);
        gp.obj[0].worldX = 37*gp.tileSize;
        gp.obj[0].worldY = 10*gp.tileSize;

        gp.obj[2] = new OBJ_Key(gp);
        gp.obj[2].worldX = 22*gp.tileSize;
        gp.obj[2].worldY = 40*gp.tileSize;

        gp.obj[1] = new OBJ_Key(gp);
        gp.obj[1].worldX = 13*gp.tileSize;
        gp.obj[1].worldY = 33*gp.tileSize;

        gp.obj[3] = new OBJ_Door(gp);
        gp.obj[3].worldX = 10*gp.tileSize;
        gp.obj[3].worldY = 12*gp.tileSize;

        gp.obj[4] = new OBJ_Door(gp);
        gp.obj[4].worldX = 8*gp.tileSize;
        gp.obj[4].worldY = 20*gp.tileSize;

        gp.obj[5] = new OBJ_Door(gp);
        gp.obj[5].worldX = 12*gp.tileSize;
        gp.obj[5].worldY = 23*gp.tileSize;

        gp.obj[6] = new OBJ_Chest(gp);
        gp.obj[6].worldX = 10*gp.tileSize;
        gp.obj[6].worldY = 8*gp.tileSize;

        gp.obj[7] = new OBJ_Boot(gp);
        gp.obj[7].worldX = 37*gp.tileSize;
        gp.obj[7].worldY = 42*gp.tileSize;

        gp.obj[8] = new OBJ_Blue_Shield(gp);
        gp.obj[8].worldX = 10*gp.tileSize;
        gp.obj[8].worldY = 32*gp.tileSize;

        gp.obj[9] = new OBJ_Axe(gp);
        gp.obj[9].worldX = 33*gp.tileSize;
        gp.obj[9].worldY = 7*gp.tileSize;

        
    }
    public void setNCP() {
        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = 21*gp.tileSize;
        gp.npc[0].worldY = 21*gp.tileSize;
    }

    public void setMonster() {
        gp.monster[0] = new MON_Slime(gp);
        gp.monster[0].worldX = 22*gp.tileSize;
        gp.monster[0].worldY = 7*gp.tileSize;

        gp.monster[1] = new MON_Slime(gp);
        gp.monster[1].worldX = 26*gp.tileSize;
        gp.monster[1].worldY = 8*gp.tileSize;

        gp.monster[2] = new MON_Slime(gp);
        gp.monster[2].worldX = 18*gp.tileSize;
        gp.monster[2].worldY = 21*gp.tileSize;

        gp.monster[3] = new MON_Orc(gp);
        gp.monster[3].worldX = 12*gp.tileSize;
        gp.monster[3].worldY = 32*gp.tileSize;

        gp.monster[4] = new MON_Bat(gp);
        gp.monster[4].worldX = 32*gp.tileSize;
        gp.monster[4].worldY = 42*gp.tileSize;
        
        gp.monster[5] = new MON_Slime(gp);
        gp.monster[5].worldX = 35*gp.tileSize;
        gp.monster[5].worldY = 37*gp.tileSize;

        gp.monster[6] = new MON_Bat(gp);
        gp.monster[6].worldX = 36*gp.tileSize;
        gp.monster[6].worldY = 11*gp.tileSize;

        gp.monster[7] = new MON_Slime(gp);
        gp.monster[7].worldX = 35*gp.tileSize;
        gp.monster[7].worldY = 20*gp.tileSize;
        
        gp.monster[8] = new MON_Slime(gp);
        gp.monster[8].worldX = 36*gp.tileSize;
        gp.monster[8].worldY = 27*gp.tileSize;

        gp.monster[9] = new MON_Slime(gp);
        gp.monster[9].worldX = 19*gp.tileSize;
        gp.monster[9].worldY = 38*gp.tileSize;

        gp.monster[10] = new MON_Bat(gp);
        gp.monster[10].worldX = 21*gp.tileSize;
        gp.monster[10].worldY = 40*gp.tileSize;

        gp.monster[11] = new MON_Slime(gp);
        gp.monster[11].worldX = 24*gp.tileSize;
        gp.monster[11].worldY = 40*gp.tileSize;

        gp.monster[12] = new MON_Bat(gp);
        gp.monster[12].worldX = 34*gp.tileSize;
        gp.monster[12].worldY = 38*gp.tileSize;

        gp.monster[13] = new MON_RedSlime(gp);
        gp.monster[13].worldX = 39*gp.tileSize;
        gp.monster[13].worldY = 9*gp.tileSize;

        gp.monster[14] = new MON_RedSlime(gp);
        gp.monster[14].worldX = 39*gp.tileSize;
        gp.monster[14].worldY = 11*gp.tileSize;

        gp.monster[15] = new MON_RedSlime(gp);
        gp.monster[15].worldX = 14*gp.tileSize;
        gp.monster[15].worldY = 32*gp.tileSize;
        
        gp.monster[16] = new MON_RedSlime(gp);
        gp.monster[16].worldX = 9*gp.tileSize;
        gp.monster[16].worldY = 29*gp.tileSize;

       
    }
    public void setInteractiveTile() {
        gp.tileInteractiveObject[0] = new IT_DryTree(gp);
        gp.tileInteractiveObject[0].worldX = 27*gp.tileSize;
        gp.tileInteractiveObject[0].worldY = 9*gp.tileSize;

        gp.tileInteractiveObject[1] = new IT_DryTree(gp);
        gp.tileInteractiveObject[1].worldX = 28*gp.tileSize;
        gp.tileInteractiveObject[1].worldY = 9*gp.tileSize;

        gp.tileInteractiveObject[2] = new IT_DryTree(gp);
        gp.tileInteractiveObject[2].worldX = 29*gp.tileSize;
        gp.tileInteractiveObject[2].worldY = 9*gp.tileSize;

        gp.tileInteractiveObject[3] = new IT_DryTree(gp);
        gp.tileInteractiveObject[3].worldX = 30*gp.tileSize;
        gp.tileInteractiveObject[3].worldY = 10*gp.tileSize;

        gp.tileInteractiveObject[4] = new IT_DryTree(gp);
        gp.tileInteractiveObject[4].worldX = 31*gp.tileSize;
        gp.tileInteractiveObject[4].worldY = 10*gp.tileSize;

        gp.tileInteractiveObject[5] = new IT_DryTree(gp);
        gp.tileInteractiveObject[5].worldX = 32*gp.tileSize;
        gp.tileInteractiveObject[5].worldY = 10*gp.tileSize;

        gp.tileInteractiveObject[6] = new IT_DryTree(gp);
        gp.tileInteractiveObject[6].worldX = 33*gp.tileSize;
        gp.tileInteractiveObject[6].worldY = 10*gp.tileSize;

        gp.tileInteractiveObject[7] = new IT_DryTree(gp);
        gp.tileInteractiveObject[7].worldX = 29*gp.tileSize;
        gp.tileInteractiveObject[7].worldY = 10*gp.tileSize;

        gp.tileInteractiveObject[8] = new IT_DryTree(gp);
        gp.tileInteractiveObject[8].worldX = 8*gp.tileSize;
        gp.tileInteractiveObject[8].worldY = 30*gp.tileSize;

        gp.tileInteractiveObject[9] = new IT_DryTree(gp);
        gp.tileInteractiveObject[9].worldX = 8*gp.tileSize;
        gp.tileInteractiveObject[9].worldY = 29*gp.tileSize;

        gp.tileInteractiveObject[10] = new IT_DryTree(gp);
        gp.tileInteractiveObject[10].worldX = 8*gp.tileSize;
        gp.tileInteractiveObject[10].worldY = 28*gp.tileSize;

        gp.tileInteractiveObject[11] = new IT_DryTree(gp);
        gp.tileInteractiveObject[11].worldX = 8*gp.tileSize;
        gp.tileInteractiveObject[11].worldY = 27*gp.tileSize;

        gp.tileInteractiveObject[12] = new IT_DryTree(gp);
        gp.tileInteractiveObject[12].worldX = 8*gp.tileSize;
        gp.tileInteractiveObject[12].worldY = 26*gp.tileSize;

        gp.tileInteractiveObject[13] = new IT_DryTree(gp);
        gp.tileInteractiveObject[13].worldX = 10*gp.tileSize;
        gp.tileInteractiveObject[13].worldY = 25*gp.tileSize;
    }
}
