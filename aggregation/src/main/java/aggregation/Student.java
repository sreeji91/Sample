package aggregation;


public class Student {
	String name;
	int rollNo;
	Address a;
	Student(String name,int rollNo, Address a)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.a=a;
	}
	public void display()
	{
		System.out.println("Nmae: "+name);
		System.out.println("Roll no:"+rollNo);
		System.out.println("House name: "+a.houseName);
		System.out.println("House number:"+a.houseNo);
		System.out.println("Pincode: "+a.pinCode);
		System.out.println("city: "+a.city);
	}
	public static void main(String[] args) {
		Address obj1=new Address(600,"abc",123456,"efg");
		Student obj2=new Student("sreeji",10,obj1);
		obj2.display();
		
	}
	

}
