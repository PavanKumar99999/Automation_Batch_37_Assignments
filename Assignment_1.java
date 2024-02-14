package nov_21_2023;
// write a program to find out the default values of all the data types from global variable
public class First_Assignment  //main class
{//global variables
	byte b;
	short s;
    int a;
     long l;
     double d;
     float f;
     boolean bb;
     char c;
     String ss;
public static void main(String args[]) //main method
{
	First_Assignment fa= new First_Assignment(); //crating an object to call global variable
          System.out.println("default value of byte is :- "+fa.b);
          System.out.println("default value of short is :- "+fa.s);
          System.out.println("default value of int is :- "+fa.a);
          System.out.println("default value of long is :- "+fa.l);
          System.out.println("default value of double is :- "+fa.d);
	      System.out.println("default value of float is :- "+fa.f);
	      System.out.println("default value of boolean is :- "+fa.bb);
	      System.out.println("default value of char is :- "+fa.c);
	      System.out.println("default value of String is :- "+fa.ss);	
}

}
