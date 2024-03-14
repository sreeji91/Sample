//Program to withdraw amount from an ATM 
// Class 1- Bank, One method to set pin from „User‟ class and 
//validate Pin in another method 
 //[Valid pins – 1001, 1234, 1212] 
// Pin number should declared as private 
// Class 2 – User Get the pin from User

package encapsulationClassActivity;

public class Bank {
	private long pin;

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}
	

}
