package assignmentsPractice;
import java.util.*;
public class Assignment12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find it prime or not");
		int num=sc.nextInt();
		boolean status=false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				status=true;
				break;
			}
		}
		if(status==true)
		{
			System.out.println(num+" is not a prime number");
		}
		else {
			System.out.println(num+" is a prime number");
		}
		

	}

}
