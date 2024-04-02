package Main;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
    Clip clip;
    File soundURL[] = new File[30];
    public Music() {
        soundURL[0] = new File("res/Musics/BlueBoyAdventure.wav");
        soundURL[1] = new File("res/Musics/coin.wav");
        soundURL[2] = new File("res/Musics/powerup.wav");
        soundURL[3] = new File("res/Musics/unlock.wav");
        soundURL[4] = new File("res/Musics/fanfare.wav");
        soundURL[5] = new File("res/Musics/hitmonster.wav");
        soundURL[6] = new File("res/Musics/blocked.wav");
        soundURL[7] = new File("res/Musics/gameover.wav");
        soundURL[8] = new File("res/Musics/levelup.wav");
        soundURL[9] = new File("res/Musics/burning.wav");

    }
    public void SetFile(int i){
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void play() {
        clip.start();
    }
    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop() {
        clip.close();
    }
}
