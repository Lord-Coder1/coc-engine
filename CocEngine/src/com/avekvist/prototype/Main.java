package com.avekvist.prototype;

import com.avekvist.catengine.Screen;

public class Main implements Runnable {

	private boolean isRunning;
	private Thread thread;
	private Screen screen;
	
	private final int WIDTH = 640;
	private final int HEIGHT = WIDTH / 16 * 9;
	private final String TITLE = "Prototype Window";
	
	public Main() {
		screen = new Screen(WIDTH, HEIGHT, TITLE);
		
		start();
	}
	
	public static void main(String[] args) {
		new Main();
	}

	public synchronized void start() {
		isRunning = true;
		thread = new Thread("main");
	}

	public synchronized void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		while(isRunning) {
			System.out.println("Running the Loop");
		}
	}
}
