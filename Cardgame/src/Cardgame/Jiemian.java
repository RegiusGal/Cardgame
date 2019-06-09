package Cardgame;

import java.applet.AudioClip;
import java.io.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.Graphics;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;


public class Jiemian{
	JFrame jf = new JFrame();
	JFrame youxi = new JFrame();
	private ImageIcon juese;
	//各界面面板定义
	Charu1 p1 = new Charu1();
	Charu2 p2 = new Charu2();
	Charu3 p3 = new Charu3();
	Charu4 p4 = new Charu4();
	Charu5 p5 = new Charu5();
	JPanel p6 = new JPanel();
	JPanel cards = new JPanel();
	ImageIcon i = new ImageIcon("bin/ANNIU.png");
	ImageIcon i2 = new ImageIcon("bin/ANNIU2.png");
	private CardLayout cl;
    //主界面按钮定义
    JButton jb1 = new JButton("新的游戏",i);
    JButton jb2 = new JButton("读取存档",i);
    JButton jb3 = new JButton("游戏设置",i);
    JButton jb4 = new JButton("退出游戏",i);
    //角色选择按钮定义
    private JButton juese1,juese2,juese3,kai;
    Jue1 jue1 = new Jue1();
    Jue2 jue2 = new Jue2();
    Jue3 jue3 = new Jue3();
    //背景音乐定义
    /*URL url;
    File f = new File("c:\\The truth that you leave.mp3");
    AudioClip music;*/
	public Jiemian() {
		MyActionListener my = new MyActionListener();
		cards.setLayout(new CardLayout());
	    cards.add(p2,"c0");
	    cards.add(p3,"c1");
	    cards.add(p4,"c2");
	    cards.add(p5,"c3");
	    cards.add(p6,"c4");
	    cl = (CardLayout)(cards.getLayout());
	    cl.show(cards,"c0");
	    
	    //新的游戏界面组件添加
	    p3.setLayout(null);
	    juese1 = new JButton("角色一");
	    juese1.setBounds(160, 75, 85, 50);
	    juese2 = new JButton("角色二 ");
	    juese2.setBounds(370, 75, 85, 50);
	    juese3 = new JButton("角色三");
	    juese3.setBounds(570, 75, 85, 50);
	    kai = new JButton("开始游戏");
	    kai.setBounds(300, 600, 250, 50);
	    juese1.addActionListener(my);
	    juese2.addActionListener(my);
	    juese3.addActionListener(my);
	    kai.addActionListener(my);
	    p3.add(kai);
	    p3.add(juese1);
	    p3.add(juese2);
	    p3.add(juese3);
	    cards.add(jue1,"jue1");
	    cards.add(jue2,"jue2");
	    cards.add(jue3,"jue3");
	    
	    
	    //继续游戏界面组件添加
	    p4.setLayout(null);
	    JButton cun1 = new JButton("存档一");
	    cun1.setBounds(400, 75, 200, 75);
	    JButton cun2 = new JButton("存档二 ");
	    cun2.setBounds(400,275, 200, 75);
	    JButton cun3 = new JButton("存档三");
	    cun3.setBounds(400, 475, 200, 75);
	    p4.add(cun1);
	    p4.add(cun2);
	    p4.add(cun3);
	    
	    //游戏设置界面组件添加
	    p5.setLayout(null);
	    JButton s1 = new JButton("音效");
	    s1.setBounds(400, 75, 200, 75);
	    JButton s2 = new JButton("    ");
	    s2.setBounds(400,275, 200, 75);
	    JButton s3 = new JButton("   ");
	    s3.setBounds(400, 475, 200, 75);
	    p5.add(s1);
	    p5.add(s2);
	    p5.add(s3);
	    
	    //caidanyemian
		jb1.setVerticalTextPosition(SwingConstants.CENTER);
		jb1.setHorizontalTextPosition(SwingConstants.CENTER);
		jb1.setRolloverIcon(i2);
		jb1.addActionListener(my);
		
		jb2.setVerticalTextPosition(SwingConstants.CENTER);
		jb2.setHorizontalTextPosition(SwingConstants.CENTER);
		jb2.setRolloverIcon(i2);
		jb2.addActionListener(my);
		
		jb3.setVerticalTextPosition(SwingConstants.CENTER);
		jb3.setHorizontalTextPosition(SwingConstants.CENTER);
		jb3.setRolloverIcon(i2);
		jb3.addActionListener(my);
		
		jb4.setVerticalTextPosition(SwingConstants.CENTER);
		jb4.setHorizontalTextPosition(SwingConstants.CENTER);
		jb4.setRolloverIcon(i2);
		jb4.addActionListener(my);//菜单页面
		
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,0,70));
		p1.add(jb1);
		p1.add(jb2);
		p1.add(jb3);
		p1.add(jb4);
		
		
		JSplitPane js = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,false,p1,cards);
		js.setDividerLocation(250); 
		js.setOneTouchExpandable(false);
		js.setDividerSize(2);
		js.setEnabled(false);
		jf.add(js); 
	
		
		
		jf.setTitle("Card Game");
		jf.setSize(1200,800);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class Jue1 extends JPanel{
		ImageIcon ij1 = new ImageIcon("bin/JUE1.png");
		public ImageIcon fan() {
			return ij1;
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(ij1.getImage(), 0, 0,p2.getWidth(), p2.getHeight(), this);
			juese1.setBounds(160, 75, 85, 50);
			juese2.setBounds(370, 75, 85, 50);
			juese3.setBounds(570, 75, 85, 50);
			kai.setBounds(300, 600, 250, 50);
			jue1.add(kai);
		    jue1.add(juese1);
		    jue1.add(juese2);
		    jue1.add(juese3);
		}
	}
	class Jue2 extends JPanel{
		ImageIcon ij2 = new ImageIcon("bin/JUE2.png");
		public ImageIcon fan() {
			return ij2;
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(ij2.getImage(), 0, 0,p2.getWidth(), p2.getHeight(), this);
			juese1.setBounds(160, 75, 85, 50);
			juese2.setBounds(370, 75, 85, 50);
			juese3.setBounds(570, 75, 85, 50);
			kai.setBounds(300, 600, 250, 50);
			jue2.add(kai);
		    jue2.add(juese1);
		    jue2.add(juese2);
		    jue2.add(juese3);
		}
	}
	class Jue3 extends JPanel{
		ImageIcon ij3 = new ImageIcon("bin/JUE3.png");
		public ImageIcon fan() {
			return ij3;
		}
		public void paintComponent(Graphics g) {
			
			g.drawImage(ij3.getImage(), 0, 0,p2.getWidth(), p2.getHeight(), this);
			juese1.setBounds(160, 75, 85, 50);
			juese2.setBounds(370, 75, 85, 50);
			juese3.setBounds(570, 75, 85, 50);
			kai.setBounds(300, 600, 250, 50);
			jue3.add(kai);
		    jue3.add(juese1);
		    jue3.add(juese2);
		    jue3.add(juese3);
		}
	}
	class Charu1 extends JPanel{
		ImageIcon i3 = new ImageIcon("bin/BEIJING1.jpg");
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(i3.getImage(), 0, 0,p1.getWidth(), p1.getHeight(), this);
		}
	}
	class Charu2 extends JPanel{
		ImageIcon i4 = new ImageIcon("bin/BEIJING2.png");
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//下面这行是为了背景图片可以跟随窗口自行调整大小，可以自己设置成固定大小
			g.drawImage(i4.getImage(), 0, 0,p2.getWidth(), p2.getHeight(), this);
		}
	}
	class Charu3 extends JPanel{
		ImageIcon i5 = new ImageIcon("bin/BEIJING3.jpg");
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//下面这行是为了背景图片可以跟随窗口自行调整大小，可以自己设置成固定大小
			g.drawImage(i5.getImage(), 0, 0,p2.getWidth(), p2.getHeight(), this);
			juese1.setBounds(160, 75, 85, 50);
			juese2.setBounds(370, 75, 85, 50);
			juese3.setBounds(570, 75, 85, 50);
			kai.setBounds(300, 600, 250, 50);
		    p3.add(kai);
		    p3.add(juese1);
		    p3.add(juese2);
		    p3.add(juese3);
		}
	}
	class Charu4 extends JPanel{
		ImageIcon i6 = new ImageIcon("bin/BEIJING4.jpg");
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//下面这行是为了背景图片可以跟随窗口自行调整大小，可以自己设置成固定大小
			g.drawImage(i6.getImage(), 0, 0,p2.getWidth(), p2.getHeight(), this);
		}
	}
	class Charu5 extends JPanel{
		ImageIcon i7 = new ImageIcon("bin/BEIJING5.jpg");
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//下面这行是为了背景图片可以跟随窗口自行调整大小，可以自己设置成固定大小
			g.drawImage(i7.getImage(), 0, 0,p2.getWidth(), p2.getHeight(), this);
		}
	}
	class MyActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			if(e.getSource()==jb1) {
        		cl.show(cards,"c1");
        	}
        	else if(e.getSource()==jb2) {
        		cl.show(cards,"c2");
        	}
        	else if(e.getSource()==jb3) {
        		cl.show(cards,"c3");
        	}
        	else if(e.getSource()==jb4) {
        		System.exit(0);	
        	}
        	else if(e.getSource()==juese1) {
        		cl.show(cards,"jue1");
        		juese = jue1.fan();
        	}
        	else if(e.getSource()==juese2) {
        		cl.show(cards,"jue2");
        		juese = jue2.fan();
        	}
        	else if(e.getSource()==juese3) {
        		cl.show(cards,"jue3");
        		juese = jue3.fan();
        	}
        	else if(e.getSource()==kai) {
        		new Drawmap(juese);
        		jf.setVisible(false);
        	}
			

		
		
        
    }

}
}
