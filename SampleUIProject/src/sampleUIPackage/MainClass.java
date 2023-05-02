package sampleUIPackage;

import java.awt.Frame;

public class MainClass {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setVisible(true);
		f.setTitle("Sample 1");
		f.setBounds(200, 400, 500, 500);
		
		MyFrame mf1 = new MyFrame(true, "Sample 2", 300, 200, 600, 200);
		
		MyFrame mf2 = new MyFrame(true, "Sample 3", 400, 400, 600, 600);
	}

}
