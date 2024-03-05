package assignmentsPractice;
import java.util.*;
public class Assignment20 {

	public float area(int l, int b)
	{
		float area_of_rect=l*b;
		return area_of_rect;
	}
	public float area(int a)
	{
		float area_of_rect=a*a;
		return area_of_rect;
	}
	public float area(float r)
	{
		float area_of_rect=(float)3.14*r*r;
		return area_of_rect;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Assignment20 obj1=new Assignment20();
		System.out.println("the area of rectangle is:"+obj1.area(length,breadth)+" sq.units");
		System.out.println("Enter the length of square");
		int side=sc.nextInt();
		System.out.println("the area of square is:"+obj1.area(side)+" sq.units");
		System.out.println("Enter the radius of circle");
		float r=sc.nextInt();
		System.out.println("the area of circle is:"+obj1.area(r)+" sq.units");
	}

}
