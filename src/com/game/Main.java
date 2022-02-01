package com.game;

import javax.swing.JFrame;

public class Main {
	
	public static Scene scene;
	
	public static void main(String[] args) {
		
		
		//creation de la fenetre de l'application
		JFrame fenetre =new JFrame("Jeux style Mario");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(700,360);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		
		scene=new Scene();
		
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);
	}

}
