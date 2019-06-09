package Cardgame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

public class Listenner implements KeyListener{
	int count = 0;
	Drawmap d;
	public Listenner(Drawmap d) {
		this.d = d;
	}
	public void keyTyped(KeyEvent e) {
		count = 0;
	}
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		switch(code) {
		case 65:
			d.me.left = true;break;
		case 68:
			d.me.right = true;break;
		case 87:
			d.me.up = true;break;
		case 83:
			d.me.down = true;break;
		case 32:
			if(d.me.hit()) {
				new Cardjiemian(d.me);
			}
			break;
		}
	
	}
    public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		switch(code) {
		case 65:
			d.me.left = false;
			d.me.i = new ImageIcon("bin/ME.png");break;
		case 68:
			d.me.right = false;
			d.me.i = new ImageIcon("bin/ME.png");break;
		case 87:
			d.me.up = false;
			d.me.i = new ImageIcon("bin/ME.png");break;
		case 83:
			d.me.down = false;
			d.me.i = new ImageIcon("bin/ME.png");break;
		}
	
	}
		
	}


