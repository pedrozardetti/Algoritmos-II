import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;
import java.io.File;

public class AudioPlayer {
    public static void playGolSound() {
        playSound("/resources/AudioGol.wav");
    }

    public static void playFinalSound() {
        playSound("/resources/AudioFinal.wav");
    }

    public static void playDefesaSound() {
        playSound("/resources/AudioDefesa.wav");
    }

    private static void playSound(String filePath) {
        try {
            File soundFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Erro ao reproduzir o som: " + e.getMessage());
        }
    }
}

