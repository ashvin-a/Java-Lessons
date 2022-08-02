class thread1 implements Runnable {
	public void run() {
		System.out.println("Odd numbers: ");
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
		System.out.println("     ");
	}
}

class thread2 implements Runnable {
	public void run() {
		System.out.println("Even numbers: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
}

public class Threading {
	public static void main(String args[]) {
		// odd
		Runnable r1 = new thread1();
		Thread t1 = new Thread(r1);
		t1.start();

		// even
		Runnable r2 = new thread2();
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
