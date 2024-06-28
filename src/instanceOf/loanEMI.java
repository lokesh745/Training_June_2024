package instanceOf;

public class loanEMI 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double loanAmount = 1000;
		loanCalculator loan1 = new loanCalculator();
		
		RBI loanBank = new SBI();
		loan1.emiAmount(loanBank);
		
		loanBank = new Kotak();
		loan1.emiAmount(loanBank);

	}

}
