package lectures;

/*
 * Create three threads and each has a copy of the Counter object
 * 
 * Thread 1 is given the priority 5 and should increment twice.
 * Thread 2 is given the priority 6 and should increment thrice.
 * Thread 3 is given the priority 7 and should increment four times.
 */

class Counter {
	int count;

	void inc() {
		count = count + 1;

		System.out.println("counter value of " + Thread.currentThread().getName() + " is: " + getCount());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
	}

	int getCount() {
		return count;
	}
}

// Create the class for multi-threading
class IncrementerThread extends Thread {
	Counter counter;
	int noOfIncr;

	// name -> name of thread, no -> no of increments, p -> priority of thread
	IncrementerThread(String name, int no, int p) {
		setName(name);
		setPriority(p);
		noOfIncr = no;
		counter = new Counter();
	}

	public void run() {
		for (int i = 0; i < noOfIncr; i++) {
			counter.inc();
		}
	}
}

public class testMultipleThreads {
	public static void main(String args[]) {
		int noOfThreads = 3;
		int i;
		IncrementerThread t[] = new IncrementerThread[noOfThreads];
		/*
		 * Execute the child threads for infinite no. of times and Comment the
		 * Thread.sleep statement in the child thread and Observe. ans -> thread 2 has
		 * higher count due to higher priority
		 */

		// Observe when all the three child threads have same priority
		// ans -> similar counts

		/*
		 * Let the main thread sleep for 1000ms only. Observe the output. How to ensure
		 * that the main thread is the last to finish? ans -> set timer to max possible
		 * so that all child threads finish before main
		 */

		for (i = 0; i < noOfThreads; i++)
			// Thread Creation
			t[i] = new IncrementerThread("Thread " + i, i + 2, i + 5);

		for (i = 0; i < noOfThreads; i++)
			// Start the threads
			t[i].start();

		// putting main thread to sleep while the child are alive
		// less preferred
		while (t[0].isAlive() | t[1].isAlive() | t[2].isAlive()) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}

		// to make sure main is the last to finish using join()
		// join() throws InterruptedException so use `try catch`
		// best practice
		try {
			t[0].join();
			t[1].join();
			t[2].join();
		} catch (InterruptedException e) {
		}

		for (i = 0; i < noOfThreads; i++)
			// Stop the threads
			t[i].stop();

		for (i = 0; i < noOfThreads; i++)
			System.out.println("Actual final value of counter" + i + " is: " + t[i].counter.getCount());

	}

}
