package assignmentsPractice;
import java.util.*;
public class Assignment17 {

	static String name="";
	static int age=0;
	public static void getValues()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your age:");
		age=sc.nextInt();
		Assignment17.display(name, age);
	}
	public static void display(String name,int age)
	{
		System.out.println("Your Name:"+name);
		System.out.println("Your age:"+age);
	}
	public static void main(String[] args) {
		
		Assignment17.getValues();

	}

}
