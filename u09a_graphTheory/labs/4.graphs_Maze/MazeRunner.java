//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MazeRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("maze.dat"));
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
			Maze test = new Maze(maze);
			System.out.print(test);
			if(test.checkForExitPath(0, 0))
			{
				System.out.println("exit found\n");
			}
			else
			{
				System.out.println("exit not found\n");
			}
		}
		
	}
}