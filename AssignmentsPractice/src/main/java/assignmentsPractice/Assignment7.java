package assignmentsPractice;
import java.util.*;
public class Assignment7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows in the pyramid");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=row-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
