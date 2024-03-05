package assignmentsPractice;
import java.util.*;
public class Assignment22 {
	public static boolean check(int age)
	{
		if(age>=18)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	/*public static void display(boolean status)
	{
		if(status==true)
		{
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
	}*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(check(age)==true) {
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
		

	}

}
