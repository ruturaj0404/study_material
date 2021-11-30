package iofile;
import java.io.*;
import java.util.Scanner;
public class employee_record {
	String Name;
	int id;
	int salary;
	int count=0;
	File f=new File ("Emp3.txt");
	Employee e;
	String Words[]=null;
 void writefile() throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter employee details : Name ,ID, Salary respectively");
		 Name=s.next();
	     id=s.nextInt();
		 salary=s.nextInt();
		e=new Employee(Name,id,salary);
		try {
		
		int len=(int)f.length();
		if (len<=0) {
			ObjectOutputStream o= new ObjectOutputStream(new FileOutputStream(f,true));
			o.writeObject(e);
//			e.display();
			o.close();
		}
		else {
			
			appenbale o=new appenbale(new FileOutputStream(f,true));
			o.writeObject(e);
//			e.display();
			o.close();
		}
		
		}catch(Exception E1) {
			
		}
	}

void readfile() throws IOException {

	try {
	ObjectInputStream oi= new ObjectInputStream(new FileInputStream(f));
	while((e=(Employee)oi.readObject())!=null) {
		e.display();
		count++;
//		System.out.println(e);
		e.display();
		
	}
	
	}catch(Exception E2) {
		System.out.println(E2);
	}
	
}
void count() {
	e.count(count);
}
void searchData() throws Exception{
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	
	String s;
	int count1=0;
	Scanner sc=new Scanner(System.in);
	try {
	System.out.println("Enter word to search");
	String Input=sc.next();
	while((s=br.readLine())!=null) {
		Words=s.split("");
		for(String word:Words) {
			if(word.equals(Input)) {
				count1++;
			}
		}
	}
	if(count1!=0) {
		System.out.println("give data is present in file for"+count+"times in the file");
	}
	else {
		System.out.println("given data is not found in file");
	}
	fr.close();
	}catch(Exception e2) {}
}

	public static void main(String[] args) throws Exception {
		Scanner s1=new Scanner(System.in);
		employee_record er=new employee_record();
		System.out.println("1.Add Employee Details");
		System.out.println("2.Display Employee Details");
	    System.out.println("3.show count");
	    System.out.println("enter your choice");
	    int x=s1.nextInt();
	    switch(x) {
	    case 1: er.writefile();
	    break;
	    case 2: er.readfile();
	    break;
	    case 3: er.count();
	    break;
	    case 4: er.searchData();
	    break;
	    }
		
	}

}
