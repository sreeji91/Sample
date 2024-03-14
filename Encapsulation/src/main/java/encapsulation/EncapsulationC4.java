package encapsulation;

public class EncapsulationC4 {
	public static void main(String[] args) {
		EncapsulationC3 obj1=new EncapsulationC3();
		obj1.setHouseNo(12);
		System.out.println("HouseNo:"+ obj1.getHouseNo());
		obj1.setPincode(456);
		System.out.println("Pincode:"+ obj1.getPincode());
		
	}
	
	
}
