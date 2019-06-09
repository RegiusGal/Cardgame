package Cardgame;

import javax.swing.ImageIcon;
import java.util.Random;

import java.awt.Rectangle;

import java.util.ArrayList;
public class Characters {
	Drawmap d;
	ImageIcon i = new ImageIcon("bin/ME.png");
	int temp = 0;
	int x = 900,y = 800;//角色初始位置
	int width = 32;
	int hight = 80;//角色大小
	int speedx = 7,speedy = 7;//角色速度
	int bleed = 50,enegy = 100,Atk = 25,Def = 10;//角色血量,蓝量
	int level = 1;//角色等级
	boolean left = false,right = false,up = false,down = false;
	public Characters(Drawmap d) {
		this.d = d;
		bleed += level*10;
		enegy += level*5;
		Atk += level;
		Def += level;
		//i = d.i;
	//在构造函数中启用线程
	new Thread(){
		public void run() {
			while(true) {
				if(left) {
					hit();
					if((x-speedx)>0) {
						x -= speedx;
						i = new ImageIcon("bin/LEFT.png");
					}
				}
				if(right) {
					hit();
					if((x+speedx)<d.width) {
						x += speedx;
						i = new ImageIcon("bin/RIGHT.png");
					}
				}
				if(up) {
					hit();
					if((y<d.hight&&y>d.hight/2)||d.backy>=(d.back_hight-d.hight)) {
						if(y-speedy>0) {
						y -= speedy;
						i = new ImageIcon("bin/up.png");
						}
					}
					if(d.backy<=(d.back_hight-d.hight)) {
					if(y<=d.hight/2) {
						d.backy +=speedy;
						for(int j=0;j<=8;j++) {
							Enemy e = d.enemy.get(j);
							e.y += speedy;
						}
					}
					}
				}
				if(down) {
					if((y>0&&y<d.hight/2)||(d.backy<=0)) {
						if(y+speedy<d.hight) {
						y += speedy;
						i = new ImageIcon("bin/DOWN.png");
						}
					}
					if(d.backy>=0) {
					if(y>=d.hight/2) {
						d.backy -= speedy;
						for(int j=0;j<=8;j++) {
							Enemy e = d.enemy.get(j);
							e.y -= speedy;
						}
					}
					}
				}
				try {
					Thread.sleep(20);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}

			}
			
		}
	}.start();
	
	}
	public boolean hit() {
		Rectangle rme = new Rectangle(this.x,this.y,this.width,this.hight);
		Rectangle renemy = null;
		for(int j=0;j<=8;j++) {
			renemy = new Rectangle(d.enemy.get(j).x,d.enemy.get(j).y,134,135);
			/*if(left)
			    renemy = new Rectangle(d.enemy.get(j).x+2,d.enemy.get(j).y,200,200);
			if(right)
				renemy = new Rectangle(d.enemy.get(j).x-2,d.enemy.get(j).y,200,200);
			if(up)
				renemy = new Rectangle(d.enemy.get(j).x+2,d.enemy.get(j).y+2,200,200);
			if(left)
				renemy = new Rectangle(d.enemy.get(j).x+2,d.enemy.get(j).y-2,200,200);*/
			if(rme.intersects(renemy)) {
				d.enemy.get(j).i = new ImageIcon("bin/ENEMY2.png");
				temp = j;
				return true;
			}
		}
		return false;	
	}
}
      class Enemy {
		ImageIcon i = new ImageIcon("bin/ENEMY.png");
    	  int x,y;
    	  public Enemy() {
    		  Random r = new Random();
    		  x = 100 + r.nextInt(1600);
    		  y = r.nextInt(3366) - 2266;
    	  }
      }
