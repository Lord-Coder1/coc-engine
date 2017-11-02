package com.avekvist.catengine;

import javax.swing.JFrame;

public class Screen extends JFrame {

	private JFrame frame;
	
	public Screen(int width, int height, String title) {
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setTitle(title);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
