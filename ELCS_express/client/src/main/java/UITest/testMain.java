package UITest;

import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;

public class testMain{

	public static void main(String[] args){
		JFrame frame = new JFrame();
//		testPanel panel = new testPanel();
//		slidePanel panel = new slidePanel();
//		textPanel panel= new textPanel();
		
		
		frame.setBounds(200,200,800,450);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		
		
	}


}
