package assignmentsPractice;
import java.util.*;
public class Assignment19 {
	static int sum=0;
	static float avg=0;

	public static void sum(int num1, int num2)
	{
		sum=num1+num2;
		average(sum);
	}
	public static void average(int sum)
	{
		
		avg=(float)sum/2;
		System.out.println("The sum of numbers:"+sum+" and average of numbers:"+avg);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sum(num1,num2);
				

	}

}
