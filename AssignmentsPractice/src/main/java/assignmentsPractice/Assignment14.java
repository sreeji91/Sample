package assignmentsPractice;
import java.util.*;
public class Assignment14 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter "+num+" elements:");
		for (int i=0;i<num;i++) 
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements:"+sum);	

	}

}
