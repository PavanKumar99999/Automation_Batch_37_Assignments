package nov_6_2023;

public class Eight_Assignment 
{
	
	
	Eight_Assignment() //constructor
	{	
		System.out.println("this is a constructor 1");
	}
	
	Eight_Assignment(int a) //constructor 2 with one parameter
	{	
		System.out.println("this is a constructor "+a);
	}
	
	Eight_Assignment(int a,String s) //constructor 3 with one parameter
	{	
		System.out.println("this is a constructor "+a+" "+s);
	}
	
	public static void main(String args[])//main method
	{
	
	new Eight_Assignment();//by default we are calling constructor by creating a object	
	new Eight_Assignment(2);// by giving parameters we are calling constructor 2 	
	new Eight_Assignment(3,"Third");//by giving values of parameters we are calling constructor 3
	
	}

}
