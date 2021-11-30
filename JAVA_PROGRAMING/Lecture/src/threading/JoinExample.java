package threading;

class printing extends Thread
{
	String msg;
	printing(String t)
	{
		msg=t;
	}
	public void run()
	{	
		try
		{
		 for(int i=0;i<10;i++)
		 {
			 System.out.println(msg);
	         Thread.sleep(1000);
		 }
		}catch(Exception d) {}
	}
}
public class JoinExample {

	public static void main(String[] args) throws Exception{
		printing p= new printing("hello");
		printing p1= new printing("welcome");
		printing p2= new printing("test2");
		
		
		p.start();
		
		p1.start();
		p.join(); 
		
		p2.start();
		
	}

}