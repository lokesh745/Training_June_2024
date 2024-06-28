package Introduction;

public class methodOverloading_fun {

	public int sum(int num1, int num2)
	{
		return num1+num2;
	}
	
	public int sum(int num1, double num2)
	{
		return (int)(num1+num2);
	}
	
	public int sum(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	
}
