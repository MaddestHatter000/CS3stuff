//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;
	private String output;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		queue = new LinkedList<>();
		stack = new Stack<>();
		for(String i : list.split(" "))
		{
			queue.add(i);
			stack.push(i);
		}
		output = queue.toString();
	}

	public boolean isPalin()
	{
		while(!queue.isEmpty() && !stack.isEmpty())
		{
			if(!queue.remove().equals(stack.pop()))
				return false;
		}
		return true;
	}


	public String toString()
	{
		if(isPalin())
			output += " is a palinlist.";
		else
			output += " is not a palinlist.";
		return output;
	}
}