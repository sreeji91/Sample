package assignmentsPractice;

import java.util.*;
public class Constructor1
{
	static int reverse=0;
	int reminder;
	static int num;
	Constructor1()
	{
		this(num);
		System.out.println("The reverse of number is:"+reverse);
	}
	Constructor1(int num)
	{
		while(num!=0)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
			num/=10;
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		Constructor1 obj1=new Constructor1();
	}
}