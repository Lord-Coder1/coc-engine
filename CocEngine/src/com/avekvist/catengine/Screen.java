package com.avekvist.catengine;
import org.lwjgl.LWJGLException;

class Screen{
	//Default dimensions and variables
	private static int length = 500; 
	private static int height = 500;
	private static int FPS_MAX = 30;
	private static String title = "";

	public static void setWindowSize(int len, int width){
		length = len;
		height = width;
	}

	public static void setMaxFPS(int fps){
		FPS_MAX = fps;
	}

	public static void setTitle(String wintitle){
		title = wintitle;
	}

	public static void create(){
		ContextAttribs openGLattributes = new ContextAttribs(3,2)
		.withForwardCompatible(true)
		.withProfileCore(true);

		try{
			DisplayMode mode = new DisplayMode(width, height);
			Display.setDisplayMode(mode);
			Display.create(new PixelFormat(), openGLattributes);
			Display.setTitle(title);
		}catch(LWJGLException e){
			e.printStackTrace();
		}
		//setting up the area that can be rendered to the entire Display
		GL11.glViewport(0,0,length,height);
	}

	public static void update(){
		Display.sync(FPS_MAX);
		Display.update();
	}

	public static void destroy(){
		Display.destroy();
	}

}
