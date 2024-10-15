//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	//add an instance variable and a constructor
	String word;

	public Word(String w){
		 word = w;
	}

	//add a compareTo
	public int compareTo(Word w){
		return word.length() - w.toString().length();
	}

	//add a toString
	public String toString(){
		return word;
	}
}