package abstract_Interface;

public class faculty extends employee
{
	public static void main(String[] args) 
	{
		new faculty();
	}
	faculty()
	{
		System.out.println("faculty clas constructor called");
	}

}

class employee extends person
{
	public employee()
	{
		System.out.println("Employee class constructor called");
	}
}


class person
{
	public person()
	{
		System.out.println("Person class constructor called");
	}
}
