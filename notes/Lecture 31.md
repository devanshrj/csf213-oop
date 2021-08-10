## Lecture 31
- Inter Process Communication

### Inter Process Communication
- Assume a producer and consumer thread
	- The producer performs some operation
	- The consumer performs some operation after the producer
	- Here, the threads need to communicate with each other after finishing their task
- `Object` class
	- `wait()` -> **releases lock** and goes to blocked state
	- `notify()` -> notifies a single thread based on scheduler (so random)
	- `notifyAll()` -> notifies all other threads (so every thread has equal chance)
- Example: producer generates data, consumer reads data
	- If the consumer is locked first, it goes to `wait` state
	- The producer generates data and then `notify` other threads
	- A consumer thread can then come out of `wait` state to read the data
- `wait` maybe interrupted like `sleep` state
	- Include `wait` in a `try catch` block, `catch InterruptedException`
	- Include a **flag** to use with `wait`
- `wait` can have a parameter for time, like `sleep`
- `notify` after all the tasks are completed in the code block
	- Releases CPU, frees resources and comes out of monitor/lock
```java
// try catch block for wait()
try {
	// wait on a block/class
	wait();
	// wait on an object
	<object>.wait();
} catch (Exception e) {}
```

### DeadLock
- Two threads hold one resource and are fighting for the next one to complete
- Two solutions:
	1. Arrange resources and threads as required
	2. Use `wait` and `notify` mechanism

### Misc
- `yield` and `sleep`
	- Always use `sleep`
	- `yield` changes the state of thread to `Ready to Run` so it can be picked by the scheduler as soon as it is yielded, which is not desirable
- `getState()`
	- Access current state of thread