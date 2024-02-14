package nov_6_2023;
/*Write a program in a class with 5 methods (2 static and 3 non-static) with same method name 
 * 1) first method with argument "int a"
 * 2) second method with argument is "double a"
 * 3) third method with argument is "char a"
 * 4) fourth method with argument is "boolean a"
 * 5) fifth method with argument is "String a"
 */
public class Eleventh_Assignment //main class
{
	static void number(int a) // this is a static method with one parameter
	{
		System.out.println(a);
	}
	
	static void decimal(double b) //this is a static method with one parameter
	{
		System.out.println(b);
	}
	
	public static void main(String args[]) //main method
	{
		number(9); //calling static method
		decimal(9.9); //calling static method
		Eleventh_Assignment e11 = new Eleventh_Assignment(); //creating an object to call non- static methods
		e11.alphabet('P');//calling non-static method
		e11.result(true);//calling non-static method
		e11.name("pavan");//callinf non-static method
		
	}
	
	void alphabet(char c) // this is a non - static method with one parameter 
	{
		System.out.println(c);
	}
	void result(boolean bb)// this is a non- static method with one parameter
	{
		System.out.println(bb);
	}
	void name(String s) //this is a non - static method with one parameter
	{
		System.out.println(s);
	}
}
