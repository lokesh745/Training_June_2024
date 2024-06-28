package passByValueReference;

public class passByValurRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partyDO obj = new partyDO(1);
		System.out.println("Before: " + obj.getpartySeq());
		
		operations o = new operations();
		o.increment(obj);
		System.out.println("Value after increment: " + obj.getpartySeq());
		
		o.decrement(obj.partySeq);
		System.out.println("Value after decrement: " + obj.getpartySeq());
	}
}	
class operations{
	
	void increment(partyDO obj){
		obj.partySeq++;
	}
	
	void decrement(int partySeq){
		partySeq--;
		System.out.println("Inside decrement method " + partySeq);
	}
}


