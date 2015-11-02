package nju.edu.express.logisticsui;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import nju.edu.express.mainui.MainPanel;
import nju.edu.express.uiutil.MyImg;

public class LogisticsPanel extends JPanel implements MouseListener{

	
	JLabel head;
	
	public LogisticsPanel() {
		init();

	}

	private void init() {
		setLayout(null);
		setOpaque(false);
		addMouseListener(this);
		
		head = new JLabel();
		head.setBounds(181, 80, 120, 32);
		this.add(head);
		
	}

	
	
	@Override
	public void mouseClicked(MouseEvent e) {

		if(e.getX()>=664&&e.getX()<=704){
			MainPanel mainPanel = (MainPanel) this.getParent();
			mainPanel.back();
		}
		
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
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		g.drawImage(MyImg.logisticsPanel, 0, 0, 729, 762, this);
	}
}
