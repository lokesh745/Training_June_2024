package Single_Ton;

public class onlyOne {
	
	private onlyOne()
	{
	}

	static onlyOne obj;
	
	public static onlyOne getObject()
	{
		
		if(obj!=null)
		{
			return obj;
		}
		else
		{
			obj = new onlyOne();
			return obj;
		}
	}
	
}
