package UITest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class testLabel extends JLabel implements MouseListener, Runnable {

	public int counter_block;
	public float red, green, blue, alpha_block;
	private Thread t1;
	public boolean clicked = false;

	public testLabel() {
		addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(new Color(red, green, blue, alpha_block));
		g.fillRect(0, 0, counter_block, 44);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(clicked){
			testPanel parent = (testPanel) this.getParent();
			parent.mypaint2();
			clicked = false;
		}
		else{
			testPanel parent = (testPanel) this.getParent();
			parent.mypaint();
			clicked = true;
		}
		
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
		counter_block = 0;
		red = 0;
		green = (float) (100.0 / 255.0);
		blue = 1;
		alpha_block = 1;
		t1 = new Thread(this);
		t1.start();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		t1.stop();
		counter_block = 0;
		repaint();

	}

	@Override
	public void run() {
		while (counter_block < 174) {
			counter_block++;
			try {
				t1.sleep(7 * counter_block * counter_block / 25000);

				// red:from 0 to 100 0 to 100/255
				// green:from 100 to 160 100/255 to 160/255
				// blue:from 255 to 255 1 to 1
				// alpha
				
				red += (1.0 / 174.0) * (100.0 / 255.0);
				green += (1.7 / 174.0) * ((160.0 / 255.0) - (100.0 / 255.0));
				alpha_block -= 1.0 / 174 * 0.6;
				repaint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
