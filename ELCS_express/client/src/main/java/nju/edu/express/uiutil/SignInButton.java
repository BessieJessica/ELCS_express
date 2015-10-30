package nju.edu.express.uiutil;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import nju.edu.express.mainui.MainPanel;

public class SignInButton extends JButton implements MouseListener{

	//登录按钮属性
	MainPanel parent;
	Image signInImg = MyImg.loginButton_normal;
	
	public SignInButton(MainPanel parent){
		this.parent = parent;
		init();
	}
	
	void init(){
		this.setOpaque(false);
		this.setBorderPainted(false);
		addMouseListener(this);
	}

	
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.drawImage(signInImg, 0, 0, 50, 40, this);
	}

	/**
	 * 登录键监听
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		parent.signIn();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		signInImg = MyImg.loginButton_pressed;
		this.repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		signInImg = MyImg.loginButton_entered;
		this.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		signInImg = MyImg.loginButton_entered;
		this.repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		signInImg = MyImg.loginButton_normal;
		this.repaint();
		
	}
	
}
