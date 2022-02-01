package com.audio;

import javax.sound.sampled.*;

public class Audio {

	private Clip clip;
	
	public Audio(String son) {
		
		try {
			AudioInputStream audio= AudioSystem.getAudioInputStream(getClass().getResource(son));
			clip= AudioSystem.getClip();
			clip.open(audio);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Clip getClip() {
		return clip;
	}

	public void play() {
		clip.start();	
	}
	
	public void stop() {
		clip.stop();	
	}
	
	public static void playSound(String son) {
		Audio s=new Audio(son);
		s.play();
	}
}
