//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathMaze
{
   private int[][] maze, shortestPath;
   private int shortest;

	public ShortestPathMaze()
	{
		this(new int[0][0]);
	}

	public ShortestPathMaze(int[][] m)
	{
		maze = m;
		shortest = m.length * m.length;
		shortestPath = new int[m.length][m.length];
	}


	public void checkForExitPath(int r, int c)
	{
		checkForExitPath(r, c, 0, new int[maze.length][maze[0].length]);
	}

	public void checkForExitPath(int r, int c, int steps, int[][] currentPath) {
		// Base case: Out of bounds or hitting a wall or revisiting a cell
		if (r < 0 || r >= maze.length || c < 0 || c >= maze[0].length || maze[r][c] == 0 || currentPath[r][c] == 9) {
			return;
		}
	
		// Mark the current cell as visited
		currentPath[r][c] = 9;
		steps++;
	
		// Check if we reached the exit (rightmost column)
		if (c == maze[0].length - 1) {
			if (steps < shortest) {
				shortest = steps;
				// Copy the current path to the shortestPath
				for (int i = 0; i < maze.length; i++) {
					System.arraycopy(currentPath[i], 0, shortestPath[i], 0, maze[0].length);
				}
			}
			// Unmark the current cell before returning
			currentPath[r][c] = 0;
			return;
		}
	
		// Recursive calls to explore all four directions
		checkForExitPath(r + 1, c, steps, currentPath); // Down
		checkForExitPath(r - 1, c, steps, currentPath); // Up
		checkForExitPath(r, c + 1, steps, currentPath); // Right
		checkForExitPath(r, c - 1, steps, currentPath); // Left
	
		// Unmark the current cell before backtracking
		currentPath[r][c] = 0;
	}

	
	public int getShortestPath()
	{
		if(shortest == maze.length * maze.length)
			return 0;
		return shortest;
	}

	public String toString()
	{
		String output = "";
		for(int i = 0; i < maze.length; i++)
		{
			for(int j = 0; j < maze[i].length; j++){
				output += Math.max(maze[i][j], shortestPath[i][j]) + " ";
			}
			output += "\n";
		}
		return output;

	}
}