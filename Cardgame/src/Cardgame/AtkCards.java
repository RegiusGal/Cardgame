package Cardgame;
//Characters为我方角色属性存储的类
//Enemy为为敌方对战中的角色属性存储的类
public class AtkCards {
	public static int Atkcardnumber= 10;//the total number of the AtkCards
	public static void AtkCard1(Characters me,Enemys you) {
		int hurt = 0;
		hurt = me.Atk * 1 - you.Def / 2;
		if(hurt < 0) {
			hurt = 0;
		}
		you.Def -=hurt /10;
		you.bleed  -= hurt;
	}
	public static void AtkCard2(Characters me,Enemys you) {
		int hurt = 0;
		hurt = me.bleed / 2- you.Def / 2;
		if(hurt < 0) {
			hurt = 0;
		}
		me.bleed -=hurt/5; 
		you.bleed  -= hurt;
	}
	public static void AtkCard3(Characters me,Enemys you) {
		int hurt = 0;
		hurt = (int) (me.Atk * 1.2);
		if(hurt < 0) {
			hurt = 0;
		}
		me.Atk =(int) (me.Atk*0.9);
		you.bleed  -= hurt;
	}
	public static void AtkCard4(Characters me,Enemys you) {
		int hurt = 0;
		hurt =  (int) (me.Def *0.8- you.Def / 2);
		if(hurt < 0) {
			hurt = 0;
		}
		me.Def = (int) (me.Def*0.9);
		you.bleed -=hurt;
	}
	public static void AtkCard5(Characters me,Enemys you) {
		int hurt = 0;
		hurt = you.bleed / 5+me.Atk / 2- you.Def / 2;
		if(hurt < 0) {
			hurt = 0;
		}
		you.Def = (int) (you.Def*1.1);
		you.bleed -=hurt;
	}
	public static void AtkCard6(Characters me,Enemys you) {
		int hurt = 0;
		hurt =me.Atk*2- you.Def / 2;
		if(hurt < 0) {
			hurt = 0;
		}
		me.bleed /=2;
		you.bleed -=hurt;
	}
	public static void AtkCard7(Characters me,Enemys you) {
		int hurt = 0;
		hurt = me.Atk / 10- you.Def / 2;
		if(hurt < 0) {
			hurt = 0;
		}
	   you.Atk = (int) (you.Atk*0.8);
		you.bleed -= hurt;
	}
	public static void AtkCard8(Characters me,Enemys you) {
		int hurt = 0;
		hurt = (int) (me.Atk*1.5- you.Def / 2);
		if(hurt < 0) {
			hurt = 0;
		}
		me.Def /= 2;
		you.bleed-=hurt;
	}
	public static void AtkCard9(Characters me,Enemys you) {
		int hurt = 0;
		hurt = me.Atk*5- you.Def / 2;
		if(hurt < 0) {
			hurt = 0;
		}
		me.bleed = 1;
		you.bleed -= hurt;
	}
	public static void AtkCard10(Characters me,Enemys you) {
		int hurt = 0;
		hurt = me.Atk /2- you.Def / 2;
		if(hurt < 0) {
			hurt = 0;
		}
		me.bleed = (int) (me.bleed + hurt *0.8);
		you.bleed -= hurt;
	}
}