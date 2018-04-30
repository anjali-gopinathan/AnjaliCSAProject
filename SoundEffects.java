import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;

public class SoundEffects {
	private Clip clip;		//in the sampled sound package
	public static enum Volume {
	      MUTE, LOW, MEDIUM, HIGH
	   }
	public static Volume volume = Volume.LOW;
	
//	public SoundEffects() {
//		
//		clip = AudioSystem.getClip();
//	}
	public SoundEffects(String filename) {
		 try {
	         // Use URL (instead of File) to read from disk and JAR.
	         URL url = this.getClass().getClassLoader().getResource("./sounds/"+filename);
	         // Set up an audio input stream piped from the sound file.
	         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
	         // Get a clip resource.
	         clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioInputStream);
	      } catch (UnsupportedAudioFileException e) {
	    	  System.out.println("Audio file unsupported");
	    	  e.printStackTrace();
	      } catch (IOException e) {
	    	  System.out.println("io exception");
	    	  e.printStackTrace();
	      } catch (LineUnavailableException e) {
	    	  System.out.println("line unavailable exception");
	    	  e.printStackTrace();
	      }	
	}
	   // Play or Re-play the sound effect from the beginning, by rewinding.
	   public void play() {
	      if (volume != Volume.MUTE) {
	         if (clip.isRunning())
	            clip.stop();   // Stop the player if it is still running
	         clip.setFramePosition(0); // rewind to the beginning
	         clip.start();     // Start playing
	      }
	   }
//	   static void init() {
//		   values();
//	   }
}