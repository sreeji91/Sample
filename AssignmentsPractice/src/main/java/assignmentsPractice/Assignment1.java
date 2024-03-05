package assignmentsPractice;
import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("Enter the base of triagle");
		Scanner sc=new Scanner(System.in);
		float base=sc.nextFloat();
		System.out.println("Enter the height of triagle");
		float height=sc.nextFloat();
		float area=(float)0.5*base*height;
		System.out.println("The area of triagle:"+area+" Sq. Units");
		
	}

}
