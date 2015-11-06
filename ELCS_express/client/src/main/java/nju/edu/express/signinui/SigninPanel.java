package nju.edu.express.signinui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import nju.edu.express.enumdata.StuffAccess;
import nju.edu.express.mainui.MainFrame;
import nju.edu.express.mainui.MainPanel;
import nju.edu.express.signinbl.SigninBlImpl;
import nju.edu.express.uiutil.ClearButton;
import nju.edu.express.uiutil.FontHelper;
import nju.edu.express.uiutil.MyImg;

public class SigninPanel extends JPanel implements MouseListener, Runnable {

	JTextField userID;
	JPasswordField password;
	ClearButton confirmButton;
	JLabel signinInfo;
	Thread t;

	public SigninPanel() {
		 init();
	}

	private void init() {
		setLayout(null);
		setOpaque(false);
		addMouseListener(this);

		userID = new JTextField();
		userID.setOpaque(false);
		userID.setBorder(null);
		userID.setFont(new FontHelper(25).fetchFont("comfortaa"));
		userID.setBounds(227, 248, 250, 35);
		add(userID);

		password = new JPasswordField();
		password.setOpaque(false);
		password.setBorder(null);
		password.setBounds(227, 330, 250, 35);
		add(password);

		confirmButton = new ClearButton(MyImg.CONFIRM, 66, 49);
		confirmButton.setBounds(431, 513, 66, 49);
		add(confirmButton);
		
		signinInfo = new JLabel();
		signinInfo.setFont(new Font("微软雅黑",Font.PLAIN,15));
		signinInfo.setBounds(400, 555, 200, 50);
		add(signinInfo);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getX() >= 664 && e.getX() <= 704) {
			MainPanel mainPanel = (MainPanel) this.getParent();
			mainPanel.signinPanelBack();
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void paintComponent(Graphics g) {

		g.drawImage(MyImg.signinPanel, 0, 0, 729, 762, this);
	}

	@Override
	public void run() {
		
		double i = 1;
		while(i<7)
		{
			confirmButton.setBounds((int) (431+Math.pow(-1, i)*3), 513, 66, 49);
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

	public void checkSignin() {
		SigninBlImpl signin = new SigninBlImpl();
		if(signin.isValid(userID.getText(), password.getText())){
			StuffAccess access = signin.isCorrect(userID.getText(), password.getText());
			if(access!=StuffAccess.ERROR){
				MainFrame.getInstance().login(access);
			}
			else{
				signinInfo.setText("用户名或密码错误");
				t = new Thread(this);
				t.start();
			}	
		}
		else{
			signinInfo.setText("用户名或密码格式错误");
			t = new Thread(this);
			t.start();
		}
	}
}
