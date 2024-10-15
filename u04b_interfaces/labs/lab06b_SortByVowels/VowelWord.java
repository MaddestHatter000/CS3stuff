//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class VowelWord implements Comparable<VowelWord>
{
	//add a string instance variable
	private String word;
	
	//add a constructor
	public VowelWord(String w){
		word = w;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i = 0; i < word.length(); i++){
			if(vowels.contains(word.substring(i,i+1)))
				vowelCount++;
		}
		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
		if (this.numVowels() == other.numVowels()) {
			return toString().compareTo(other.toString());
		}
		return this.numVowels() - other.numVowels();
	}

	public String toString()
	{
		return word;
	}
}