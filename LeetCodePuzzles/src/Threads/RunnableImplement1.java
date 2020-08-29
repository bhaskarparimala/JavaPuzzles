package Threads;

public class RunnableImplement1 implements Runnable {

	private Runnable target;
	@Override
	public void run() {
		if(target!=null)
		System.out.println("hi");
		else
			System.out.println("no runnable");
	}
	
	public void run(int n) {
		System.out.println("n is "+n);
	}
	public static void main(String[] args) {
		RunnableImplement1 ri = new RunnableImplement1();
		Thread t1 = new Thread(ri);
		t1.start();
		
	}
}
