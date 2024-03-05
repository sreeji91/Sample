package assignmentsPractice;
import java.util.*;
public class Assignment11 {
	public static void main(String args[])
	{
		int digits=0;
		int reminder=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find it Armstrong or not");
		int num=sc.nextInt();
		int number=num;
		while(num>0)
		{
			num=num/10;
			digits+=1;
		}
		num=number;
		for(int i=1;i<=digits;i++)
		{
			reminder=num%10;
			sum=sum+(int)Math.pow(reminder, digits);
			num/=10;
		}
		if(number==sum)
		{
			System.out.println(number+" is Armstrong");
		}
		else {
			System.out.println(number+" is NOT Armstrong");
		}
		

	}

}
