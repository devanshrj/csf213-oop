## Lecture 7 
- Memory Management

### Memory
**Stack**
- Static memory allocation -> allocation during compile time
- Frame/Activation Record
	- Created for every function called
	- Contains local variables, parameters, return address (function that called the function)
	- Function call pushes an activation record for that function to the stack
- Stack Dematerialisation
	- Activation record of a function is popped off from the stack after its execution
	- The local variables, etc cease to exist after pop
	- After the last pop, the program is terminated
- Used by
	- Primitive type variables -> int, float, etc
	- Functions
	- Structs

**Heap**
- Dynamic memory allocation -> allocation during run time
	- `malloc()` in C
- Example: malloc is used to allocate 100 bytes to a pointer in Heap
- Heap memory needs to be explicitly destroyed using something like `free()` in C
- Used by
	- Pointers

### Java Memory Management
**JVM**
- Java Virtual Machine
- JVM creates a runtime environment for the program.
- Each object is given a unique id to refer and differentiate
- Periodically runs garbage collector

**Memory Management**
- 3 parts:
	- Thread Stack
	- Heap Memory
	- Code Segment (stores byte code)
- Local variables declared inside methods are stored in Stack
- Objects (dynamic) constructed are initialized and stored in Heap
- References to objects, however, are stored in Stack
	- References refer (point) to the object and its attributes and methods
- After program termination, **garbage collector** frees up Heap memory
- Static variables are stored in Code Segment

**Further Reference**
- Memory Management in C