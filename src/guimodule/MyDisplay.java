package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	public void setup()
	{
		size(400,400);
		background(0,0,255);
	}
	
	public void draw()
	{
		sphere(28);
	}
}
