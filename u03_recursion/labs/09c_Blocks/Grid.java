//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Grid
{
   private String[][] grid;

	public Grid()
	{
	}

	public Grid(int rows, int cols, String[] vals)
	{
		setGrid(rows, cols,vals);
	}
	
	public void setGrid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int r = 0; r < rows; r++){
			for(int c = 0; c < cols; c++){
				int valPicker = (int)(Math.random() * vals.length);
				grid[r][c] = vals[valPicker];
			}
		}
	}

	public int findMax(String val)
	{
		int greatest = 0;
		for(int r = 0; r < grid.length; r++){
			for(int c = 0; c < grid[r].length; c++){
				int count = findMax(r, c, val);
				if(count > greatest){
					greatest = count;
				}
			}
		}
		return greatest;
	}

	private int findMax(int r, int c, String search)
	{
		if(r >= 0 && c >= 0 && r < grid.length && c < grid[r].length && grid[r][c].equals(search)){
			int count = 1;
			grid[r][c] = " ";
			count += findMax(r + 1, c, search);
			count += findMax(r - 1, c, search);
			count += findMax(r, c + 1, search);
			count += findMax(r, c - 1, search);
			return count;
		}
		return 0;
	}

	public String toString()
	{
		String output="";
		for(int r = 0; r < grid.length; r++){
			for(int c = 0; c < grid[r].length; c++){
				output += grid[r][c] + " ";
			}
			output += "\n";
		}
		return output;
	}
}