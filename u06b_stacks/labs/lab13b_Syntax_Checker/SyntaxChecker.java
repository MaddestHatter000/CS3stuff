//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;

	public SyntaxChecker()
	{
		setExpression("");

	}
	public SyntaxChecker(String s)
	{
		setExpression(s);
	}
	
	public void setExpression(String s)
	{
		exp = s;
	}

	public boolean checkExpression()
	{
      //You can change this to a stack of Strings if you prefer.
   		Stack<Character> symbols = new Stack<>();
		Map<Character,Character> stuff = new TreeMap<>();
		stuff.put('[',']');
		stuff.put('{','}');
		stuff.put('<','>');
		stuff.put('(',')');
		for(char i : exp.toCharArray())
		{
			if(stuff.containsKey(i))
				symbols.push(i);
			else{
				if(stuff.values().contains(i)){
					if(symbols.isEmpty())
							return false;
					if(stuff.get(symbols.peek()).equals(i)){
						symbols.pop();
					}
					else
						return false;
				}
			}
		}
		return symbols.isEmpty();
	}

	public String toString()
	{
		String output = exp + " is ";
		if(checkExpression())
			output += "correct.";
		else
			output += "incorrect.";
		return output;
	}
}