package Introduction;
import java.util.*;

public class debugTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		int solution;
		solution = sum(a, b);
		
		System.out.println("Sum is: " + solution);
	}
	
	public static int sum(int a, int b)
	{
		int sum = a + b;
		inform();
		return sum;
	}
	
	public static void inform()
	{
		System.out.println("Calculation completed.");
	}

}
