package lectures;

/*
 * Create three threads and they have a common copy of the Counter object
 * 
 * Let the threads increment the Counter object for same no. of times.
 */
class CounterN {
    int count;
    synchronized void inc() {
        count = count+1;
        
        System.out.println("counter value of "+Thread.currentThread().getName()+" is: " + getCount());
        try {
    		Thread.sleep(100);}
    		catch(InterruptedException e) {	}
    }
    int getCount() {
        return count;
    }
}

class IncrementerThreadN extends Thread {
	// static Counter so that only one instance is created
	static CounterN counter = new CounterN();        // The counter that will be incremented.
	static int numberOfIncrements;   // Number of times each thread will increment it.
    public void run() {
        for (int i = 0; i < numberOfIncrements; i++) {
			synchronized(counter) {
				counter.inc();
			}
        }
    }
}

public class DemoNeedForSync {
	public static void main(String args[]) {
		int noOfThreads = 3;
		IncrementerThreadN.numberOfIncrements = 4;
		
		IncrementerThreadN t[] = new IncrementerThreadN[noOfThreads];
		
		for(int i = 0; i<noOfThreads;i++)
			t[i] = new IncrementerThreadN();
		for(int i = 0; i<noOfThreads;i++)
			t[i].start();
		try {
		Thread.sleep(2000);}
		catch(InterruptedException e) {	}
		
		
		System.out.println("The final value of the counter should be "
                + (IncrementerThreadN.numberOfIncrements*noOfThreads));
		
		System.out.println("Actual final value of counter is: " + IncrementerThreadN.counter.getCount());
		
	}

}
