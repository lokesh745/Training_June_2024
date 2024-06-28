package abstract_Interface;

import java.util.Scanner;

interface otherTax
{
	double swachBharat = 2;
	//double getGST(double amount);
	
}

public class Test_Inheritance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter bill amount: ");
		double billAmount = sc.nextDouble();
		stateGST obj = new stateGST();
		
		System.out.println("Total Bill amount is: " + obj.getGST(billAmount));
	}
}

class centreGST 
{
	double centreGST = 5;
	centreGST() 
	{
		System.out.println("initial value of centreGST is being set.");
	}
}

class stateGST extends centreGST implements otherTax
{
	double stateGST = 3;
	stateGST() 
	{
		System.out.println("initial value of stateGST is being set.");
	}
	
	public double getGST(double amount)
	{
		return (stateGST + super.centreGST + swachBharat)*amount/100+amount;
	}
}
