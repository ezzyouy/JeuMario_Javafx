package com.game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.audio.Audio;

public class Clavier implements KeyListener {


	@Override
	public void keyPressed(KeyEvent e) {
		if(Main.scene.mario.isVivant() == true) {
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){ // flËche droite
			   
	        	if(Main.scene.getxPos() == -1){ 
	        		Main.scene.setxPos(0);     // RÈinitialisation de setxPos
	        		Main.scene.setxFond(-50); // RÈinitialisation de xFond1
	        		Main.scene.setxFond1(750); // RÈinitialisation de xFond2
	        	}
	        	Main.scene.mario.setMarche(true);
	        	Main.scene.mario.setVersDroite(true);
				Main.scene.setDx(1);  // DÈplacement du fond vers la gauche lors de l'appui sur la touche "flËche droite"
				
			}else if(e.getKeyCode() == KeyEvent.VK_LEFT){ // flËche gauche
	
				if(Main.scene.getxPos() == 4431){ 
	        		Main.scene.setxPos(4430);
	        		Main.scene.setxFond(-50);
	        		Main.scene.setxFond1(750);
				}
				Main.scene.mario.setMarche(true);
	        	Main.scene.mario.setVersDroite(false);
				Main.scene.setDx(-1); // DÈplacement du fond vers la droite lors de l'appui sur la touche "flËche gauche"
				}
			// mario saute
	        if(e.getKeyCode() == KeyEvent.VK_SPACE){      	
	        	Main.scene.mario.setSaut(true); 
	        	Audio.playSound("/audio/saut.wav");
	        }
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setMarche(false);
		Main.scene.setDx(0);// Remise ‡ 0 de la variable dx de la l'objet scene 
		}                   // lors du rel‚chement des touches
	                                                           
	@Override
	public void keyTyped(KeyEvent e) {}

}
