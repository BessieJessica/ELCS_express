package nju.edu.express.uiutil;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;

public class ClearLabel extends JLabel {

	public ClearLabel(String content){
		this.setText(content);
		this.setOpaque(false);
		this.setForeground(Color.WHITE);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setFont(new Font("微软雅黑",Font.PLAIN , 20));
		super.paintComponent(g);
	}
	
	public void changeText(String content){
		this.setText(content);
	}
}
