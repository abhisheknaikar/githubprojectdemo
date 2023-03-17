import java.util.Scanner;

public class Mycalculator2 implements Calculator
{
    public void mul()
    {
    	Scanner scn = new Scanner (System.in);
    	System.out.println("Enter two numbers");
    	int a=scn.nextInt();
    	int b=scn.nextInt();
    	int c=a*b;
    	System.out.println(c);
    }
    public void div()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=scn.nextInt();
    	int b=scn.nextInt();
    	int c=a/b;
    	System.out.println(c);
    }
}
