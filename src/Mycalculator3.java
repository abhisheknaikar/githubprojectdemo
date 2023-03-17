import java.util.Scanner;

public class Mycalculator3 implements Calculator
{
  public void mul()
  {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter two numbers");
	  int a=scn.nextInt();
	  int b=scn.nextInt();
	  if (a==0 || b==0)
	  {
		  System.out.println("numbers are zero, provide non zero values");
	  }
	  else
	  {
		  int c=a*b;
		  System.out.println(c);
	  }
  }
  public void div()
  {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter two numbers");
	  int a=scn.nextInt();
	  int b=scn.nextInt();
	  if ( b==0)
	  {
		  System.out.println("b is  zero, provide non zero values");
	  }
	  else
	  {
		  int c=a/b;
		  System.out.println(c);
	  }
  }
	
}
