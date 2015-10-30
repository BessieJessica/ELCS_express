package nju.edu.express.uiutil;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import nju.edu.express.mainui.MainFrame;
import nju.edu.express.mainui.MainPanel;

public class ClearButton extends JButton implements MouseListener {
	
	/**
	 * 按钮属性
	 */
	Image img;
	int imgInfo;
	int width,height;
	
	
	/**
	 * 初始化<透明按钮>
	 * @param imgInfo 按钮名称（利用MyImg的静态常量表示）
	 * @param width 按钮宽度
	 * @param height 按钮高度
	 */
	public ClearButton(int imgInfo,int width,int height){
		this.imgInfo = imgInfo;
		this.width = width;
		this.height = height;
		changeCondition(imgInfo, "normal");
		init();
	}
	
	
	public void init(){
		this.setOpaque(false);
		this.setBorderPainted(false);
		addMouseListener(this);
	}
	
	/**
	 * 重新绘制退出按钮
	 */
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.drawImage(img, 0, 0, width, height, this);
		
	}
	
	

	
	/**
	 * 退出键监听
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		MainFrame.mainFrame.exit();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		changeCondition(imgInfo, "pressed");
		this.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		changeCondition(imgInfo, "entered");
		this.repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		changeCondition(imgInfo, "normal");
		this.repaint();
	}
	
	
	private void changeCondition(int info,String condition){
		if(info == MyImg.EXIT){
			if(condition.equals("pressed"))
				img = MyImg.exitButton_pressed;
			if(condition.equals("entered"))
				img = MyImg.exitButton_entered;
			if(condition.equals("normal"))
				img = MyImg.exitButton_normal;
		}
			
		if(info == MyImg.LOGIN){
			if(condition.equals("pressed"))
				img = MyImg.loginButton_pressed;
			if(condition.equals("entered"))
				img = MyImg.loginButton_entered;
			if(condition.equals("normal"))
				img = MyImg.loginButton_normal;
		}
			
		
	}

}
