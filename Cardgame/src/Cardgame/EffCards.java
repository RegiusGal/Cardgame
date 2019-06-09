package Cardgame;
//Characters为我方角色属性存储的类
//Enemy为为敌方对战中的角色属性存储的类
public class EffCards {
	public static int Effcardnumber= 10;//the total number of the EffCards
	public static void EffCard1(Characters me,Enemys you) {
		me.Atk*=1.5;
		me.Def*=0.8;
	}
	public static void EffCard2(Characters me,Enemys you) {
		me.Atk*=1.2;
		you.Atk*=1.2;
	}
	public static void EffCard3(Characters me,Enemys you) {
		you.Atk*=0.8;
		you.Def*=1.2;
	}
	public static void EffCard4(Characters me,Enemys you) {
		me.Def*=0.8;
		you.Def*=0.5;
	}
	public static void EffCard5(Characters me,Enemys you) {
		me.Atk*=1.2;
	}
	public static void EffCard6(Characters me,Enemys you) {
		me.Def*=1.3;
	}
	public static void EffCard7(Characters me,Enemys you) {
		me.Def*=1.5;
		me.bleed*=0.9;
	}
	public static void EffCard8(Characters me,Enemys you) {
		you.Atk*=2;
		you.Def = 1;
	}
	public static void EffCard9(Characters me,Enemys you) {
		me.Atk+=50;
		me.bleed+=50;
		me.Def+=50;
		you.Atk+=50;
		you.bleed+=50;
		you.Def+=50;
		int hurt = 0;
		hurt = me.Atk/10;
		you.bleed-=hurt;
	}
	public static void EffCard10(Characters me,Enemys you) {
		you.Def*=0.8;
	}
}
