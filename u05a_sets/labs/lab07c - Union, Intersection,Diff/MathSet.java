//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one = new TreeSet<>();
		two = new TreeSet<>();
	}

	public MathSet(String o, String t)
	{
		one = new TreeSet<>();
		two = new TreeSet<>();
		for(String i : o.split(" ")){
			one.add(Integer.parseInt(i));
		}
		for(String i : t.split(" ")){
			two.add(Integer.parseInt(i));
		}
	}

	public Set<Integer> union()
	{
		Set<Integer> output = new TreeSet<>();
		output.addAll(one);
		output.addAll(two);
		return output;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> output = new TreeSet<>();
		output.addAll(one);
		output.retainAll(two);
		return output;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> output = new TreeSet<>();
		output.addAll(one);
		output.removeAll(two);
		return output;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> output = new TreeSet<>();
		output.addAll(two);
		output.removeAll(one);
		return output;
	}
	
	public Set<Integer> symmetricDifference()
	{
		Set<Integer> output = new TreeSet<>();
		output.addAll(union());
		output.removeAll(intersection());
		return output;
	}	
	
	public String toString()
	{
		String output = "";
		output += "Set one " + one + "\n" +	"Set two " + two +  "\n\n";
		output += "Union - " + union() + "\n";
		output += "Intersection - " + intersection() + "\n";
		output += "Difference A-B - " + differenceAMinusB() + "\n";
		output += "Difference B-A - " + differenceBMinusA() + "\n";
		output += "Symmetric Difference - " + symmetricDifference() + "\n";
		return output;
	}
}