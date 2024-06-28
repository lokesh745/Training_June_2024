package instanceOf;

public class loanCalculator 
{
	void emiAmount(RBI childBank)
	{
		if(childBank instanceof SBI)
		{
			System.out.println("HI, its SBI with " + ((RBI) childBank).getInterest() + " % interest");
		} 
		else if(childBank instanceof Kotak)
		{
			System.out.println("HI, its Kotak with " + ((RBI) childBank).getInterest() + " % interest");
		}
	}
}
