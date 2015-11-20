package nju.edu.express.presentation.expressui;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import nju.edu.express.VO.UserVO;
import nju.edu.express.uiutil.ClearButton;
import nju.edu.express.uiutil.ClearLabel;
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
		
		nameLabel = new ClearLabel(name);
		nameLabel.setBounds(100,150,100,50);
		add(nameLabel);
		
		idLabel = new ClearLabel(id);
		idLabel.setBounds(100,200,100,50);
		add(idLabel);
		
		businessLabel = new ClearLabel(business);
		businessLabel.setBounds(100, 250, 500, 50);
		add(businessLabel);
		
		cityLabel = new ClearLabel(city);
		cityLabel.setBounds(100, 300, 200, 50);
		add(cityLabel);
		
		accessLabel = new ClearLabel(access);
		accessLabel.setBounds(100,350,200,50);
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
