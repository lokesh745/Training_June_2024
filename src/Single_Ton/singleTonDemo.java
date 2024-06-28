package Single_Ton;

public class singleTonDemo 
{
	
	public static void main(String[] args)
	{
		onlyOne obj1 = onlyOne.getObject();
		onlyOne obj2 = onlyOne.getObject();
		
		if (obj1.equals(obj2))
		{
			System.out.println("obj1 and obj2 are same");
		}
		else
		{
			System.out.println("obj1 and obj2 are different");
		}
		
		System.out.println("--------------------");

		prototype p1 = new prototype();
		prototype p2 = new prototype();
		
		if(p1.equals(p2))
		{
			System.out.println("p1 and p2 are same");
		}
		else
		{
			System.out.println("p1 and p2 are different");
		}
	}
}
