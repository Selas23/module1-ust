package multithreading;

import java.util.Scanner;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 5;i++) {
			System.out.println("enter your input");
			int a = new Scanner(System.in).nextInt();
			System.out.println("go the input proceeding");
			System.out.println(Thread.currentThread().getName() + " = " + i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
