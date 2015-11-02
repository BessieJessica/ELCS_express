package nju.edu.express.uiutil;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class FrameTextField extends JTextField {

	private int width;
	private int height;
	FrameTextField me;
	
	public FrameTextField(int width,int height){
		this.width = width;
		this.height = height;
		this.setOpaque(false);
		this.setForeground(Color.DARK_GRAY);
		
		FontHelper fontHelper = new FontHelper(25);
		this.setFont(fontHelper.fetchFont("comfortaa"));
		
		
	}
	
	@Override
	protected void paintBorder(Graphics g) {
		g.drawImage(MyImg.queryTextField, 0, 0, width, height, this);
		this.repaint();
	}


}
