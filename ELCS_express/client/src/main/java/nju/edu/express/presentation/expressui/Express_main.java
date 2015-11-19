package nju.edu.express.presentation.expressui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.Element;
import javax.swing.text.IconView;

import nju.edu.express.VO.UserVO;
import nju.edu.express.uiutil.ClearButton;
import nju.edu.express.uiutil.MyImg;

public class Express_main extends JPanel implements MouseListener{

	ClearButton registerOrderButton, endOrderButton, unregisterButton;
	JLabel nameLabel, idLabel, businessLabel, cityLabel, accessLabel, logoLabel;
	String name, id, business, city, access;
	
	public Express_main(UserVO vo){
		name = vo.getName();
		id = vo.getUserID();
		business = vo.getBusiness();
		city = vo.getCity();
		access = vo.getAccess().getName();
		init();
	}
	
	private void init(){
		setLayout(null);
		setOpaque(false);
		addMouseListener(this);
		
		registerOrderButton = new ClearButton(MyImg.REGISTER_ORDER, 169, 47);
		registerOrderButton.setBounds(100, 0, 169, 47);
		add(registerOrderButton);
		
		endOrderButton = new ClearButton(MyImg.END_ORDER, 174, 44);
		endOrderButton.setBounds(100,50,174,44);
		add(endOrderButton);
		
		unregisterButton = new ClearButton(MyImg.UNREGISTER, 130, 47);
		unregisterButton.setBounds(100, 100, 130, 47);
		add(unregisterButton);
		
		nameLabel = new JLabel(name);
		nameLabel.setBounds(100,150,100,50);
		nameLabel.setFont(new Font("微软雅黑",Font.PLAIN,25));
		nameLabel.setForeground(Color.WHITE);
		add(nameLabel);
		
		idLabel = new JLabel(id);
		idLabel.setBounds(100,200,100,50);
		idLabel.setFont(new Font("微软雅黑",Font.PLAIN,25));
		add(idLabel);
		
		businessLabel = new JLabel(business);
		businessLabel.setBounds(100, 250, 500, 50);
		businessLabel.setFont(new Font("微软雅黑",Font.PLAIN,25));
		add(businessLabel);
		
		cityLabel = new JLabel(city);
		cityLabel.setBounds(100, 300, 200, 50);
		cityLabel.setFont(new Font("微软雅黑",Font.PLAIN,25));
		add(cityLabel);
		
		accessLabel = new JLabel(access);
		accessLabel.setBounds(100,350,200,50);
		accessLabel.setFont(new Font("微软雅黑",Font.PLAIN,25));
		add(accessLabel);
		
		logoLabel = new JLabel(MyImg.expressLogo);
		logoLabel.setBounds(100, 400, 200, 200);
		add(logoLabel);
		
		
		
	}
	
	
	/**
	 * 获得订单列表，显示OrderListPanel
	 */
	public void getOrderList(){
		
	}
	
	
	
	/**
	 * 获得新订单，显示NewOrderPanel
	 */
	public void addOrder(){
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(MyImg.submainPanel_background, 0, 0, 1169, 762, this);
	}
}
