package Introduction;
import java.util.*;

class newClass{
	
	public int Addition(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		
		int sum = a + b;
		return sum ;
		
	}
}

public class FirstProgram {
	
	public static String Even_Odd(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		if (a%2 == 0){
			return "Even";
		}
		else{
			return "Odd";
		}
	}
	
	public static void Print_loop(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number till which you want to print loop: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.print(i+" ");
		}
	}
	
	public static void Accept_Elements(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements you want in your array: ");
		int n = sc.nextInt();
		
		int arr[];
		arr = new int[n];
		
		System.out.println("Enter element: ");
		
		int i = 0;
		while (i<n){
			int element = sc.nextInt(); 
			arr[i] = element;
			i++;
		}
		
		for(int j=0; j<n; j++){
			System.out.print(arr[j]+" ");
		}
			
	}
	
	public static void Switch_Case(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want till 5: ");
		int a = sc.nextInt();
		switch(a){
			case 1: 
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			default:
				System.out.println("Invalid Input");
				
		}
		
	}
	public static void main(String[] args) {
		
		//System.out.println(Even_Odd());
		//Print_loop();
		//System.out.println("Sum is:"+Addition());
		//Accept_Elements();
		//Switch_Case();
		
		newClass obj1 = new newClass();
		int answer = obj1.Addition();
		System.out.println(answer);
	
	}

}
