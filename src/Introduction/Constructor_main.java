package Introduction;

public class Constructor_main {

	public static void main(String[] args) {
		
		Constructor_customer obj1 = new Constructor_customer("Lokesh", 22);
		System.out.println("Name: " + obj1.name + "\nAge: " + obj1.age);
		
		Constructor_customer obj2 = new Constructor_customer(obj1);
		System.out.println("Name: " + obj2.name + "\nAge: " + obj2.age);
		
		Constructor_customer obj3 = new Constructor_customer();
		System.out.println("Name: " + obj3.name + "\nAge: " + obj3.age);

	}

}
