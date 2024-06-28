package Introduction;
import java.util.*;

public class registerUser {
	
	public void registerNewUser(partyDO userObj)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter partyTypeCd1: ");
		userObj.partyTypeCd = sc.nextLine();
		
		System.out.print("Enter partSeq1: ");
		userObj.partSeq = sc.nextLine();
		
		System.out.print("Enter title1: ");
		userObj.title = sc.nextLine();
		
		System.out.print("Enter firstName1: ");
		userObj.firstName = sc.nextLine();
		
		System.out.print("Enter lastName1: ");
		userObj.lastName = sc.nextLine();
			
		System.out.print("Enter age1: ");
		userObj.age = sc.nextInt();
		
		System.out.print("Enter genderCd1: ");	
		userObj.genderCd = sc.next();
		
		System.out.println("partyTypeCd1 is: " + userObj.partyTypeCd + "\n" + "partSeq1 is: "+ userObj.partSeq + "\n" + "title1 is: "+ userObj.title + "\n" + "firstName1 is: "+ userObj.firstName+ "\n" + "lastName1 is: "+ userObj.lastName + "\n" + "age1 is: "+ userObj.age + "\n" + "genderCd1 is: "+ userObj.genderCd);
		
	}
		
	
}
