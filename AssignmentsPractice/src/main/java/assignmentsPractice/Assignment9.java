package assignmentsPractice;
import java.util.*;
public class Assignment9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a charactor");
		char letter=sc.next().charAt(0);
		switch(letter)
		{
		case 'a':
			System.out.println(letter+" is a vowel");
			break;
		case 'A':
			System.out.println(letter+" is a vowel");
			break;
		case 'E':
			System.out.println(letter+" is a vowel");
			break;
		case 'e':
			System.out.println(letter+" is a vowel");
			break;
		case 'I':
			System.out.println(letter+" is a vowel");
			break;
		case 'i':
			System.out.println(letter+" is a vowel");
			break;
		case 'O':
			System.out.println(letter+" is a vowel");
			break;
		case 'o':
			System.out.println(letter+" is a vowel");
			break;
		case 'U':
			System.out.println(letter+" is a vowel");
			break;
		case 'u':
			System.out.println(letter+" is a vowel");
			break;
		default:
			System.out.println(letter+" is NOT a vowel");
		}
}

}
