package nju.edu.express.uiutil;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MyImg {

	final static String ImgDir = "resources/";
	final static String MainPanelDir = "mainpanel/";
	final static String ExpressPanelDir = "expresspanel/";
	final static String BusinessPanelDir = "businesspanel/";

	// 退出按钮
	public static int EXIT = 1;
	public static Image exitButton_normal = new ImageIcon(ImgDir + MainPanelDir
			+ "exitbutton_normal.png").getImage();
	public static Image exitButton_entered = new ImageIcon(ImgDir
			+ MainPanelDir + "exitbutton_entered.png").getImage();
	public static Image exitButton_pressed = new ImageIcon(ImgDir
			+ MainPanelDir + "exitbutton_pressed.png").getImage();

	// 主界面背景
	public static Image mainPanel_background = new ImageIcon(ImgDir
			+ MainPanelDir + "mainpanel_background.png").getImage();

	// 登录按钮
	public static int LOGIN = 2;
	public static Image loginButton_normal = new ImageIcon(ImgDir
			+ MainPanelDir + "loginbutton_normal.png").getImage();
	public static Image loginButton_entered = new ImageIcon(ImgDir
			+ MainPanelDir + "loginbutton_entered.png").getImage();
	public static Image loginButton_pressed = new ImageIcon(ImgDir
			+ MainPanelDir + "loginbutton_pressed.png").getImage();

	// 查询物流信息按钮
	public static int QUERY = 3;
	public static Image queryButton_normal = new ImageIcon(ImgDir
			+ MainPanelDir + "querybutton_normal.png").getImage();
	public static Image queryButton_entered = new ImageIcon(ImgDir
			+ MainPanelDir + "querybutton_entered.png").getImage();
	public static Image queryButton_pressed = new ImageIcon(ImgDir
			+ MainPanelDir + "querybutton_pressed.png").getImage();

	// 物流查询框
	public static Image queryTextField = new ImageIcon(ImgDir + MainPanelDir
			+ "logistics_textfield.png").getImage();

	// 物流查询背景
	public static Image logisticsPanel = new ImageIcon(ImgDir + MainPanelDir
			+ "logisticspanel_background.png").getImage();

	// 登录确认按钮
	public static int CONFIRM = 4;
	public static Image confirmButton_normal = new ImageIcon(ImgDir
			+ MainPanelDir + "confirmbutton_normal.png").getImage();
	public static Image confirmButton_entered = new ImageIcon(ImgDir
			+ MainPanelDir + "confirmbutton_entered.png").getImage();
	public static Image confirmButton_pressed = new ImageIcon(ImgDir
			+ MainPanelDir + "confirmbutton_pressed.png").getImage();

	// 记住用户名按钮
	public static Image rememberButton_normal = new ImageIcon(ImgDir
			+ MainPanelDir + "rememberbutton_normal.png").getImage();
	public static Image rememberButton_clicked = new ImageIcon(ImgDir
			+ MainPanelDir + "rememberbutton_clicked.png").getImage();

	// 登录界面背景
	public static Image signinPanel = new ImageIcon(ImgDir + MainPanelDir
			+ "signinpanel_background.png").getImage();

	// 快递员、营业厅业务员、中转中心业务员、仓库管理员、财务人员界面背景
	public static Image submainPanel_background = new ImageIcon(ImgDir
			+ ExpressPanelDir + "__main.png").getImage();

	// 订单输入按钮
	public static int REGISTER_ORDER = 5;
	public static Image registerOrderButton_normal = new ImageIcon(ImgDir
			+ ExpressPanelDir + "registerorderButton_normal.png").getImage();
	public static Image registerOrderButton_entered = new ImageIcon(ImgDir
			+ ExpressPanelDir + "registerorderButton_entered.png").getImage();
	public static Image registerOrderButton_pressed = new ImageIcon(ImgDir
			+ ExpressPanelDir + "registerorderButton_pressed.png").getImage();

	// 结束订单按钮
	public static int END_ORDER = 6;
	public static Image endOrderButton_normal = new ImageIcon(ImgDir
			+ ExpressPanelDir + "endorderButton_normal.png").getImage();
	public static Image endOrderButton_entered = new ImageIcon(ImgDir
			+ ExpressPanelDir + "endorderButton_entered.png").getImage();
	public static Image endOrderButton_pressed = new ImageIcon(ImgDir
			+ ExpressPanelDir + "endorderButton_pressed.png").getImage();

	// 注销按钮
	public static int UNREGISTER = 7;
	public static Image unRegisterButton_normal = new ImageIcon(ImgDir
			+ ExpressPanelDir + "unregisterButton_normal.png").getImage();
	public static Image unRegisterButton_entered = new ImageIcon(ImgDir
			+ ExpressPanelDir + "unregisterButton_entered.png").getImage();
	public static Image unRegisterButton_pressed = new ImageIcon(ImgDir
			+ ExpressPanelDir + "unregisterButton_pressed.png").getImage();

	// 快递员头像
	public static ImageIcon expressLogo = new ImageIcon(ImgDir
			+ ExpressPanelDir + "expressLogo.png");

	// 装车单管理按钮
	public static int Intrans = 8;
	public static Image intransButton_normal = new ImageIcon(ImgDir
			+ BusinessPanelDir + "intransButton_normal").getImage();
	public static Image intransButton_entered = new ImageIcon(ImgDir
			+ BusinessPanelDir + "intransButton_entered").getImage();
	public static Image intransButton_pressed = new ImageIcon(ImgDir
			+ BusinessPanelDir + "intransButton_pressed").getImage();

	// 车辆管理按钮
	public static int CAR_MANAGE = 9;
	public static Image carManageButton_normal = new ImageIcon(ImgDir
			+ BusinessPanelDir + "carmanageButton_normal").getImage();
	public static Image carManageButton_entered = new ImageIcon(ImgDir
			+ BusinessPanelDir + "carmanageButton_entered").getImage();
	public static Image carManageButton_pressed = new ImageIcon(ImgDir
			+ BusinessPanelDir + "carmanageButton_pressed").getImage();

	// 司机信息管理按钮
	public static int DRIVER = 10;
	public static Image dirverButton_normal = new ImageIcon(ImgDir
			+ BusinessPanelDir + "driverButton_normal").getImage();
	public static Image driverButton_entered = new ImageIcon(ImgDir
			+ BusinessPanelDir + "driverButton_entered").getImage();
	public static Image driverButton_pressed = new ImageIcon(ImgDir
			+ BusinessPanelDir + "driverButton_pressed").getImage();

}
