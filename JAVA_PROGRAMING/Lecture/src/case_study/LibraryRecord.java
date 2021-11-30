package case_study;

import java.io.*;

public class LibraryRecord  {


	File f=new File("member2.ser");
	void ADDToFile(Member m)throws IOException {
		try{
			int len=(int)f.length();
		    if (len<=0) {
			ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(f,true));
			o.writeObject(m);
			o.close();
		}
		    else {
			
		    	appendable1 o=new appendable1(new FileOutputStream(f,true));
			o.writeObject(m);
			o.close();
		}
		
		}catch(Exception E1) {
			System.out.println(E1);
		}
		}
		
	void showFile(Member m) {
			
			try {
				ObjectInputStream oi=new ObjectInputStream(new FileInputStream(f));
				do{
					m=(Member)oi.readObject();
				
				System.out.println(m);
				
				}while(m!=null);
				oi.close();
			}catch(Exception e1) {
				System.out.println(e1);
			}
		}
		
	

	public static void main(String[] args)throws IOException {
	
	
	Member m1=new Member();
	m1.PrintMessage();
	m1.AddRecord();
	m1.DisplayRecord();
	
	LibraryRecord lr=new LibraryRecord ();
	lr.ADDToFile(m1);
	lr.showFile(m1);

	}

}
