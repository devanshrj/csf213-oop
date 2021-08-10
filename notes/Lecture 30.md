## Lecture 30
- Synchronization

### Synchronization
**Shared Memory**
- No coordination between threads -> inconsistent results
- Organize threads when they are working on shared memory
- Only methods are sync
	- Variables are not sync
- Threads can still access **non-sync code** even if sync is used

**Locks**
- Types:
	- Object level locks
	- Class level locks
- Every object has its own lock -> **monitor**
	- Monitor is the room in the black box analogy
- Threads waiting for locked resources are in the `wait` state

### Sync Methods
**synchronized method**
- To make a method sync, prepend method signature with `synchronized`
	- Locking mechanism
	- If one thread is executing the method, other threads cannot execute it at the same time
	- Analogy :
		- Black box (room), with only one gate for entry and exit
		- So, when a thread is executing a method, it *locks* the gate
	- If a thread goes to sleep while in sync state (if `sleep()` inside sync method), it stays or is *locked* in the method

**synchronized block**
-  To make a block of statements synchronized based on an object, use sync block
-  Only the code in the block is synchronized, not the object itself
-  The lock breaks upon execution of the last statement in the block
-  Include only code that needs to be sync within the block
-  Even if irrelevant code is a part of the block, only the code related to the mentioned object is sync
```java
// locks (sync) the object
synchronized(<object>) {
	// sync code
}
```

### Locks
**Class Level Lock**
- Class can only have one instance at a time
- Only one object acquires a lock for the entire class
- Independent objects cannot access lock
- Only one object can be synchronized
- Assume two threads work on one object and a third thread on a second object
	- If the class is locked, the two threads on one object will work independently from the third thread
	- The lock for the class is either acquired by the first object or the second
- Use sync block
```java
// locks (sync) the class
// `.class` => class level lock
synchronized(<object>.class) {
	// sync code
}
```

**Differences**
- Object level locks work on `non static` methods or variables
- Class level locks work on `static` methods or variables
- Assume two threads (T0, T1) work on one object and a third thread on a second object (T2)
	- Class level lock
		- If T0 is locked, T1 and T2 are not allowed, irrespective of the objects they work on 
	- Object level lock
		- If T0 is locked, T1 is not allowed since it works on the same object
		- T2 operates independently since it works on a diff object, so T2 can still operate