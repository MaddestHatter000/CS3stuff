//package lab13a_Stacks_Basics;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class StackTester
{
	private Stack<String> stack;

	public StackTester()
	{
		setStack("");
	}

	public StackTester(String line)
	{
		setStack(line);
	}
	
	public void setStack(String line)
	{
		stack = new Stack<>();
		String[] stuff = line.split(" ");
		for(String s : stuff){
			stack.push(s);
		}
	}

	public void popEmAll()
	{
		while(!stack.isEmpty())
		{
			out.print(stack.pop() + " ");
		}
	}

	//add a toString
	public String toString()
	{
		return stack.toString();
	}
}