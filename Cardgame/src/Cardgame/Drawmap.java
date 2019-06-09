package Cardgame;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Drawmap extends JFrame{		
		ImageIcon i;
		final int back_hight = 3366;
		final int width = 1800,hight = 1000;
		//µÐÈËÈÝÆ÷
		public ArrayList<Enemy> enemy = new ArrayList<Enemy>();
		ImageIcon back = new ImageIcon("bin/BEIJING.png");
		int backy = 0;
		Characters me = new Characters(this);
	    public Drawmap(ImageIcon juese){
			Listenner my = new Listenner(this);
	    	this.i = juese;
	    	this.setTitle("Card Game");
			this.setSize(width,hight);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.addKeyListener(my);
			
			for(int j = 0;j<=12;j++) {
	    		Enemy e = new Enemy();
	    		enemy.add(e);
	    	}
			new Thread(){
				public void run() {
				while(true) {
					repaint();
					try {
						Thread.sleep(10);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				}
			}.start();
			
			try {
				URL url;
			    File f = new File("c:\\1.mp3");
			    AudioClip music;
				url = f.toURL();
				music = Applet.newAudioClip(url);
				music.play();	
				music.loop();
				

			}catch(MalformedURLException e) {
				
				e.printStackTrace();
			}
	    }

	 
	    public void paint(Graphics g) {
	    	
	    	BufferedImage b = (BufferedImage)this.createImage(this.getSize().width, this.getSize().height);
	    	Graphics g1 = b.getGraphics();
	    	
	    	g1.drawImage(back.getImage(),0,hight-back_hight+backy,null);
	    	for(int j = 0;j<=8;j++) {
	    		Enemy e =enemy.get(j);
	    		if(!me.hit())
	    			e.i = new ImageIcon("bin/ENEMY.png");
		    	g1.drawImage(e.i.getImage(), e.x, e.y,null);
	    	}
	    	g1.drawImage(me.i.getImage(),me.x,me.y,me.width,me.hight, null);
	    	g.drawImage(b, 0, 0, this);

	    }

}
