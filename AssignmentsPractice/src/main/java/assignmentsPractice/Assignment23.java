package assignmentsPractice;
import java.util.*;
public class Assignment23 {
	static float balance=1000f;
	static boolean status=true;
	
	public float withdrawel(float amount)
	{
		if(amount<balance) 
		{
			
			balance=balance-amount;
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		return balance;
	}
	
	public float deposit(float amount)
	{
			
		balance=balance+amount;
		return balance;
	}
	
	public void balance()
	{
		System.out.println("Your account balance is:"+balance);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Assignment23 obj1=new Assignment23 ();
		while(status==true)
		{
		System.out.println("Please choose an option from the following(enter a number\n 1.withdraw\n 2.deposit\n 3.check balance\n 4.Exit");
		int choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.println("Please enter the amount to withdraw");
				float amount=sc.nextFloat();
				balance=obj1.withdrawel(amount);
				break;
			case 2:
				System.out.println("Please enter the amount to deposit");
				float amount1=sc.nextFloat();
				balance=obj1.deposit(amount1);
				break;
			case 3:
				obj1.balance();
				break;
			default:
				status=false;
				break;
			
			}
		}
	}
}
