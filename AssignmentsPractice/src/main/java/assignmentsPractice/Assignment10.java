package assignmentsPractice;
import java.util.*;
public class Assignment10 {

	public static void main(String[] args) {
		int reverse=0;
		int reminder=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find its reverse");
		int num=sc.nextInt();
		int number=num;
		while(num>0)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
			num/=10;
		}
		if(number==reverse) {
			System.out.println("The reverse of "+number+" is:"+reverse+" and its a palindrome");
		}
		else 
		{
			System.out.println("The reverse of "+number+" is:"+reverse+" and is not a palindrome");
		}

	}

}
