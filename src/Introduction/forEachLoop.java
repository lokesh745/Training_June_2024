package Introduction;
import java.util.*;

public class forEachLoop {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many elements you want in your array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter element at position " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Maximum element is : " + maxElement(arr));
	}
	
	public static int maxElement(int arr[])
	{
		int maximum = arr[0];
		for(int i : arr)
		{
			if (i > maximum)
			{
				maximum = i;
			}
		}
		return maximum;
	}

}
