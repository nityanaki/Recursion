// Lab32bst.java
// The student version of the Lab32b assignment.


import java.awt.*;
import java.awt.event.*;


public class FractalsLab
{
	public static void main(String args[])
	{
		GfxApp gfx = new GfxApp();
		gfx.setSize(1024,768);
		gfx.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		gfx.show();
	}
}


class GfxApp extends Frame
{
	
	public void paint (Graphics g)
	{
		drawSquare1(g,1024,768);
	}
	
	public void drawSquare1(Graphics g, int maxX, int maxY)
	{
		g.fillRect(maxX/2-maxX/6,maxY/2-maxY/6,maxX/3,maxY/3);
		makeRect(g,1024/2+1024/6,768/2-768/3,1024/6,768/6);
		makeRect(g,1024/2-1024/3,768/2-768/3,1024/6,768/6);
		makeRect(g,1024/2+1024/6,768/2+768/6,1024/6,768/6);
		makeRect(g,1024/2-1024/3,768/2+768/6,1024/6,768/6);
	}
	
	public void makeRect(Graphics g, int x, int y, int siz1,int siz2)
	{
		g.fillRect(x,y,siz1,siz2);
		if (siz1>1&&siz2>1)
		{
			//bottom right
			makeRect(g,x+siz1,y+siz2,siz1/2,siz2/2);
			//top left
			makeRect(g,x-siz1/2,y-siz2/2,siz1/2,siz2/2);
			//top right
			makeRect(g,x+siz1,y-siz2/2,siz1/2,siz2/2);
			//bottom left
			makeRect(g,x-siz1/2,y+siz2,siz1/2,siz2/2);
		}
	}
	
	/*public void makeRect2(Graphics g, int x, int y, int siz1,int siz2)
	{
		g.fillRect(x,y,siz1,siz2);
	}
	
	public void makeRect3(Graphics g, int x, int y, int siz1,int siz2)
	{
		g.fillRect(x,y,siz1,siz2);
	}
	
	public void makeRect4(Graphics g, int x, int y, int siz1,int siz2)
	{
		g.fillRect(x,y,siz1,siz2);
	}*/
	
	
	private void delay(double n)
	{
		for (double k = 1; k < n; k+=0.001);
	}
			
}


