package threading;
class even extends Thread{
	void print() {
		try {
			for (int i=1;i<=20;i++) {
				if(i%2==0) {
					System.out.println(i);
					Thread.sleep(100);
				}
			} 
		} catch(Exception e) {
			
		}
	}
public void run() {
	
}
}
class odd extends Thread {
	void print() {
		try
		{
		   for( int i=1;i<=20;i++) {
			   if( i%2!=0) {
				   System.out.println(i);
		           Thread.sleep(1000);}}
		}catch(Exception r) {}
		
	}
	public void run()
	{}
}
public class evenodd {

	public static void main(String[] args) {
		 even e= new even();
		  e.print();
		 e.start();
		      
		 odd o= new odd();
		 o.print();
		 Thread t= new Thread(o);
		 t.start();

	}

}