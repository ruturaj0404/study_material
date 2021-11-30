package threading;

class thread extends Thread{
	boolean stop = false;
	public void run()
	{
//		synchronized (this) { //this represent current object
		for (int i=0;i<=5;i++) { 
			System.out.println(i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			if(stop)return;
		}
	}
//	}
	
}
public class stopthread {

	public static void main(String[] args) throws Exception {
		thread t=new thread();
		Thread ti=new Thread(t);
		Thread t1=new Thread(t);
		ti.start();
		ti.join();
		t1.start();
		
		System.in.read();//wait till enter key pressed
		t.stop=true;
		System.out.println("enter is pressed");
	}

}



