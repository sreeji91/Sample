package assignmentsPractice;
import java.util.*;
public class Assignment16 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row elemnts of matrix1");
		int row1=sc.nextInt();
		System.out.println("Enter the number of column elemnts of matrix 1");
		int col1=sc.nextInt();
		System.out.println("Enter the number of row elemnts of matrix2");
		int row2=sc.nextInt();
		System.out.println("Enter the number of column elemnts of matrix 2");
		int col2=sc.nextInt();
		int matrix1[][]=new int[row1][col1];
		int matrix2[][]=new int[row2][col2];
		int sum[][]=new int[row1][col1];
		if(row1==row2 && col1==col2)
		{
			System.out.println("Enter the elements of matrix1");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					matrix1[i][j]=sc.nextInt();
				}
			}
			System.out.println("matrix1:");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					System.out.print(matrix1[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Enter the elements of matrix2");
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					matrix2[i][j]=sc.nextInt();
				}
			}
			System.out.println("matrix1:");
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					System.out.print(matrix2[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					sum[i][j]=matrix1[i][j]*matrix2[i][j];
					System.out.print(sum[i][j]+" ");
					
				}
				System.out.println();
			}
			
		}
	}

}
