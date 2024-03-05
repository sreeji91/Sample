package stringExample;

public class StringSample {

	public static void main(String[] args) {
		String s1="Hello world";
		String s2="Hello world";
		String s3="Welcome to java";
		System.out.println(s1.length()); 
		System.out.println(s2);
		System.out.println(s3);
		String s4=new String("hello");
		String s5=new String("hello");
		String s6=new String("welcome");
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		s1=s1.concat(s3);// Concatenation
		System.out.println(s1);
		
		String s11="Hello";
		String s12="Hi";
		System.out.println("Check if strings are equal");
		System.out.println(s11.equals(s12));
		String s13="hello";
		System.out.println(s11.equals(s13));
		System.out.println("Check if strings are equal irrespective of case");
		System.out.println(s11.equalsIgnoreCase(s13));
		System.out.println("Check if strings are equal, less(negative number) or greater(pos number)");
		System.out.println(s11.compareTo(s12));
		System.out.println(s11.compareTo(s13));
		System.out.println(s11.charAt(3));
		System.out.println(s11.toUpperCase());
		System.out.println(s12.toLowerCase());
		String s14="  hello world!!  ";
		System.out.println(s14.trim());
		System.out.println(s11.startsWith("H"));
		System.out.println(s11.startsWith("p"));
		System.out.println(s11.endsWith("H"));
		System.out.println(s11.endsWith("o"));
		System.out.println(s11.contains("e"));
		System.out.println(s11.contains("p"));
		
		
		System.out.println("String Buffer");
		StringBuffer s21=new StringBuffer("Hello");
		StringBuffer s22=new StringBuffer(" World!!");
		System.out.println(s21.append(s22));
		System.out.println(s21.insert(5," java "));
		System.out.println(s21.replace(6,11," coding "));
		System.out.println(s21.delete(6,13));
		System.out.println(s21.reverse());
		System.out.println(s21.capacity());
		s21.ensureCapacity(50);
		System.out.println(s21.capacity());
		
		
		
		
	
		
		

	}

}
