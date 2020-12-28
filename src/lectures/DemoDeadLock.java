package lectures;

/*
 * The following code has deadlock and 
 * try to resolve it using the two approaches discussed in the class.
 */
class Res1 {
	int i = 10;
}

class Res2 {
	int i = 10;
}

public class DemoDeadLock {
	public static void main(String args[]) {
		Res1 a = new Res1();
		Res2 b = new Res2();

		Runnable block1 = new Runnable() {
			public void run() {
				synchronized (a) {
					try {
						// wait for block2 to execute
						a.wait();
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (b) {
						System.out.println("In block 1");
					}
				}
			}
		};

		Runnable block2 = new Runnable() {
			public void run() {
				synchronized (b) {
					synchronized (a) {
						a.notifyAll();
						System.out.println("In block 2");
					}
				}
			}
		};

		new Thread(block1).start();
		new Thread(block2).start();
	}
}
