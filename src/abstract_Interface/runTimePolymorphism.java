package abstract_Interface;

public class runTimePolymorphism 
{


	public static void main(String[] args) 
	{
		Bank b; //Object created but space not alloted yet
		
		b = new SBI();  //now space alloted
		System.out.println("SBI rate of interest is: " + b.getRateOfInterest());
		
		b = new Kotak();
		System.out.println("SBI rate of interest is: " + b.getRateOfInterest());
		
		b = new ICICI();
		System.out.println("SBI rate of interest is: " + b.getRateOfInterest());
	}

}

class Bank
{
	float getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 7.3f;
	}
}

class Kotak extends Bank
{
	float getRateOfInterest()
	{
		return 8.1f;
	}
}

class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 6.2f;
	}
}
