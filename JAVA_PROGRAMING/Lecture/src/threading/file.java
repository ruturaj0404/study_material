package threading;
import java.io.*;
import java.util.*;
class fileread{
	static synchronized void reading(String file) throws Exception{

			FileReader FR= new FileReader(file);
//			BufferedReader br= new BufferedReader(FR);
//			
//		int ch;
//			
//			while((ch=br.read())!=-1){
//				Thread.sleep(1000);
//				System.out.println((char)ch);
//				
//				
//			}br.close();
//		}catch (Exception e) {
//			
//		}
//		
//	}
//}
		
		Scanner s=new Scanner(FR);
		try {
		while(s.hasNext()) {   
           
            String words = s.next(); 
            Thread.sleep(1000);
            System.out.println(words);
		}
		}catch(Exception e) {}
		
	}
}
	
class thread1 extends Thread{
	fileread f;
	
	public thread1(fileread f) {
		super();
		this.f = f;
	}

	public void run() {
		try {
			f.reading("\\D:\\PGDAC\\JAVA_PROGRAMING\\Lecture\\src\\threading\\thread1.txt");
			
		}catch(Exception e) {
			
		}
	}
}
class thread2 extends Thread{
	fileread f;
	
	public thread2(fileread f) {
		super();
		this.f = f;
	}

	public void run() {
		try {
			f.reading("\\D:\\PGDAC\\JAVA_PROGRAMING\\Lecture\\src\\threading\\thread2.txt");
			
		}catch(Exception e) {
			
		}
	}
}
//class thread3 extends Thread{
//	fileread f;
//	
//	public thread3(fileread f) {
//		super();
//		this.f = f;
//	}
//
//	public void run() {
//		try {
//			f.reading("\\D:\\PGDAC\\JAVA_PROGRAMING\\Lecture\\src\\threading\\thread2.txt");
//			
//		}catch(Exception e) {
//			
//		}
//	}
//}
public class file extends Thread {

	public static void main(String[] args) {
		fileread f2= new fileread ();
		fileread f= new fileread ();
		thread1 t1=new thread1(f);
		thread2 t2=new thread2(f);
//		thread2 t3=new thread2(f2);
		
		t1.start();
		t2.start();
//		t3.start();

	
	
	}
}


