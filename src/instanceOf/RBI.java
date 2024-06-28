package instanceOf;

public class RBI 
{
	double interest = 6.5;
	public double getInterest()
	{
		return 0;
	}
}

class SBI extends RBI
{
	double interest = super.interest + 2.5;
	public double getInterest()
	{
		return interest;
	}
	public void setInterest(double interest)
	{
		this.interest = interest;
	}
}

class Kotak extends RBI
{
	double interest = super.interest + 5;
	public double getInterest()
	{
		return interest;
	}
	public void setInterest(double interest)
	{
		this.interest = interest;
	}
}