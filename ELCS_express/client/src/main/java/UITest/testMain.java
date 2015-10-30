package UITest;

import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;

public class testMain {

	public static void main(String[] args) throws FontFormatException, IOException{
		JFrame frame = new JFrame();
		testPanel panel = new testPanel();
		
		frame.setBounds(200,200,400,400);
//		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		
		
		
	}
}
