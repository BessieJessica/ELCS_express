package nju.edu.express.mainui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JTextArea;

import nju.edu.express.uiutil.ClearButton;
import nju.edu.express.uiutil.MyImg;
import nju.edu.express.uiutil.MyPanel;
import nju.edu.express.uiutil.SignInButton;

public class MainPanel extends MyPanel {

	/**
	 * mainPane组件
	 */
	JButton exitButton;
	JButton logisticsButton;
	JButton signInButton;
	JTextArea logisticsInfo;

	/**
	 * mainPanel构造函数
	 */
	public MainPanel() {
		init();
	}

	
	/**
	 * 初始化mainPanel，添加部件
	 */
	void init() {
		//退出键建立
		exitButton = new ClearButton(MyImg.LOGIN,55,44);
		exitButton.setBounds(670, 530, 55, 44);
		this.add(exitButton);
		
		//登录键建立
//		signInButton = new SignInButton(this);
//		signInButton.setBounds(670, 530, 60, 50);
//		this.add(signInButton);
		
		this.setLayout(null);
		
		
	}
	

	/**
	 * 获得物流信息界面,跳转至LogisticsPanel
	 */
	public void getLogistics() {

	}

	
	/**
	 * 登录，跳转至SigninPanel
	 */
	public void signIn() {
//		parent.signIn();
	}

	
	/**
	 * 重绘mainPanel
	 */
	@Override
	protected void paintComponent(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.drawImage(MyImg.mainPanel_background,0,0,883,590,this);
	}

}
