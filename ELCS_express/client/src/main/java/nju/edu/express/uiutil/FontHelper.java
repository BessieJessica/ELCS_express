package nju.edu.express.uiutil;

import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FontHelper {

	private Font choplinFont,comfortaaFont;
	private int size;
	
	public FontHelper(int size){
		this.size = size;
		init();
	}

	private void init() {
		File file;
		FileInputStream fis;
		
		//读取choplin font
		file = new File("resources/fonts/Choplin-Medium-DEMO.otf");
		try {
			fis = new FileInputStream(file);
			BufferedInputStream fb = new BufferedInputStream(fis);
			choplinFont = Font.createFont(Font.TRUETYPE_FONT, fb);
			choplinFont = choplinFont.deriveFont(Font.BOLD, size);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//读取comfortaa font
		file = new File("resources/fonts/Comfortaa-Regular.ttf");
		try {
			fis = new FileInputStream(file);
			BufferedInputStream fb = new BufferedInputStream(fis);
			comfortaaFont = Font.createFont(Font.TRUETYPE_FONT, fb);
			comfortaaFont = comfortaaFont.deriveFont(Font.BOLD, size);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public Font fetchFont(String fontName){
		
		if(fontName.equals("choplin"))
			return choplinFont;
		else if(fontName.equals("comfortaa"))
			return comfortaaFont;
		else
		    return null;
	}
}
