package Threads;

public class ThreadPriority {
 static class InnerClass implements Runnable {
	 @Override
	 public void run() {
		 System.out.println("Innter Thread...");
	 }
 }
 
 public static void main(String[] args) {
	// InnerClass ic = new InnerClass();
	 Thread t1 = new Thread(new InnerClass());
	 t1.setPriority(1);
	 t1.start();
	 System.out.println("Main Class"); // it will be executed first
	 //as main thread defualt priority is 5
	 
	 //if give t1.setPriority(6)
	 // then T1 will execute first.
 }
}
