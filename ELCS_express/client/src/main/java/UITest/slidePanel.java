package UITest;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class slidePanel extends JPanel implements Runnable {

	/**
	 * Create the panel.
	 */
	Thread t;
	JPanel panel;
	private JTextField textField;

	public slidePanel() {
		setLayout(null);

		JLabel lblFirstPanel = new JLabel("First Panel");
		lblFirstPanel.setForeground(Color.DARK_GRAY);
		lblFirstPanel.setFont(new Font("Choplin Medium-DEMO", Font.BOLD, 25));
		lblFirstPanel.setBounds(478, 214, 180, 51);
		add(lblFirstPanel);

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(-367, 0, 367, 463);
		this.add(panel);
		panel.setLayout(null);

		JLabel lblSecondPanel = new JLabel("Second Panel");
		lblSecondPanel.setForeground(Color.WHITE);
		lblSecondPanel.setFont(new Font("Choplin Medium-DEMO", Font.BOLD, 25));
		lblSecondPanel.setBounds(105, 213, 179, 53);
		panel.add(lblSecondPanel);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Adobe Arabic", Font.PLAIN, 18));
		textField.setBounds(146, 198, 96, 27);
		add(textField);
		textField.setColumns(10);

		// Thread actions
		t = new Thread(this);
		t.start();

	}

	@Override
	public void run() {
		int i = 0;
		while (i < 367) {
			panel.setBounds(-367 + i, 0, 367, 463);
			i++;
			try {
				
				t.sleep(1+i * i / 18000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}
	}
}
