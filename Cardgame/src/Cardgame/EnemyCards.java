package Cardgame;

public class EnemyCards {
	public static int Enemycardnumber= 10;//the total number of the EnemyCards
	public static String Card1(Characters me,Enemys you,int num) {
		String discription0 = "敌方生命值增加";
		int heal = you.Atk/2;
		String discription = discription0 + heal;
		if(num==1) {
		return discription;
		}
		else {
			you.bleed += heal;
			String d2 = "";
			return d2;
		}		
	}
	public static String Card2(Characters me,Enemys you,int num) {
		String discription0 = "我方受到";
		String discription1 = "点伤害";
		int hurt = (int) (you.Atk *1.5 - me.Def /2);
		String discription = discription0 + hurt +discription1;
		if(num==1) {
			return discription;
			}
		else {
			if(hurt < 0) {
				hurt = 0;
			}
		    me.bleed -= hurt;
			String d2 = "";
			return d2;
		}
	}
	public static String Card3(Characters me,Enemys you,int num) {
		String discription0 = "敌方攻击力上升";
		int atk = you.Atk /2;
		String discription = discription0 + atk;
		if(num==1) {
			return discription;
			}
		else {
			you.Atk += atk;
			String d2 = "";
			return d2;
		}
	}
	public static String Card4(Characters me,Enemys you,int num) {
		String discription0 = "敌方生命值上升";
		String discription1 ="点,我方受到";
		String discription2 ="伤害,敌方防御力降为1点";
		
		int blood = you.bleed*5;
		int hurt = you.Atk;
		String discription = discription0+blood+discription1;
		if(num==1) {
			return discription;
			}
		else {
			you.bleed*=6;
			me.bleed-=hurt;
			you.Def =1;
			String d2 = "";
			d2 = d2+hurt+discription2;
			return d2;
		}
	}
	public static String Card5(Characters me,Enemys you,int num) {
		String discription0 = "敌方防御力上升";
		String discription1 = "点,敌方攻击力下降";
		String discription2 = "点";
		int def = you.Def;
		int atk = you.Atk/2;
		String discription = discription0+def;
		if(num==1) {
			return discription;
			}
		else {
			you.Def*=2;
			you.Atk/=2;
			String d2 = "";
			d2 = d2+discription1+atk+discription2;
			return d2;
		}
	}
	public static String Card6(Characters me,Enemys you,int num) {
		String discription0 = "我方受到";
		String discription1 = "点伤害,我方防御力下降";
		String discription2 = "点";
		int hurt = (int) (you.Atk*1.8 - me.Def/2);
		int def = you.Atk /10;
		if(def>me.Def) {
			def = me.Def;
		}
		String discription = discription0 + hurt;
		if(num==1) {
			return discription;
			}
		else {
			if (hurt < 0) {
				hurt = 0;
			}
			me.bleed-=hurt;
			me.Def-=def;
			String d2 = "";
			d2 = d2 + discription1 + def + discription2;
			return d2;
		}
	}
	public static String Card7(Characters me,Enemys you,int num) {
		String discription0 = "我方受到";
		String discription1 = "点伤害,敌方回复";
		String discription2 = "点生命值";
		int hurt = (int) (you.Atk*0.8 - me.Def/2);
		int heal = hurt + you.bleed/10;
		String discription = discription0+hurt;
		if(num==1) {
			return discription;
			}
		else {
			if(hurt < 0) {
				hurt = 0;
			}
			me.bleed -= hurt;
			you.bleed+=heal;
			String d2 = "";
			d2 = d2+discription1+heal+discription2;
			return d2;
		}
	}
	public static String Card8(Characters me,Enemys you,int num) {
		String discription0 = "敌方攻击力上升";
		String discription1 = "点,我方受到";
		String discription2 = "点伤害";
		int atk = me.Def/5;
		int hurt = you.Atk - me.Def/2;
		String discription = discription0+atk;
		if(num==1) {
			return discription;
			}
		else {
			you.Atk+=atk;
			me.bleed-=hurt;
			String d2 = "";
			d2 = d2+discription1+hurt+discription2;
			return d2;
		}
	}
	public static String Card9(Characters me,Enemys you,int num) {
		String discription0 = "敌方防御上升";
		String discription1 = "点";
		int def = you.Def;
		String discription = discription0 +def+discription1;
		if(num==1) {
			return discription;
			}
		else {
			you.Def*=2;
			String d2 = "";
			return d2;
		}
	}
	public static String Card10(Characters me,Enemys you,int num) {
		String discription0 = "我方受到";
		String discription1 = "点伤害";
		String discription2 = ",我方防御力上升";
		String discription3 = "点";
		int hurt = you.Atk *2;
		int def = me.Def/5;
		String discription = discription0 +hurt +discription1+discription2+def+discription3;
		if(num==1) {
			return discription;
			}
		else {
			me.bleed -= hurt;
			me.Def+=def;
			String d2 = "";
			d2 = d2+discription2+def+discription3;
			return d2;
		}
	}
}