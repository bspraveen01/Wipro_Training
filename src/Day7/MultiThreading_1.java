package Day7;

class Runn1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(" Wipro Training :"+i);		}
	}
}
class Runn2 implements Runnable {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(" java Course"+i);
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading_1 {
      public static void main(String[] args) {
    	  Runnable m1 = new Runn1();
    	  Runnable m2 = new Runn2();
    	 // m2.setPriority(Thread.MAX_PRIORITY);
    	//  System.out.println(m2.getPriority());
    	Thread t1 = new Thread(m1); // m1 to run in one format.
    	Thread t2 = new Thread(m2);
    	t1.start();
    	t2.start();

      }
}
