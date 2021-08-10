## Lecture27
- MultiThreading

### Multi Tasking
**Analogy**
- Restaurant with one kitchen one shelf
	- Restaurant -> CPU core
	- Kitchen -> Process
	- Shelf -> Memory (storage)
	- Chef -> Thread (one order at a time, step by step)
- Single Threading -> one chef
	- Since there's only a single chef and he can only perform one task at a time, resources are wasted
	- Even if the stove is free, he cannot use it if he's cutting vegetables
- Multi Threading -> two chefs
	- Since there are two chefs, resources can be used in a better way
	- If one chef is cutting vegetables, the other can use the stove
- Multi Core -> multiple kitchens, shelves, etc

**Terms**
- Context Switching
	- Loading and unloading onto cpu for execution
- Registers
	- Hold 32 bits
	- Used for performing basic operations, storing addresses, etc.
	- Registers form the context

![multi-tasking](../imgs/Multi%20Tasking.png)

### Polling and Interrupt
**Polling**
- Constant checking (with time delays)

**Interrupt**
- Check only if interrupted

**Single Threaded**
- Use event loop with polling
- Thread runs an infinite loop
- Polls a single event queue
- Program waits until event handler returns, wasting CPU time and resources
- When a thread blocks for a resource, the entire program stops running

**Multi Threaded**
- Eliminate loop/polling mechanism
- If a thread is blocked, it pauses and frees resources for other threads
- So, one thread can pause without stopping the other parts of the program
- Java built in libraries are multi threaded