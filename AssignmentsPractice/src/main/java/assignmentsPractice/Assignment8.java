package assignmentsPractice;
import java.util.*;
public class Assignment8 {

	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=1;
		int sum=0;
		System.out.println("Enter the limit to generate fibonacci series");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		for(int i=0;i<limit;i++)
		{
			System.out.print(sum+" ");
			firstNum=secondNum;
			secondNum=sum;
			sum=firstNum+secondNum;
		}

	}

}
