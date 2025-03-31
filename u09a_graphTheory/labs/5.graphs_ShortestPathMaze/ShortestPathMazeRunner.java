//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathMazeRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("shortestPathMaze.dat"));
		int cases = file.nextInt();
		file.nextLine();
		for(int i = 0; i < cases; i++)
		{
			int size = file.nextInt();
			int[][] maze = new int[size][size];
			file.nextLine();
			for(int r = 0; r < size; r++)
			{
				for(int c = 0; c < size; c++)
				{
					maze[r][c] = file.nextInt();
				}
			}
			ShortestPathMaze test = new ShortestPathMaze(maze);
			test.checkForExitPath(0, 0);
			System.out.print(test);
			int shortest = test.getShortestPath();
			if(shortest == 0)
			{
				System.out.println("No Path Found");
			}
			else
			{
				System.out.println("Shortest Path of " + shortest);
			}
			System.out.println();

		}
	}
}