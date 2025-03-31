//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		maze = new int[0][0];
	}

	public Maze(int[][] m)
	{
		maze = m;
	}

	public boolean checkForExitPath(int r, int c)
	{
		return checkForExitPath(r, c, new int[maze.length][maze[0].length]);
	}
	
	public boolean checkForExitPath(int r, int c, int[][] visited)
	{
		if(r < 0 || r >= maze.length || c < 0 || c >= maze[0].length || maze[r][c] == 0 || visited[r][c] == 1)
		{
			return false;
		}
		visited[r][c] = 1;
		if(c == maze.length - 1)
		{
			return true;
		}
		return checkForExitPath(r + 1, c, visited) || checkForExitPath(r - 1, c, visited) || checkForExitPath(r, c + 1, visited) || checkForExitPath(r, c - 1, visited);
	}

	public String toString()
	{
		String output="";
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[0].length; c++)
			{
				output += maze[r][c] + " ";
			}
			output += "\n";
		}
		return output;
	}
}