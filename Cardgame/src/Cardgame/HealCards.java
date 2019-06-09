package Cardgame;
//Characters为我方角色属性存储的类
//Enemy为为敌方对战中的角色属性存储的类
public class HealCards {
	public static int Healcardnumber= 10;//the total number of the HealCards
	public static void HealCard1(Characters me,Enemys you) {
		int Heal = 0;
		Heal = (int) (me.bleed *0.3);
		me.bleed += Heal; 
	}
	public static void HealCard2(Characters me,Enemys you) {
		int Heal = 0;
		Heal = me.bleed /10;
		me.Def *=2;
		me.bleed += Heal; 
	}
	public static void HealCard3(Characters me,Enemys you) {
		int Heal = 0;
		Heal = me.Atk /5;
		you.bleed = you.bleed - me.Atk/2;
		me.bleed += Heal; 
	}
	public static void HealCard4(Characters me,Enemys you) {
		int Heal = 0;
		Heal = me.bleed*1;
		me.Def/=2;
		me.bleed += Heal; 
	}
	public static void HealCard5(Characters me,Enemys you) {
		int Heal = 0;
		Heal = me.bleed/2;
		you.bleed = (int) (you.bleed *1.5);
		me.bleed += Heal; 
	}
	public static void HealCard6(Characters me,Enemys you) {
		int Heal = 0;
		Heal = me.bleed/5;
		me.Atk =(int) (me.Atk *1.1);
		me.bleed += Heal; 
	}
	public static void HealCard7(Characters me,Enemys you) {
		int Heal = 0;
		Heal = me.Def/5+me.Atk/5;
		me.Def*=0.8;
		me.Atk*=0.8;
		me.bleed += Heal; 
	}
	public static void HealCard8(Characters me,Enemys you) {
		int hurt = 0;
		hurt = (int) (me.bleed * 0.8);
		you.bleed  -= hurt; 
		me.bleed /=5; 
	}
	public static void HealCard9(Characters me,Enemys you) {
		int Heal = 0;
		Heal = me.Def*2;
		me.Def = 1;
		me.bleed += Heal; 
	}
	public static void HealCard10(Characters me,Enemys you) {
		int Heal = 0;
		Heal = me.bleed + you.bleed;
		you.bleed = Heal /2;
		me.bleed = Heal/2; 
	}
}