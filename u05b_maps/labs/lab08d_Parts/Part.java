//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.lang.Integer;

public class Part implements Comparable<Part>
{
	private String make, model, part;
	private int partNumber, year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
		year = Integer.parseInt(list[list.length - 1]);
		model = list[list.length - 2];
		make = list[list.length - 3];
		partNumber = Integer.parseInt(list[list.length - 4]);
		part = "";
		for(int i = 0; i < list.length - 4; i++)
		{
			part += list[i] + " ";
		}
		part = part.substring(0, part.length()-1);
	}

	public String getMake(){return make;}
	public String getModel(){return model;}
	public String getPart(){return part;}
	public int getPartNumber(){return partNumber;}
	public int getYear(){return year;}

	//have to have compareTo if implements Comparable
	public int compareTo( Part other )
	{
		if(make.equals(other.getMake())){
			if(model.equals(other.getModel())){
				if(year == other.getYear()){
					return part.compareTo(other.getPart());
				}
				return year - other.getYear();
			}
			return model.compareTo(other.getModel());
		}
		return make.compareTo(other.getMake());
	}

	public String toString()
	{
		return make + " " + model + " " + year + " " + part + " " + partNumber;
	}
}