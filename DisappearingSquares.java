// DisappearingSquares.java
// The student version of the DisappearingSquares Lab assignment.


import java.awt.*;
import javax.swing.*;

public class DisappearingSquares
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		MyPanel m = new MyPanel();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

		j.setVisible(true); //allows the frame to be shown.
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}
}

class MyPanel extends JPanel 
{
	MyPanel()
	{
		setSize(800, 600);
		setVisible(true); //it's like calling the repaint method.
	}
	
	public void paintComponent(Graphics g)
	{

		g.setColor(Color.RED);
//
		drawSquare(g, 20,100,200);
	}
	
	public void drawSquare(Graphics g, int x, int y, int side)
	{
		g.fillRect(x,y,side,side);
		

//		x=x+side+10
		x+=(side+10);
		g.fillRect(1000-x,400,side,side);
//		y=
		y=y+side/4;
//		side=
		side=side*3/4;
		
// 		exit condition REQUIRED HERE
   		if (x<1000)
   		{	drawSquare(g,x,y,side);
   			
   		}
   		//drawSquare(g,x,y,side);
	}


}


