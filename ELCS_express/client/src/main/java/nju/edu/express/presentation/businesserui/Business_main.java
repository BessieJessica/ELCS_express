package nju.edu.express.presentation.businesserui;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import nju.edu.express.VO.UserVO;
import nju.edu.express.uiutil.ClearButton;
import nju.edu.express.uiutil.ClearLabel;
import nju.edu.express.uiutil.MyImg;

public class Business_main extends JPanel implements MouseListener {

	ClearButton intransManageButton, driverManageButton, carManageButton, expressHandleButton, unregisterButton;
	JLabel idLabel, cityLabel, businessLabel, accessLabel,logoLabel;
	String id, city, business, access;
	public Business_main(UserVO vo) {
		id = vo.getUserID();
		business = vo.getBusiness();
		city = vo.getCity();
		access = vo.getAccess().getName();
		init();
	}
	
	private void init() {
		setLayout(null);
		setOpaque(false);
		addMouseListener(this);
		
		intransManageButton=new ClearButton(MyImg.INTRANS,204,45);
		intransManageButton.setBounds(71,230,204,45);
		add(intransManageButton);
		
		carManageButton =new ClearButton(MyImg.CAR_MANAGE, 223, 45);
		carManageButton.setBounds(72,297,223,45);
		add(carManageButton);
		
		driverManageButton=new ClearButton(MyImg.DRIVER,220,45);
		driverManageButton.setBounds(76,368,220,45);
		add(driverManageButton);
		
		expressHandleButton=new ClearButton(MyImg.EXPRESS_HANDLE,199,45);
		expressHandleButton.setBounds(74,434,199,45);
		add(expressHandleButton);
		
		unregisterButton=new ClearButton(MyImg.UNREGISTER,125,45);
		unregisterButton.setBounds(74,510,125,45);
		add(unregisterButton);
		
		logoLabel=new JLabel(MyImg.businesserLogo);
		logoLabel.setBounds(428,230,135,135);
		add(logoLabel);
	}

	/**
	 * 获得车辆列表，显示CarListPanel
	 */
	public void getCarList(){
		
	}
	
	
	
	/**
	 * 获得司机列表，显示DriverListPanel
	 */
	public void getDriverList(){
		
	}
	
	
	
	/**
	 * 获得营业厅装车单列表，显示InTransListPanel
	 */
	public void getInTransList(){
		
	}
	
	
	
	/**
	 * 获得营业厅到达单列表，显示InArrivalListPanel
	 */
	public void getInArrivalList(){
		
	}
	
	
	
	/**
	 * 获得收款单列表，显示BalanceListPanel
	 */
	public void getBalanceList(){
		
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
