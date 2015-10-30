package nju.edu.express.uiutil;

import java.awt.Image;

import javax.swing.ImageIcon;


public class MyImg {

	final static String ImgDir = "resources/";

	//退出按钮
	public static int EXIT = 1;
	public static Image exitButton_normal = new ImageIcon(ImgDir+"exit_normal.png").getImage();
	public static Image exitButton_entered = new ImageIcon(ImgDir+"exit_entered.png").getImage();
	public static Image exitButton_pressed = new ImageIcon(ImgDir+"exit_pressed.png").getImage();
	
	//主界面背景
	public static Image mainPanel_background = new ImageIcon(ImgDir+"mainpanel_background.png").getImage();
	
	//登录按钮
	public static int LOGIN = 2;
	public static Image loginButton_normal = new ImageIcon(ImgDir+"login_normal.png").getImage();
	public static Image loginButton_entered = new ImageIcon(ImgDir+"login_entered.png").getImage();
	public static Image loginButton_pressed = new ImageIcon(ImgDir+"login_pressed.png").getImage();
	
	
}
