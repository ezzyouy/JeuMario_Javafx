package com.objet;

import javax.swing.ImageIcon;
import java.awt.Image;

public class TuyauRouge extends Objet{


	public TuyauRouge( int x, int y) {
		super( x, y, 43, 65);
		this.icoObjet=new ImageIcon(getClass().getResource("/images/tuyauRouge.png"));
		super.imgObjet=this.icoObjet.getImage();
	}
	
}
