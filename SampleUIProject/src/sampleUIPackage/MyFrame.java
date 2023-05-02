package sampleUIPackage;

import java.awt.Frame;

public class MyFrame extends Frame{
	
	public MyFrame(boolean show, String title, int x, int y, int w, int h) {
		this.setVisible(show);
		this.setTitle(title);
		this.setBounds(x, y, w, h);
	}

}
