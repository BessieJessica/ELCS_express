package nju.edu.express.mainui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import nju.edu.express.VO.LogisticsVO;
import nju.edu.express.logisticsbl.LogisticsBlImpl;
import nju.edu.express.logisticsui.LogisticsPanel;
import nju.edu.express.uiutil.ClearButton;
import nju.edu.express.uiutil.ClearLabel;
import nju.edu.express.uiutil.FrameTextField;
import nju.edu.express.uiutil.MyImg;

public class MainPanel extends JPanel implements Runnable {

	JButton exitButton;
	JButton queryButton;
	JButton loginButton;
	JTextField logisticsInfo;
	ClearLabel errInfo;
	LogisticsPanel logisticsPanel;
	Thread t;
	int threadMark;

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

		// 退出键建立
		exitButton = new ClearButton(MyImg.EXIT, 61, 47);
		exitButton.setBounds(737, 492, 61, 47);
		this.add(exitButton);

		// 登录键建立
		loginButton = new ClearButton(MyImg.LOGIN, 64, 50);
		loginButton.setBounds(737, 431, 64, 50);
		this.add(loginButton);

		// 查询物流信息键建立
		queryButton = new ClearButton(MyImg.QUERY, 63, 50);
		queryButton.setBounds(589, 436, 63, 50);
		this.add(queryButton);

		// 查询框建立
		logisticsInfo = new FrameTextField(571, 45);
		logisticsInfo.setBounds(74, 372, 571, 45);
		this.add(logisticsInfo);

		// 查询错误信息建立
		errInfo = new ClearLabel("");
		errInfo.setBounds(74, 418, 500, 30);
		this.add(errInfo);

		// 物流信息查询界面建立
		logisticsPanel = new LogisticsPanel();
		this.add(logisticsPanel);

		// 设置绝对布局
		this.setLayout(null);

	}

	/**
	 * 重绘mainPanel
	 */
	@Override
	protected void paintComponent(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g2d.drawImage(MyImg.mainPanel_background, 0, 0, 1169, 762, this);
	}

	@Override
	public void run() {
		
		if(threadMark==1){//输入订单有误时的抖动
			double i = 1;
			while(i<7)
			{
				logisticsInfo.setBounds((int) (74+Math.pow(-1, i)*3), 372, 571, 45);
				try {
					t.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
				this.repaint();
				MainFrame.getInstance().repaint();
			}

		}
		else if(threadMark==2){//滑入物流面板
			int i = 0;
			while(i<=182){
				logisticsPanel.setBounds(-729+i*4, 0, 729, 762);
				i++;
				try {
					t.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				MainFrame.getInstance().repaint();
			}
		}
		else if(threadMark==3){//物流面板滑回
			int i = 0;
			while(i<=182){
				logisticsPanel.setBounds(-i*4, 0, 729, 762);
				i++;
				try {
					t.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				MainFrame.getInstance().repaint();
			}
			logisticsInfo.setVisible(true);
			queryButton.setVisible(true);
		}

	}

	public void query() {
		
		LogisticsBlImpl logistics = new LogisticsBlImpl();
		LogisticsVO logisticsVO = logistics.getLogistics(logisticsInfo.getText());
		t = new Thread(this);
		//订单号输入错误
		if(logisticsVO==null){
			
			errInfo.setText("输入订单号有误，请重新输入。");
			threadMark = 1;
			t.start();
			logisticsInfo.setText("");
		}
		else{
			threadMark = 2;
			errInfo.setText("");
			logisticsInfo.setVisible(false);
			queryButton.setVisible(false);
			t.start();
		}
		
	}
	
	public void back(){
		threadMark = 3;
		t = new Thread(this);
		t.start();
	}

}
