package assignmentsPractice;

public class Assignment26 {
	static String s1="";
	static	String reverse="";
	Assignment26()
	{
		this.s1=s1;
	}
	public String reverseString(String s1)
	{
	for(int i=s1.length()-1;i>=0;i--)
	{
		char letter =s1.charAt(i);
		reverse=reverse+letter;
	}
	return reverse;
	}
	public void display(String s1)
	{
		reverse=reverseString(s1);
		if(s1.equalsIgnoreCase(reverse))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

	public static void main(String[] args) {
		Assignment26 obj1=new Assignment26();
		obj1.display("java");
		obj1.display("malayalam");
		

	}

}
