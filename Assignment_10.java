package nov_6_2023;
// Write a program on addition subtraction multiplication and division with two numbers and

// create a (static and non-static) method

public class Tenth_Assignment// main class
{

	static void add() // add method is a static
	{
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("sum of a and b is : " + sum);
	}

	static void sub() // sub method is a static
	{
		int a = 30;
		int b = 20;
		int result = a - b;
		System.out.println("sub of a and b is : " + result);
	}

	public static void main(String args[]) // main method with a static keyword
	{
		add(); // static
		sub(); // static

		Tenth_Assignment t10 = new Tenth_Assignment(); // object creation for calling non static method//

		t10.mul(); // mul method is calling from object reference
		t10.div(); // div method is calling from object reference
	}

	void mul() // mul is non static method
	{
		int a = 60;
		int b = 70;
		int output = a * b;
		System.out.println("mul of a and b : " + output);
	}

	void div() // div is non static method
	{
		int a = 500;
		int b = 600;
		if (a > b) 
		{
			int outcome = a / b;
			System.out.println("div of a by b is : " + outcome);
		} 
		else 
		{
			long outcome = b / a;
			System.out.println("div of b by a is: " + outcome);
		}
	}

}
