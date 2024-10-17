//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
	private String catagory, name;

	public SiteName(String s){
		catagory = s.substring(s.length() - 4);
		name = s.substring(0, s.length() - 4);
	}

	public String getCatagory() {
		return catagory;
	}

	public String getName() {
		return name;
	}

	//add a compareTo
	public int compareTo(SiteName other){
		if(other.getCatagory().equals(this.getCatagory()))
			return this.getName().compareTo(other.getName());
		return this.getCatagory().compareTo(other.getCatagory());
	}


	//add a toString
	public String toString()
	{
		return name + catagory;
	}
}