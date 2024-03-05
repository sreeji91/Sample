package assignmentsPractice;
import java.util.*;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		System.out.println("The entered numbers are: "+num1+" and "+num2);
		num2=num1+num2;
		num1=num2-num1;
		num2=num2-num1;
		System.out.println("The entered numbers are: "+num1+" and "+num2);
	}

}
