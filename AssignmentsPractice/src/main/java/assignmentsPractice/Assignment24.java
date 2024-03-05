package assignmentsPractice;
import java.util.*;
public class Assignment24 {
	static float amount=0;
	static float total=0;
	public static float check(float amount)
	{
		if(amount>5000) {
			total=(float)(amount-amount*0.2);
		}
		else {
			total=amount;
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount of items");
		amount=sc.nextInt();
		
		System.out.println("Payable amount:"+check(amount));
		

	}

}
