package threading;

 class counter {
	static synchronized void increment() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"i "+i);
			try {
			     Thread.sleep(100);
			   } catch (Exception e) {
			      
			   }
		}
	}
	
	static synchronized void decrement() {
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+"a "+i);
			try {
			     Thread.sleep(100);
			   } catch (Exception e) {
			      
			   }
		}
	}
 }

class incrementruable implements Runnable {
counter c;

	public incrementruable(counter c) {
	super();
	this.c = c;
	Thread t = new Thread(this);
	 t.start();
}

	@Override
	public void run() {
			c.increment();	
	}
	
}
class decrementable implements Runnable{
counter c1;

	public decrementable(counter c1) {
	super();
	this.c1 = c1;
	Thread t = new Thread(this);
	 t.start();
}

	@Override
	public void run() {
	
		c1.decrement();
	}
	
}
public class static_syncronization{
	public static void main(String[] args) {
		counter c=new counter();
		counter c11=new counter();
		incrementruable i=new incrementruable(c);
		decrementable d=new decrementable(c11);
	;

	}
}
 



