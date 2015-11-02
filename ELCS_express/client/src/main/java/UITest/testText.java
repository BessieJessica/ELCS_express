package UITest;

import java.awt.Graphics;

import javax.swing.JTextField;

public class testText extends JTextField {

	public testText(){
		this.setOpaque(false);
	}
	
	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paint(arg0);
	}

	@Override
	protected void paintBorder(Graphics g) {
		// TODO Auto-generated method stub
//		super.paintBorder(arg0);
		g.drawLine(0,30,200,30);
		g.drawLine(0, 28, 0, 30);
		g.drawLine(200, 28, 200, 30);
	}

	@Override
	protected void paintChildren(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paintChildren(arg0);
	}

	@Override
	protected void paintComponent(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paintComponent(arg0);
	}

	

	
	
}
