package assignmentsPractice;
import java.util.*;
public class Assignment15 {
	public static void main(String args[])
	{
		boolean status=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elemnts");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("enter "+num+" elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you wanted to search");
		int search=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			if(arr[i]==search)
			{
				status=true;
				break;
			}
		}
		if(status==true)
		{
			System.out.println(search +" is found");
		}
		else {
			System.out.println(search +" is not found");
		}
	}

}
