package Cardgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.Timer;

public class Cardjiemian extends JFrame {
	Characters me;
	Enemys you = new Enemys();
	JLabel myblood,myenegy,e_blood,e_enegy,e_card1,e_card2,my,es,MY,ES;
	JButton over,cardone,cardtwo,cardthree;
	Changjing panel;
	Pcard p_ac = new Pcard();
	Pcard p_hc = new Pcard();
	Pcard p_ec = new Pcard();//卡牌内容显示面板
	JPanel p_e_c = new JPanel();
	JPanel i_enemy = new JPanel();
	JPanel pstatus = new JPanel();
	CardActionListener ca = new CardActionListener();
	EnemyActionListener ea = new EnemyActionListener();
	Timer timer = new Timer(3000,ea);
//各种面板组件，监听	
	Random r = new Random();
	int rand1 = 1 + r.nextInt(10);
	int rand2 = 1 + r.nextInt(10);
	int rand3 = 1 + r.nextInt(10);
	int erand = 1 + r.nextInt(10);
//随机数用于确定卡牌
	AtkCards ac = new AtkCards();
	HealCards hc = new HealCards();
	EffCards ec = new EffCards();
	EnemyCards e_c = new EnemyCards();
	CardDiscription despression = new CardDiscription();
//卡牌方法对象，用于调用卡牌
	boolean flag1 = false,flag2 = false,flag3 = false,eflag = false;
//按钮判断条件
	String text = "";
	String e_xue = "";
	String e_lan = "";
	String lanliang = "";
	String xueliang = "";
	//标签内容
	public Cardjiemian(Characters wo){
	this.me = wo;
	you.num = me.temp+1;
	you.datachange();
	panel = new Changjing();
	this.setTitle("Card Game");
	this.setSize(1800,1000);
	this.setVisible(true);
	//对角色赋值，设置窗口属性
	timer.setRepeats(false);
	timer.start();
	//计时器操作
	panel.setLayout(null);
	pstatus.setBounds(0,0,350,600);
	i_enemy.setBounds(400, 0, 10, 10);
	pstatus.setLayout(null);
	panel.add(pstatus);
	panel.add(i_enemy);
	//两个面板的关系，设置
	p_e_c.setLayout(null);
	panel.add(p_e_c);
	p_e_c.setBounds(1300, 0, 400, 400);
	e_card1 = new JLabel("");
	p_e_c.add(e_card1);
	e_card1.setBounds(0, 0, 400, 200);
	e_card2 = new JLabel("");
	p_e_c.add(e_card2);
	e_card2.setBounds(0, 200, 400, 200);
	//敌人卡牌
	e_xue = text + you.bleed;
	e_blood = new JLabel(e_xue);
	e_blood.setBounds(50, 120, you.bleed, 30);
	e_blood.setBorder(BorderFactory.createLineBorder(Color.black,2));
	e_blood.setOpaque(true);
	e_blood.setBackground(Color.red);
	//敌人血量 
	e_lan = text + you.enegy;
	e_enegy = new JLabel(e_lan);
	e_enegy.setBounds(50, 180, you.enegy, 30);
	e_enegy.setBorder(BorderFactory.createLineBorder(Color.black,2));
	e_enegy.setOpaque(true);
	e_enegy.setBackground(Color.blue);
	//敌人蓝量
	MY = new JLabel();
	MY.setBounds(50,370, 200, 30);
	ES = new JLabel();
	ES.setBounds(50, 70, 200, 30);
	my = new JLabel("我的状态");
	my.setBounds(50, 300, 100, 50);
	es = new JLabel("敌人状态");
	es.setBounds(50, 10, 100, 50);
	pstatus.add(MY);
	pstatus.add(ES);
	pstatus.add(my);
	pstatus.add(es);
	//
	xueliang = text + me.bleed;
	myblood = new JLabel(xueliang);
	myblood.setBounds(50, 450, me.bleed*2, 30);
	myblood.setBorder(BorderFactory.createLineBorder(Color.black,2));
	myblood.setOpaque(true);
	myblood.setBackground(Color.red);
	//血量图标
	
	lanliang = text + me.bleed;
	myenegy = new JLabel(lanliang);
	myenegy.setBounds(50, 520, me.enegy*2, 30);
	myenegy.setBorder(BorderFactory.createLineBorder(Color.black,2));
	myenegy.setOpaque(true);
	myenegy.setBackground(Color.blue);
	//蓝量图标
	pstatus.add(e_blood);
	pstatus.add(e_enegy);
	pstatus.add(myblood);
	pstatus.add(myenegy);
	
	//卡牌
	cardone = new JButton();
	cardone.add(p_ac);
	cardone.addActionListener(ca);
	panel.add(cardone);
	
	cardtwo = new JButton();
	cardtwo.add(p_ec);
	cardtwo.addActionListener(ca);
	panel.add(cardtwo);
	
	cardthree = new JButton();
	cardthree.add(p_hc);
	cardthree.addActionListener(ca);
	panel.add(cardthree);
	
	over = new JButton("OVER");
	over.addActionListener(ca);
	panel.add(over);
	//
	cardone.setBounds(450, 500,300 , 400);
	cardtwo.setBounds(850, 500,300 , 400);
	cardthree.setBounds(1250, 500,300 , 400);
	over.setBounds(1600, 700, 150, 90);
	//卡牌位置设定
	this.add(panel);
	//
	new Thread(){
		public void run() {
			boolean f = true;
		while(f) {
			if(me.bleed>0&&you.bleed>0) {
				if(me.enegy<30) {
					cardone.setEnabled(false);
				}
				else
					cardone.setEnabled(true);
				if(me.enegy<40) {
					cardtwo.setEnabled(false);
				}
				else
					cardtwo.setEnabled(true);
				if(me.enegy<20) {
					cardthree.setEnabled(false);
				}
				else
					cardthree.setEnabled(true);
			}
			else if(me.bleed<=0) {
				JOptionPane.showMessageDialog(null, "defeat","game is over",JOptionPane.PLAIN_MESSAGE);
				me.bleed = 50+me.level*10;
				me.enegy = 50+me.level*5;
				me.Atk = 25+me.level;
				me.Def = 5+me.level;
				f = false;
				dispose();
			}
			else if(you.bleed<=0) {
				me.level++;
				JOptionPane.showMessageDialog(null, "victory","game is over",JOptionPane.PLAIN_MESSAGE);
				me.bleed = 50+me.level*10;
				me.enegy = 100+me.level*5;
				me.Atk = 25+me.level;
				me.Def = 10+me.level;
				f = false;
				dispose();
			}
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}.start();
	//判定线程
	new Thread(){
		public void run() {
		while(true) {
			if(flag1) {
				flag1 = false;
				p_ac.lc1.setText("");
				p_ac.lc2.setText("");
				cardone.setEnabled(false);
			}
			if(flag2) {
				flag2 = false;
				p_ec.lc1.setText("");
				p_ec.lc2.setText("");
				cardtwo.setEnabled(false);
			}
			if(flag3) {
				flag3 = false;
				p_hc.lc1.setText("");
				p_hc.lc2.setText("");
				cardthree.setEnabled(false);
			}
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}.start();
	//按钮操作线程
	new Thread(){
		public void run() {
		while(true) {
			MY.setText("level: "+me.level+" "+"atk:"+me.Atk+" "+"def:"+me.Def);
			ES.setText("level: "+you.level+" "+"atk:"+you.Atk+" "+"def:"+you.Def);
			e_xue = text + you.bleed;
			e_blood.setText(e_xue);
			e_lan = text + you.enegy;
			e_enegy.setText(e_lan);
			e_blood.setBounds(50, 100, 100, 30);
			e_enegy.setBounds(50, 150, 100, 30);
			//蓝量，血量，敌人卡牌功能字符串设置
			xueliang = text + me.bleed;
			myblood.setText(xueliang);
			lanliang = text + me.enegy;
			myenegy.setText(lanliang);
			myblood.setBounds(50, 420, me.bleed, 30);
			myenegy.setBounds(50, 470, me.enegy, 30);
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}.start();
	//状态更新线程
	}
	class CardActionListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				if(e.getSource()==cardone) {
					me.enegy -= 30;
					usecard(rand1,e);
					flag1 = true;
					rand1 = 1 + r.nextInt(12);
				}
				else if(e.getSource()==cardtwo) {
					me.enegy -= 40;
					usecard(rand2,e);
					flag2 = true;
					rand2 = 1 + r.nextInt(12);
				}
				else if(e.getSource()==cardthree) {
					me.enegy -= 20;
					usecard(rand3,e);
					flag3 = true;
					rand3 = 1 + r.nextInt(12);
				}
				else if(e.getSource()==over) {
					eflag = true;
					flag1 = false;
					flag2 = false;
					flag3 = false;
					me.enegy += 20;
					erand = 1+r.nextInt(10);
					cardone.setEnabled(false);
					cardtwo.setEnabled(false);
					cardthree.setEnabled(false);
					over.setEnabled(false);
					timer.restart();
				}
				
			}
			public void usecard(int rand,ActionEvent e) {
				switch(rand) {
				case 1:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard1(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard1(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard1(me, you);
					}
					//调用卡牌方法一
					break;
				case 2:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard2(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard2(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard2(me, you);
					}
					break;
				case 3:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard3(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard3(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard3(me, you);
					}
					break;
				case 4:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard4(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard4(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard4(me, you);
					}
					break;
				case 5:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard5(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard5(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard5(me, you);
					}
					break;
				case 6:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard6(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard6(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard7(me, you);
					}
					break;
				case 7:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard7(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard7(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard7(me, you);
					}
					break;
				case 8:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard8(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard8(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard8(me, you);
					}
					break;
				case 9:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard9(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard9(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard9(me, you);
					}
					break;
				case 10:
					if(e.getSource()==cardone) {
						AtkCards.AtkCard10(me, you);
					}
					else if(e.getSource()==cardtwo) {
						EffCards.EffCard10(me, you);
					}
					else if(e.getSource()==cardthree) {
						HealCards.HealCard10(me, you);
					}
					break;
				}
			}
			 }
	class EnemyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			if(eflag) {
				enemycard(erand);
			}
			over.setEnabled(true);
			String r11 = surecard(rand1,1,1);
			String r21 = surecard(rand2,2,1);
			String r31 = surecard(rand3,3,1);
			String r12 = surecard(rand1,1,2);
			String r22 = surecard(rand2,2,2);
			String r32 = surecard(rand3,3,2);
			
			p_ac.lc1.setText(r11);
			p_ac.lc2.setText(r12);
			p_ec.lc1.setText(r21);
			p_ec.lc2.setText(r22);
			p_hc.lc1.setText(r31);
			p_hc.lc2.setText(r32);

			cardone.setEnabled(true);
			cardtwo.setEnabled(true);
			cardthree.setEnabled(true);
			timer.stop();

		}
		public void enemycard(int rand) {
			String str1 = "";
			String str2 = "";
			switch(rand) {
			case 1:
				str1 = EnemyCards.Card1(me, you, 1);
				str2 = EnemyCards.Card1(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
			case 2:
				str1 = EnemyCards.Card2(me, you, 1);
				str2 = EnemyCards.Card2(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
			case 3:
				str1 = EnemyCards.Card3(me, you, 1);
				str2 = EnemyCards.Card3(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
			case 4:
				str1 = EnemyCards.Card4(me, you, 1);
				str2 = EnemyCards.Card4(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
			case 5:
				str1 = EnemyCards.Card5(me, you, 1);
				str2 = EnemyCards.Card5(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
			case 6:
				str1 = EnemyCards.Card6(me, you, 1);
				str2 = EnemyCards.Card6(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
			case 7:
				str1 = EnemyCards.Card7(me, you, 1);
				str2 = EnemyCards.Card7(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
			case 8:
				str1 = EnemyCards.Card8(me, you, 1);
				str2 = EnemyCards.Card8(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
			case 9:
				str1 = EnemyCards.Card9(me, you, 1);
				str2 = EnemyCards.Card9(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
			case 10:
				str1 = EnemyCards.Card10(me, you, 1);
				str2 = EnemyCards.Card10(me, you, 2);
				e_card1.setText(str1);
				e_card2.setText(str2);
				break;
		}
		}
		public String surecard(int rand,int num,int num2) {
			String str = "";
			switch(rand) {
			case 1:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard1Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard1Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard1Discription(num2);break;
				}
				break;
			case 2:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard2Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard2Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard2Discription(num2);break;
				}
				break;
			case 3:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard3Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard3Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard3Discription(num2);break;
				}
				break;
			case 4:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard4Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard4Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard4Discription(num2);break;
				}
				break;
			case 5:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard5Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard5Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard5Discription(num2);break;
				}
				break;
			case 6:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard6Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard6Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard6Discription(num2);break;
				}
				break;
			case 7:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard7Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard7Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard7Discription(num2);break;
				}
				break;
			case 8:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard8Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard8Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard8Discription(num2);break;
				}
				break;
			case 9:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard9Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard9Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard9Discription(num2);break;
				}
				break;
			case 10:
				switch(num) {
				case 1:
					str = CardDiscription.AtkCard10Discription(num2);break;
				case 2:
					str = CardDiscription.EffCard10Discription(num2);break;
				case 3:
					str = CardDiscription.HealCard10Discription(num2);break;
				}
				break;
		}
			return  str;
		
	}

	}


  class Changjing extends JPanel{
	  ImageIcon i = new ImageIcon("bin/CHANGJING.jpg");
	  public void paintComponent(Graphics g) {
		  //super.paintComponent(g);
		  g.drawImage(i.getImage(), 0, 0, null);
		  g.drawImage(me.d.i.getImage(), 0, 600,300,400, null);
		  g.drawImage(you.i.getImage(), 500, 0,600,400, null);
	  }
  }
  class Pcard extends JPanel{
	  JLabel lc1,lc2;
	  public Pcard() {
		  this.setBounds(0, 0, 300, 400);
		  lc1 = new JLabel("");
		  lc2 = new JLabel("");
		  this.setLayout(null);
		  lc1.setBounds(0, 25, 280, 50);
		  lc2.setBounds(0, 75, 280, 50);
		  this.add(lc1);
		  this.add(lc2);
	  }
  }
}



