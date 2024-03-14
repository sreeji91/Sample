package encapsulation;

public class EncapsulationC1 {
private long acNo;
private String name;
private String e_mail;

public void setter(long acNo,String name, String e_mail)

{
	this.acNo=acNo;
	this.name=name;
	this.e_mail=e_mail;
	
}
public void getter()
{
	System.out.println("Account number:"+acNo);
	System.out.println("Name:"+name);
	System.out.println("e mail:"+e_mail);
}
}
