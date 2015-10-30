package nju.edu.express.mainui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
public class MainFrame extends JFrame {

	/**
	 * Panel面板
	 */
	MainPanel mainPanel;
	

	/**
	 * 单例模式
	 */
	private MainFrame() {
		init();
	}
	
	public static final MainFrame mainFrame = new MainFrame();
	
	public static MainFrame getInstance(){
		return mainFrame;
	}

	
	/**
	 * 初始化Frame，显示MainPanel
	 */
	void init() {
		mainPanel = new MainPanel();
		this.setUndecorated(true);

		//主界面显示居中
		Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int) (scrSize.getWidth() - 883) / 2,
				(int) (scrSize.getHeight() - 590) / 2, 883, 590);

		//添加初始组件
		this.add(mainPanel);
		this.setVisible(true);
	}


	/**
	 * 退出
	 */
	public void exit() {
		System.exit(0);
	}
	
	/**
	 * 登录，跳转至SignInPanel
	 */
	public void signIn(){
//		SignInPanel signInPanel = new SignInPanel(this);
//		this.remove(mainPanel);
//		this.add(signInPanel)  ;
//		repaint();
	}
}
