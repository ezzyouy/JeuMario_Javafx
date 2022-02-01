package com.objet;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bloc extends Objet {
	//constructor
	public Bloc( int x, int y) {
		super( x, y, 30, 30);
		super.icoObjet=new ImageIcon(getClass().getResource("/images/bloc.png"));
		super.imgObjet=this.icoObjet.getImage();
	}
	//Methode
	
	
}
