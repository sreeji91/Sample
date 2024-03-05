package assignmentsPractice;
import java.util.*;
public class Assignment18 {
	static int fact=1;
	public static int factorial(int num)
	{
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int num=sc.nextInt();
		factorial(num);
		System.out.println("The factorial of "+num+" is: "+fact);
	}

}
