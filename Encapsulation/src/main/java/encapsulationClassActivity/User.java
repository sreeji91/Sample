package encapsulationClassActivity;
import java.util.*;
public class User {
	public void check(long pincode)
	{
		if(pincode==1001||pincode==1234 || pincode==1212)
		{
			System.out.println("The pincode entered is valid");
		}
		else
		{
			System.out.println("Invalid pin code");
		}
	}
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("please enter a pincode:(4 digits)");
	long pincode=sc.nextLong();
	Bank obj1=new Bank();
	obj1.setPin(pincode);
	System.out.println("entered pin code is: "+obj1.getPin());
	User obj2=new User();
	obj2.check(pincode);
	
}
}
