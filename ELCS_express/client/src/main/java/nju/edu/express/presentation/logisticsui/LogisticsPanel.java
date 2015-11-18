package nju.edu.express.presentation.logisticsui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import nju.edu.express.VO.LogisticsVO;
import nju.edu.express.presentation.mainui.MainPanel;
import nju.edu.express.uiutil.MyImg;

public class LogisticsPanel extends JPanel implements MouseListener {

	JLabel head;
	JTextArea content;

	public LogisticsPanel() {
		init();

	}

	private void init() {
		setLayout(null);
		setOpaque(false);
		addMouseListener(this);

		head = new JLabel();
		head.setFont(new Font("微软雅黑", Font.BOLD, 28));
		head.setBounds(181, 80, 240, 32);
		add(head);
		
		content = new JTextArea();
		content.setOpaque(false);
		content.setEditable(false);
		content.setFont(new Font("微软雅黑",Font.PLAIN , 21));
		content.setBounds(92, 200, 573, 600);
		add(content);

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getX() >= 664 && e.getX() <= 704) {
			MainPanel mainPanel = (MainPanel) this.getParent();
			mainPanel.logisticsPanelBack();
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

	public void setHead(String orderID) {
		head.setText(orderID);
	}

	public void setContent(LogisticsVO[] logisticsVO) {
		String tempContent = "";
		for (int i = 0; i < logisticsVO.length; i++) {//向面板内容中载入数据
			tempContent += logisticsVO[i].getTime() + "\n";
			tempContent += logisticsVO[i].getExpressInfo() + " "
					+ "    联系电话： "+logisticsVO[i].getContact() + "\n \n";
		}
		content.setText(tempContent);
	}
}
