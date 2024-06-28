package staticKeyword;

public class cars 
{
	
	String name;
	String cc;
	
	public static int count;
	
	public cars(String name, String cc)
	{
		this.name = name;
		this.cc = cc;
		this.count ++;
	}

}
