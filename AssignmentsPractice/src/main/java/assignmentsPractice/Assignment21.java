package assignmentsPractice;
import java.util.*;
public class Assignment21 {
	static int reverse=0;
	public static int reverse(int num)
	{
		while(num>0)
		{
			int reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}
		return reverse;
	}
	public static void palindrome(int num,int reverse)
	{
		if(num==reverse)
		{
			System.out.println("The entered number is palindrome");
		}
		else
		{
			System.out.println("The entered number is not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if its palindrome");
		int num=sc.nextInt();
		reverse=reverse(num);
		System.out.println("Reverse of number is: "+reverse);
		palindrome(num,reverse);

	}

}
