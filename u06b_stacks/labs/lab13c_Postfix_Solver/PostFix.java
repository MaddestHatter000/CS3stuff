//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

	public PostFix()
	{
		stack = new Stack<>();
		setExpression("");
	}

	public PostFix(String exp)
	{
		stack = new Stack<>();
		setExpression(exp);
	}

	public void setExpression(String exp)
	{
		expression = exp;
	}

	public double calc(double one, double two, char op)
	{
		if(op == '+')
			return two + one;
		if(op == '-')
			return two - one;
		if(op == '*')
			return two * one;
		if(op == '/')
			return two / one;
		return 0.0;
	}

	public void solve()
	{
		for(Character i : expression.toCharArray())
		{
			if(Character.isDigit(i)){
				stack.push((double)Character.getNumericValue(i));
			}
			else if("+-*/".contains(i.toString()) && stack.size() >= 2)
			{
				stack.push(calc(stack.pop(),stack.pop(),i));
			}
		}
	}

	public String toString()
	{
		String output = "";
		for(Character i : expression.toCharArray())
		{
			output += i + " ";
		}
		output += "= " + stack.pop();
		return output;
	}
}