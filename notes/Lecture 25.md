## Lecture 25
- Exception Handling

### Exceptions
- Errors in code (like division by zero)
- Default exception handler
	- Prints exception message
	- Terminates program
- Blocks
	- `try` -> monitors code for exceptions
	- `catch` -> catches exception objects and provides alternate mechanism
	- `finally` -> closure operations, executed irrespective of exception
- `finally` is optional and is **always executed**
- `try` block can have multiple `catch` blocks
	- Order of `catch` blocks is important
	- Order of execution is sequentially
- Scope of an exception is till the `try` block's corresponding `catch` blocks
- When an exception occurs in the `try` block, an exception object is created and control goes to the handler block
	- After the handler is executed, the remaining code is executed
```java
// division by 0 example
try {
	a = b / c;
	
	// the remaining code is not executed if exception occurs before
	Class c = null;
	c.toString();		// null pointer exception
}

// parameter should be exception type to catch
catch (ArithmeticException e) {
	e.printStackTrace();		// prints exception message
	a = b;
}

// if exception type is unknown, use Pokemon catch block
catch (Exception e) {
	e.printStackTrace();		// prints exception message
	a = b;
}

finally {
	System.out.println(a);
}
```

**Exception Hierarchy**
- Throwable (root class)
	- Exception (root for exceptions, can catch all exceptions)
		- Check Exceptions (Compile time)
			- Program will not compile
			- Handled with `try` and `catch`
			- Handled with `throws Exception` in the method declaration
		- Uncheck Exceptions (Run time)
			- Sub classes for different types of exceptions
	- Errors

**Exception Propagation**
- Exception can be thrown to a calling method
- Stack trace will give all the details and the entire path of exception

**Nested `try`**
- `try` and `catch` blocks can be nested
- Mostly used in exception propagation