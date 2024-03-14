package classActivity2;

public class TestInterest {
	public static void main(String[] args) {
		Bank b;
		b=new Bank();
		System.out.println("Rate of interest by bank: "+b.rateOfInterest());
		b=new SBI();
		System.out.println("Rate of interest by SBI: "+b.rateOfInterest());
		b=new ICICI();
		System.out.println("Rate of interest by ICICI: "+b.rateOfInterest());
		b=new Axis();
		System.out.println("Rate of interest by Axis: "+b.rateOfInterest());
	}

}
