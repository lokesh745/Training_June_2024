package Introduction;

import java.util.Scanner;

public class Constructor_customer {
	
	Scanner sc = new Scanner(System.in);

	String name;
	int age;
	
	//default constructor
	Constructor_customer()
	{
		System.out.println("Hi, this is default constructor.");
	}
	
	//Parameterized constructor
	Constructor_customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//copy constructor
	Constructor_customer(Constructor_customer obj)
	{
		this.name = obj.name;
		this.age = obj.age;
	}
	
}
