package assignmentsPractice;
import java.util.*;
public class Assignment13 {

	public static void main(String[] args) {
		int odd=0;
		int even=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a lower limit:");
		int lower=sc.nextInt();
		System.out.println("Enter an upper limit:");
		int upper=sc.nextInt();
		for(int i=lower;i<=upper;i++)
		{
			if(i%2==0)
			{
				even+=1;
			}
			else {
				odd+=1;
			}
		}
		System.out.println("number of even numbers are: "+even+" and number of odd numbers are: "+odd);

	}

}
