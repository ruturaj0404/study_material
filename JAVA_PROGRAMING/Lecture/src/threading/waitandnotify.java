package threading;

public class waitandnotify {
	public static void main(String[] args){
        ThreadB1 b = new ThreadB1();
        b.start();

        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                 b.wait();
            }catch(Exception e){ }

            System.out.println("Total is: " + b.total);
        }
    }
}

class ThreadB1 extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
           notify();
        }
    }
}
