//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class Triangle extends Canvas implements Runnable
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
		
	public Triangle()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLUE);
		window.setFont(new Font("ARIAL",Font.BOLD,24));		
		window.drawString("Serpinski's Gasket", 25, 50);

		triangle(window, (WIDTH-10)/2, 20, WIDTH-40, HEIGHT-20, 40, HEIGHT-20);
	}
	
	public void triangle(Graphics window, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		//if statement base case
			//midpoint = (x1 + x2 / 2), (y1 + y2/ 2)
		if(x1-x2 != 0 && x2-x3 != 0 && x3-x1 != 0){

			window.drawLine(x1, y1, x2, y2);
			window.drawLine(x2, y2, x3, y3);
			window.drawLine(x3, y3, x1, y1);

			run();

			triangle(window, x1, y1, (x2 + x1)/2, (y2 + y1)/2, (x3 + x1)/2, (y3 + y1)/2);
			triangle(window, (x1 + x2)/2, (y1 + y2)/2, x2, y2, (x3 + x2)/2, (y3 + y2)/2);
			triangle(window, (x1 + x3)/2, (y1 + y3)/2, (x2 + x3)/2, (y2 + y3)/2, x3, y3);
		}
	}
	
	public void run()
	{
		try{
		  	Thread.currentThread().sleep(3);	
		}
		catch(Exception e)
		{
		}
	}
}