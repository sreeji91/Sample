package assignmentsPractice;
import java.util.*;
public class Assignment25 {
	static int marks=0;
	public int total(int mark1,int mark2,int mark3)
	{
		marks=mark1+mark2+mark3;
		return marks;
	}
	
	public void display(int marks)
	{
		if(marks>40 && marks<=60)
		{
			System.out.println("Student grade:C");
		}
		else if(marks>60 && marks<=80)
		{
			System.out.println("Student  grade:B");
		}
		else if(marks>80 && marks<=100)
		{
			System.out.println("Student  grade:A");
		}
		else
		{
			System.out.println("Student  grade:Failed!!");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three marks of student1");
		int s1Mark1=sc.nextInt();
		int s1Mark2=sc.nextInt();
		int s1Mark3=sc.nextInt();
		System.out.println("Enter three marks of student2");
		int s2Mark1=sc.nextInt();
		int s2Mark2=sc.nextInt();
		int s2Mark3=sc.nextInt();
		Assignment25 obj1=new Assignment25();
		marks=obj1.total(s1Mark1,s1Mark2,s1Mark3);
		System.out.println("Total marks of student 1:"+marks);
		obj1.display(marks);
		Assignment25 obj2=new Assignment25();
		marks=obj2.total(s2Mark1,s2Mark2,s2Mark3);
		System.out.println("Total marks of student 2:"+marks);
		obj2.display(s2Mark3);

	}

}
