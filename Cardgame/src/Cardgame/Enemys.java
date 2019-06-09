package Cardgame;

import javax.swing.ImageIcon;

public class Enemys {
	ImageIcon i;
	int num;
	int bleed = 50,Def = 10,Atk = 20,enegy = 50,level = 1;
	int etr_b = 0,etr_d = 0,etr_a = 0;
	public void datachange() {
		level = num;
		switch(num) {
		case 1:
			i = new ImageIcon("bin/E1.jpg");
			etr_b = 10;
			break;
		case 2:
			i = new ImageIcon("bin/E2.png");
			etr_d = 5;
			break;
		case 3:
			i = new ImageIcon("bin/E3.png");
			etr_a = 7;
			break;
		case 4:
			i = new ImageIcon("bin/E4.jpg");
			etr_b = 20;
			break;
		case 5:
			i = new ImageIcon("bin/E5.jpg");
			etr_d = 7;
			break;
		case 6:
			i = new ImageIcon("bin/E6.jpg");
			etr_a = 10;
			break;
		case 7:
			i = new ImageIcon("bin/E7.jpg");
			etr_b = 20;
			etr_d = 7;
			break;
		case 8:
			i = new ImageIcon("bin/E8.png");
			etr_b = 20;
			etr_a = 10;
			break;
		case 9:
			i = new ImageIcon("bin/E9.jpg");
			etr_b = 20;
			etr_d = 7;
			etr_a = 10;
			break;
		}
		bleed = bleed+level*5+etr_b;
		Def = Def+level+etr_d;
		Atk = Atk+level+etr_a;

		}


}
