package nju.edu.express.mainui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements Runnable {

	private MainPanel mainPanel;
	private Thread t;
	private int scrWidth, scrHeight;

	/**
	 * 单例模式
	 */
	private MainFrame() {
		init();
	}

	private static final MainFrame mainFrame = new MainFrame();

	public static MainFrame getInstance() {
		return mainFrame;
	}

	/**
	 * 初始化Frame，显示MainPanel
	 */
	void init() {
		// 添加mainPanel
		mainPanel = new MainPanel();

		// 设置Frame属性
		this.setUndecorated(true);
		this.setBackground(new Color(0, 0, 0, 0));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 主界面显示居中
		Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
		scrWidth = (int) scrSize.getWidth();
		scrHeight = (int) scrSize.getHeight();
		this.setBounds((int) (scrWidth - 1169) / 2,
				(int) (scrHeight - 762) / 2, 1169, 762);

		// 添加初始组件
		this.add(mainPanel);
		this.setVisible(true);
	}

	/**
	 * 退出
	 */
	public void exit() {
		t = new Thread(this);
		t.start();
	}

	/**
	 * 登录，跳转至SignInPanel
	 */
	public void login() {
		// SignInPanel signInPanel = new SignInPanel(this);
		// this.remove(mainPanel);
		// this.add(signInPanel) ;
		// repaint();
	}


	
	@Override
	public void run() {
		int width = 0,height = 0;
		while (width < 145) {
			mainPanel.setLocation(width*8+2, 0);
			width++;
			try {
				t.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.repaint();
		}
		
		while(height<95){
			mainPanel.setLocation(width*8+2,height*8);
			height++;
			try {
				t.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.repaint();
		}
		
		System.exit(0);
	}
}
