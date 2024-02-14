package nov_21_2023;

public class Staticblock //main class
{
	{
		System.out.println("this is IIB");
	}
	{
		System.out.println("this is IIB2");
	}
	Staticblock() //this is a constructor
	{
		System.out.println("this is a constructor");
	}
	
	public static void main(String args[]) //main method
	{
		//java will execute the program line by line
		System.out.println("this is main method");
		new Staticblock(); // when we create object we automatically calls "IIB" then it calls constructor only if constructor is there.
	}
	
	static // this is SIB
	{
		System.out.println("this is SIB");
	}
	static// this is SIB
	{
		System.out.println("this is SIB2");
	}
	
}
