package UITest;

import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testPanel extends JPanel {

	testLabel2 testLabel2;
	/**
	 * Create the panel.
	 * @throws IOException 
	 * @throws FontFormatException 
	 */
	public testPanel(){
		
		setLayout(null);
		JButton testButton = new testButton();
		testButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		testButton.setBorderPainted(false);
		testButton.setBounds(49, 0, 55, 44);
		add(testButton);
		
		
		JLabel testLabel = new testLabel();
		testLabel.setBounds(0, 0, 174, 44);
		add(testLabel);
		
		testLabel2 = new testLabel2();
		testLabel2.setBounds(174, 0, 14, 44);
		add(testLabel2);
		
		//读取自定义字体,ttf和otf都可以
//		File file = new File("resources/fonts/Choplin-Medium-DEMO.otf");
//		FileInputStream fis = new FileInputStream(file);
//		BufferedInputStream fb = new BufferedInputStream(fis);
//		Font font = Font.createFont(Font.TRUETYPE_FONT, fb);
//		font = font.deriveFont(Font.BOLD, 25);
//		
//		
//		testButton.setFont(font);
//		testButton.setFocusPainted(false);//取出字体边框


	}
	
	public void mypaint(){
		testLabel2.mypaint();
	}
	
	public void mypaint2(){
		testLabel2.mypaint2();
	}
}
