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

    private static void playSound(String resourcePath) {
        try {
            URL soundURL = AudioPlayer.class.getResource(resourcePath);
            if (soundURL == null) {
                throw new IOException("Arquivo não encontrado " + resourcePath);
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.err.println("Erro ao reproduzir o som: " + e.getMessage());
        }
    }
}

