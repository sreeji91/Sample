package stringPalindrome1;
import java.util.*;
public class StringPalindromeEx1 {

	public static void main(String[] args) {
		String s1="";
		String s2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to test if its palindrome or not");
		s1=sc.nextLine();
		int length=s1.length();
		for(int i=length-1;i>=0;i--)
		{
			char letter=s1.charAt(i);
			s2=s2+letter;
		}
		//System.out.println(s2);
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}

	}

}
