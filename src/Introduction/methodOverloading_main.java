package Introduction;

import java.util.Scanner;

public class methodOverloading_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter num3: ");
		int num3 = sc.nextInt();
		
		methodOverloading_fun op = new methodOverloading_fun();
		
		
		 
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " + op.sum(num1, num2));
		System.out.println("Sum of " + num2 + " and " + num3 + " is: " + op.sum(num2, (double)num3));
		System.out.println("Sum of " + num1 + " ," + num2 + " and " + num3 + " is: " + op.sum(num1, num2, num3));
		
	}

}
