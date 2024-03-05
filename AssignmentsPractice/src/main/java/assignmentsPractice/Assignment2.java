package assignmentsPractice;
import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		int num3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		System.out.println("The entered numbers are: "+num1+" and "+num2);
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("The entered numbers after swapping are: "+num1+" and "+num2);
	}

}
