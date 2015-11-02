package nju.edu.express.uiutil;

import java.awt.Image;

import javax.swing.ImageIcon;


public class MyImg {

	final static String ImgDir = "resources/";
	final static String MainPanelDir = "mainpanel/";

	//退出按钮
	public static int EXIT = 1;
	public static Image exitButton_normal = new ImageIcon(ImgDir+MainPanelDir+"exitbutton_normal.png").getImage();
	public static Image exitButton_entered = new ImageIcon(ImgDir+MainPanelDir+"exitbutton_entered.png").getImage();
	public static Image exitButton_pressed = new ImageIcon(ImgDir+MainPanelDir+"exitbutton_pressed.png").getImage();
	
	//主界面背景
	public static Image mainPanel_background = new ImageIcon(ImgDir+MainPanelDir+"mainpanel_background.png").getImage();
	
	//登录按钮
	public static int LOGIN = 2;
	public static Image loginButton_normal = new ImageIcon(ImgDir+MainPanelDir+"loginbutton_normal.png").getImage();
	public static Image loginButton_entered = new ImageIcon(ImgDir+MainPanelDir+"loginbutton_entered.png").getImage();
	public static Image loginButton_pressed = new ImageIcon(ImgDir+MainPanelDir+"loginbutton_pressed.png").getImage();
	
	//查询物流信息按钮
	public static int QUERY = 3;
	public static Image queryButton_normal = new ImageIcon(ImgDir+MainPanelDir+"querybutton_normal.png").getImage();
	public static Image queryButton_entered = new ImageIcon(ImgDir+MainPanelDir+"querybutton_entered.png").getImage();
	public static Image queryButton_pressed = new ImageIcon(ImgDir+MainPanelDir+"querybutton_pressed.png").getImage();
	
	//物流查询框
	public static Image queryTextField = new ImageIcon(ImgDir+MainPanelDir+"logistics_textfield.png").getImage();
	
	//物流查询背景
	public static Image logisticsPanel = new ImageIcon(ImgDir+MainPanelDir+"logisticspanel.png").getImage();
	
}
