package nju.edu.express.uiutil;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import nju.edu.express.presentation.mainui.MainFrame;
import nju.edu.express.presentation.mainui.MainPanel;
import nju.edu.express.presentation.signinui.SigninPanel;

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
		if(imgInfo==MyImg.EXIT)
			MainFrame.getInstance().exit();
		else if(imgInfo==MyImg.LOGIN){
			MainPanel mainPanel = (MainPanel) this.getParent();
			mainPanel.signin();
		}
		else if(imgInfo==MyImg.QUERY){
			MainPanel mainPanel = (MainPanel) this.getParent();
			mainPanel.query();
		}
		else if(imgInfo==MyImg.CONFIRM){
			SigninPanel signinPanel = (SigninPanel) this.getParent();
			signinPanel.checkSignin();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		changeCondition(imgInfo, "pressed");
		this.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		changeCondition(imgInfo, "entered");
		this.repaint();

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
		
		if(info == MyImg.QUERY){
			if(condition.equals("pressed"))
				img = MyImg.queryButton_pressed;
			if(condition.equals("entered"))
				img = MyImg.queryButton_entered;
			if(condition.equals("normal"))
				img = MyImg.queryButton_normal;
		}
		
		if(info == MyImg.CONFIRM){
			if(condition.equals("pressed"))
				img = MyImg.confirmButton_pressed;
			if(condition.equals("entered"))
				img = MyImg.confirmButton_entered;
			if(condition.equals("normal"))
				img = MyImg.confirmButton_normal;
		}
		
		if(info == MyImg.REGISTER_ORDER){
			if(condition.equals("pressed"))
				img = MyImg.endOrderButton_pressed;
			if(condition.equals("entered"))
				img = MyImg.endOrderButton_entered;
			if(condition.equals("normal"))
				img = MyImg.endOrderButton_normal;
		}
		
	}

}
