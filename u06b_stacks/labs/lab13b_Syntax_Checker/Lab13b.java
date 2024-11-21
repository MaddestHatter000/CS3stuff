//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class Lab13b
{
	public static void main ( String[] args )
	{
		SyntaxChecker test;

		test = new SyntaxChecker("(abc(*def)");
		out.println(test);
		out.println();

		test = new SyntaxChecker("[{}]");
		out.println(test);
		out.println();
		
		test = new SyntaxChecker("[");
		out.println(test);
		out.println();

		test = new SyntaxChecker("[{<()>}]");
		out.println(test);
		out.println();

		test = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
		out.println(test);
		out.println();

		test = new SyntaxChecker("[one]<two>{three}(four)");
		out.println(test);
		out.println();

		test = new SyntaxChecker("car(cdr(a)(b)))");
		out.println(test);
		out.println();

		test = new SyntaxChecker("car(cdr(a)(b))");
		out.println(test);
		out.println();
	}
}