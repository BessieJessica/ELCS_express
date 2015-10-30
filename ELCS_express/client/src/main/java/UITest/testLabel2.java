package UITest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class testLabel2 extends JLabel implements MouseListener,Runnable{

	
    private Thread t;
    public float alpha = 0;
    public float red=1,green=0,blue=(float) 0.2;
    public int counter = 0;
    public boolean clicked = false;
	
	public testLabel2() {
		addMouseListener(this);
		
	}
	
	public void mypaint(){
		alpha = 0;
		counter = 0;
		t = new Thread(this);
		t.start();
	}
	
	public void mypaint2(){
		t = new Thread(this);
		t.start();
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(new Color(red, green, blue, alpha));
		g.fillRect(0, 0, 44, 44);
	}
	
	@Override
	public void run() {
		if(clicked){
			while(counter>0)
			{
				alpha -= 1.0/150.0;
				counter--;
				try {
					t.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
			}
			clicked = false;
		}
		else{
			while(counter<100)
			{
				alpha += 1.0/150.0;
				counter++;
				try {
					t.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
			}
			clicked = true;
		}
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
		
	}

	
}
