package staticKeyword;

public class staticPractice 
{
	// static method
	static
	{
		System.out.println("This is static block");
	}
	public static void main(String[] args) 
	{
		messagePrint.print();
	}
	
	public static class messagePrint
	{
		static void print()
		{
			System.out.println("Hi guyss");
		}
	}

}
