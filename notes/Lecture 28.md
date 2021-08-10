## Lecture 28
- Multithreading

### Thread States
- Multiple threads possible in the `Ready to Run` state but only one thread can be `Running` at a time
	-  `Scheduler` picks the thread that runs
- `Yield` -> running thread goes back to thread pool and frees up resources
- `Yield` and `Blocked`
	- `Yield` threads directly go back to the pool
	- `Blocked` threads stay in `Blocked` state for a while, based on a condition
		- Resources are freed up for other threads tho

![thread-states](../imgs/Thread%20States.png)

**Threads**
- `main()` -> `main` thread
- Create child threads from main thread

### Thread Scheduler
- Threads are given a priority
	- `main()` has a priority of 5
- Assign priorities to threads
- Scheduler picks thread with **highest priority**
- Context switching takes place when a thread's state changes

**Thread Priorities**
- Relative priority of one thread to another
- Scheduler picks thread with **highest priority**
- Priority scale -> 1 (lowest) to 10 (highest)
- For threads with same priority, the scheduler can have a time slicing mechanism
	- Each thread is given a specific amount of time, irrespective of its execution
- This is called as `Round Robin`^

**Non-Preemptive Scheduling**
- A thread executes until it needs some resource or goes into `sleep` 
- This is irrespective of the priority of the task
- A lower priority thread can run while a higher priority thread is getting ready to run
	- The lower priority thread will not be blocked if it is executing, even if higher priority thread is ready
- Context Switching
	- Threads voluntarily relinquish control
	- Highest priority thread that is ready to run is given the CPU

**Preemptive Scheduling**
- When a higher priority thread is in `Ready to Run` state, lower priority thread will be forced to stop (goes into `Ready` state)
	- Control returns to lower priority thread after higher priority thread is executed
- Context Switching
	- Thread can be preempted by a higher priority thread
	- Higher priority thread runs as soon as it is ready

**Round Robin Preemptive Scheduling**
- Each task is given an equal time slice
- Priority decides the task that is executed
- The task is stopped after it's time slice, even if the task is not finished

### Java Multithreading
- `Thread` class
- `main` thread should be the first to start and last to end
- User defined threads:
	1. Implement `Runnable` interface
	2. Extend `Thread` class
- An already started state cannot be started again
	- `IllegalStateException`

**Runnable Interface**
- One method -> `run()`
	- Implicitly called by `start()`
		- `start()` invokes no argument implementation of `run()` by default
	- Explicitly calling `run()` doesn't lead to multithreading
- Method should implement the task to be done by the thread
- Threads are grouped
- **If `run()` is not implemented -> compile time error**
- Output of a thread based program cannot be determined theoretically due to context switching and thread scheduling (scheduling depends on kernel)
- **Best practice -> start thread externally**

**Thread Class**
- Extend `Thread` class
- Use `Thread()` constructor using `super`
- `Thread` provides empty implementation of `run()`
	- If `run()` is not implemented in user class, no error but nothing will be printed
- When `run()` from both `Thread` and `Runnable` is available (overloading or something), `start()` executes `run()` from `Thread`
```java
// returns reference to current thread
Thread t = Thread.currentThread();

// set name and priority
t.setName(<string>);
t.setPriority(<int from 1 to 10>);

// user defined thread using Runnable
class NewThread implements Runnable {
	// constructor should return an object of a class implementing Runnable
	// start() starts the thread
	// `this` is used to invoke run externally
	NewThread() {
		t = new Thread(this, <name of thread>);
		// start thread
		t.start();
	}
	
	// run() to implement task
	// sleep should always be in try block since it can throw exception
	// sleep puts thread in Blocked state
	public void run() {
		try {
			// code
			Thread.sleep(<time in milliseconds>);
		} catch (InterruptedException e) {
			// code
		}
	}
}

class Demo {
	public static void main(String[] args) {
		// reference for new thread
		NewThread nt = new NewThread();
		// best practice
		nt.t.start(); // start new thread externally
		
		// alternately, we can create a Thread object
		// Thread constructor takes object of custom thread as arg
		Thread t = new Thread(new NewThread, <name>);
	}
}
```
![thread-class](../imgs/Thread%20Class.png)