package nov_21_2023;
//create a class with three methods one is main method,second method with static method and third method also static method
public class Second_Assignment //main class
{
	static int a;//global variable
	static int b; //global variable
	
	static void add() //this is a static method
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	static void sub()//this is a static method
	{
		a=60;
		b=70;
		System.out.println(a-b);
	}
	public static void main(String args[]) //main method
	{
	System.out.println("this is a main method");	
		add();
		sub();
	}
	
}
