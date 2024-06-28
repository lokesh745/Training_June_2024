package Introduction;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		partyDO user1 = new partyDO();
		partyDO user2 = new partyDO();
		
		registerUser r = new registerUser();
		
		r.registerNewUser(user1);
		r.registerNewUser(user2);
		
	}

}
