package stringPalindromeEx2;
import java.util.*;
public class StringPalindromeEx2 {

	public static void main(String[] args) {
		String s1="";
		String s5="";
		System.out.println("Palindrome or NOt");
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		StringBuffer s3=new StringBuffer(s1);
		StringBuffer s4=s3.reverse();
		s5=s4.toString();
		if(s1.equalsIgnoreCase(s5)) {
			System.out.println(s1+" Is palindrome");
		}
		else
		{
			System.out.println(s1+" is NOT a palindrome");
		}
	}

}
