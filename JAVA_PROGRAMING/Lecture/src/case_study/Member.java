package case_study;
import java.io.*;
import java.util.Scanner;
class appendable1 extends ObjectOutputStream{

	public appendable1(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}
	protected void writeStreamHeader() {}
}


public class Member implements Serializable,Library {

int memberid;
String membername;
int age;
String address;

public Member() {
	super();
	this.memberid=111;
	this.membername="ruturaj";
	this.age=24;
	this.address="pune";
}
@Override
public String toString() {
	return "Member [memberid=" + memberid + ", membername=" + membername + ", age=" + age + ", address=" + address
			+ "]";
}



	@Override
	public void AddRecord() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter member record details:");
		System.out.println("id:");
	memberid= s.nextInt();
	System.out.println("name:");
	membername=s.next();
	System.out.println("age:");
	age=s.nextInt();
	System.out.println("address:");
	address=s.next();
	
		
	}

	@Override
	public void DisplayRecord() {
		
//		Library.PrintMessage();
		System.out.println(memberid);
		System.out.println(membername);
		System.out.println(age);
		System.out.println(address);
		
		Library.PrintDetails();
	}
	
	
	

}
