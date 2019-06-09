package Cardgame;

public class CardDiscription {
/*
                      AtkCards
*/
	static String AtkCard1Discription(int num) {
		if(num==1) {
		String Discription1 = "造成我方攻击力100%,并减少敌方与";
		return Discription1;
		}
		else {
			String d2 = "受到伤害的10%护甲";
			return d2;
		}
	}
	static String AtkCard2Discription(int num) {
		if(num==1) {
		String Discription = "造成我方现有血量一半的伤";
		return Discription;
		}
		else {
			String d2 = "害,并对我方造成20%的伤害";
			return d2;
		}
	}
	static String AtkCard3Discription(int num) {
		if(num==1) {
		String Discription = "造成我方攻击力120%的";
		return Discription;
		}
		else {
			String d2 = "伤害,减少我方攻击力10%";
			return d2;
		}
	}
	static String AtkCard4Discription(int num) {
		if(num==1) {
		String Discription = "造成我方防御力80%的";
		return Discription;
		}
		else {
			String d2 = "伤害,减少我方10%防御";
			return d2;
		}
	}
	static String AtkCard5Discription(int num) {
		if(num==1) {
		String Discription = "造成造成敌方现有生命值20%的伤害,额外造成";
		return Discription;
		}
		else {
			String d2 = "我方攻击力50%的伤害,敌方防御增加10%";
			return d2;
		}
	}
	static String AtkCard6Discription(int num) {
		if(num==1) {
		String Discription = "造成我方攻击力200%的伤害,";
		return Discription;
		}
		else {
			String d2 = "我方受到现有血量一半的伤害";
			return d2;
		}
	}
	static String AtkCard7Discription(int num) {
		if(num==1) {
		String Discription = "造成我方攻击力10%的伤害,敌方攻击力下降20%";
		return Discription;
		}
		else {
			String d2 = "敌方攻击力下降20%";
			return d2;
		}
	}
	static String AtkCard8Discription(int num) {
		if(num==1) {
		String Discription = "造成我方攻击力150%的";
		return Discription;
		}
		else {
			String d2 = "伤害,我方防御下降50%";
			return d2;
		}
	}
	static String AtkCard9Discription(int num) {
		if(num==1) {
		String Discription = "造成我方攻击力500%的伤害,";
		return Discription;
		}
		else {
			String d2 = "我方生命值降为1点";
			return d2;
		}
	}
	static String AtkCard10Discription(int num) {
		if(num==1) {
		String Discription = "造成我方攻击力50%的伤害,";
		return Discription;
		}
		else {
			String d2 = "回复造成伤害80%的生命值";
			return d2;
		}
	}
/*
                   HealCards
*/
	static String HealCard1Discription(int num) {
		if(num==1) {
		String Discription = "增加我方现有生命30%的生命值";
		return Discription;
		}
		else {
			String d2 = "";
			return d2;
		}
	}
	static String HealCard2Discription(int num) {
		if(num==1) {
		String Discription = "增加我方100%防御力,并回复";
		return Discription;
		}
		else {
			String d2 = "10%生命值";
			return d2;
		}
	}
	static String HealCard3Discription(int num) {
		if(num==1) {
		String Discription = "回复我方攻击力20%生命,对敌方造成";
		return Discription;
		}
		else {
			String d2 = "我方攻击力50%的伤害";
			return d2;
		}
	}
	static String HealCard4Discription(int num) {
		if(num==1) {
		String Discription = "回复我方100%生命,降低";
		return Discription;
		}
		else {
			String d2 = "50%我方防御力";
			return d2;
		}
	}
	static String HealCard5Discription(int num) {
		if(num==1) {
		String Discription = "回复双方各自现有生命50%";
		return Discription;
		}
		else {
			String d2 = "";
			return d2;
		}
	}
	static String HealCard6Discription(int num) {
		if(num==1) {
		String Discription = "回复我方生命20%,增加";
		return Discription;
		}
		else {
			String d2 = "我方攻击力10%";
			return d2;
		}
	}
	static String HealCard7Discription(int num) {
		if(num==1) {
		String Discription = "降低我方防御20%,降低我方攻击20%,";
		return Discription;
		}
		else {
			String d2 = "回复数值总和等值的生命值";
			return d2;
		}
	}
	static String HealCard8Discription(int num) {
		if(num==1) {
		String Discription = "减少我方生命值80%,";
		return Discription;
		}
		else {
			String d2 = "增加同等数值攻击力";
			return d2;
		}
	}
	static String HealCard9Discription(int num) {
		if(num==1) {
		String Discription = "防御力降低为1,";
		return Discription;
		}
		else {
			String d2 = "回复200%对应数值";
			return d2;
		}
	}
	static String HealCard10Discription(int num) {
		if(num==1) {
		String Discription = "双方生命值都变为双方原生命值";
		return Discription;
		}
		else {
			String d2 = "之和的一半";
			return d2;
		}
	}
/*
              EffCards
*/	
	static String EffCard1Discription(int num) {
		if(num==1) {
		String Discription = "增加我方攻击力50%,降低";
		return Discription;
		}
		else {
			String d2 = "我方防御力20%";
			return d2;
		}
	}
	static String EffCard2Discription(int num) {
		if(num==1) {
		String Discription = "增加双方攻击力20%";
		return Discription;
		}
		else {
			String d2 = "";
			return d2;
		}
	}
	static String EffCard3Discription(int num) {
		if(num==1) {
		String Discription = "降低对方攻击力20%,上升";
		return Discription;
		}
		else {
			String d2 = "对方防御力20%";
			return d2;
		}
	}
	static String EffCard4Discription(int num) {
		if(num==1) {
		String Discription = "降低对方防御力50%,降低";
		return Discription;
		}
		else {
			String d2 = "我方防御力20%";
			return d2;
		}
	}
	static String EffCard5Discription(int num) {
		if(num==1) {
		String Discription = "增加我方攻击力20%";
		return Discription;
		}
		else {
			String d2 = "";
			return d2;
		}
	}
	static String EffCard6Discription(int num) {
		if(num==1) {
		String Discription = "增加我方防御力30%";
		return Discription;
		}
		else {
			String d2 = "";
			return d2;
		}
	}
	static String EffCard7Discription(int num) {
		if(num==1) {
		String Discription = "增加我方防御力50%,减少我方生命值10%";
		return Discription;
		}
		else {
			String d2 = "";
			return d2;
		}
	}
	static String EffCard8Discription(int num) {
		if(num==1) {
		String Discription = "增加敌方攻击力100%,敌方防御力变为1";
		return Discription;
		}
		else {
			String d2 = "";
			return d2;
		}
	}
	static String EffCard9Discription(int num) {
		if(num==1) {
		String Discription = "双方所有属性增加50点,之后我方";
		return Discription;
		}
		else {
			String d2 = "对敌方造成攻击力10%穿透伤害";
			return d2;
		}
	}
	static String EffCard10Discription(int num) {
		if(num==1) {
		String Discription = "敌方防御降低20%";
		return Discription;
		}
		else {
			String d2 = "";
			return d2;
		}
	}
}
