 ## Lecture 29
- Multiple Threads and Priorities

### Stack for Thread
- A stack for a thread is created only by calling `start()` method
- Explicitly executing `run()` or creating thread instance doesn't create a new stack for the thread

### Creating Multiple Threads
- Use the extending `Thread` class approach
	- Create an array for the custom thread class
	- Use a `for` loop to instantiate objects for the array instance references
	- Use a `for` loop to start/stop threads as needed

### Methods
- `<thread>.isAlive()`
	- Check if a thread is alive or terminated
- `<thread>.join()`
	- If the `join()` method is using in the main thread, the thread is **joined** to the main thread
		- Join here implies finish
	- The execution of remaining part of `main()` is not done until the threads join
	- `join()` throws `InterruptedException` so use `try catch` block