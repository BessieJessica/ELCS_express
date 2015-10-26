package nju.edu.express.driver;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Logistics {
	JFrame mainFrame = new JFrame();
	String imageDir = "resources/";
	Image logoImage = new ImageIcon(imageDir + "ELCS.png").getImage();
	Image backGroundImage = new ImageIcon(imageDir + "NANJING.png").getImage();
	Image loginImage = new ImageIcon(imageDir + "login.png").getImage();
	Image logoutImage = new ImageIcon(imageDir + "logout.png").getImage();
	Image confirmImage = new ImageIcon(imageDir + "confirm.png").getImage();
	Image mouseOnConfirmImage = new ImageIcon(imageDir + "MouseOnConfirm.png")
			.getImage();

	JLabel logistics = new JLabel("物流信息查询");
	JLabel hint1 = new JLabel("订单号：");
	JTextField idField = new JTextField();
	JPanel jp;

	public Logistics() {
		init();
	}

	public void init() {

		mainFrame.setUndecorated(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp = new MyDrawPanel();
		jp.setLayout(null);

		final JButton login = new MyButton1();
		final JButton logout = new MyButton2();
		final JButton confirm = new MyButton3();

		Font font = new Font("微软雅黑", 1, 40);

		login.setBounds(690, 530, 50, 40);
		logout.setFont(font);
		logout.setBounds(760, 530, 50, 40);

		logistics.setFont(font);
		logistics.setForeground(Color.WHITE);
		logistics.setBounds(150, 160, 250, 40);

		Font font1 = new Font("微软雅黑", 1, 30);
		hint1.setFont(font1);
		hint1.setForeground(Color.WHITE);
		hint1.setBounds(150, 260, 150, 35);
		idField.setBounds(260, 260, 300, 40);
		confirm.setBounds(440, 350, 120, 40);

		confirm.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				// 鼠标点击事件

			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				// 鼠标进入事件
				confirmImage = new ImageIcon(imageDir + "MouseOnConfirm.png")
						.getImage();
				confirm.repaint();

			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				confirmImage = new ImageIcon(imageDir + "confirm.png")
						.getImage();
				confirm.repaint();

			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				confirmImage = new ImageIcon(imageDir + "MouseClickConfirm.png")
						.getImage();
				confirm.repaint();

			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				confirmImage = new ImageIcon(imageDir + "confirm.png")
						.getImage();
				confirm.repaint();

			}
		});

		login.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				loginImage = new ImageIcon(imageDir + "MouseOnLogin.png")
						.getImage();
				login.repaint();
				login.revalidate();
			}

			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				loginImage = new ImageIcon(imageDir + "login.png").getImage();
				login.repaint();
				login.revalidate();
			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				loginImage = new ImageIcon(imageDir + "MouseClickLogin.png")
						.getImage();
				login.repaint();
				login.revalidate();
			}

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				loginImage = new ImageIcon(imageDir + "login.png").getImage();
				login.repaint();
				login.revalidate();
			}

		});

		login.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				// 跳转公司人员登陆界面
			}

		});

		logout.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				logoutImage = new ImageIcon(imageDir + "MouseOnExit.png")
						.getImage();
				logout.repaint();
			}

			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				logoutImage = new ImageIcon(imageDir + "logout.png").getImage();
				logout.repaint();
			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				logoutImage = new ImageIcon(imageDir + "MouseClickExit.png")
						.getImage();
				logout.repaint();
			}

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				logoutImage = new ImageIcon(imageDir + "logout.png").getImage();
				logout.repaint();
			}

		});

		logout.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				// 退出界面
				System.exit(0);
			}

		});

		confirm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String orderID = idField.getText();
			}
		});

		jp.add(logistics);
		jp.add(login);
		jp.add(logout);
		jp.add(confirm);
		jp.add(idField);
		jp.add(hint1);
		mainFrame.getContentPane().add(jp);
		mainFrame.setSize(883, 590);
		mainFrame.setVisible(true);
	}

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {

			float alpha = 0.8f;
			((Graphics2D) g).setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_ATOP, alpha));
			g.drawImage(backGroundImage, 0, 0, 883, 590, this);

			((Graphics2D) g).setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_ATOP, alpha));
			g.drawImage(logoImage, 700, 30, 100, 30, this);

			((Graphics2D) g).setStroke(new BasicStroke(3.0f));
			g.setColor(Color.WHITE);
			g.drawLine(750, 528, 750, 568);

		}
	}

	class MyButton1 extends JButton {
		public void paintComponent(Graphics g) {
			float alpha = 0.8f;
			((Graphics2D) g).setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_ATOP, alpha));
			g.drawImage(loginImage, 0, 0, 50, 40, this);

		}
	}

	class MyButton2 extends JButton {
		public void paintComponent(Graphics g) {
			float alpha = 0.8f;
			((Graphics2D) g).setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_ATOP, alpha));
			g.drawImage(logoutImage, 0, 0, 50, 40, this);

		}
	}

	class MyButton3 extends JButton {
		public void paintComponent(Graphics g) {
			float alpha = 0.8f;
			((Graphics2D) g).setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_ATOP, alpha));
			g.drawImage(confirmImage, 0, 0, 100, 40, this);

		}
	}
}