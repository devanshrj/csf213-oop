## Lecture 26
- Exception Handling

### Throw
- `throw` -> manually throw an exception
- Object thrown should be of type `Throwable` or its subclass
- Exception object constructor can take a string as argument as error message
- If a method that `throws` an exception is overridden, the method signatures should match, i.e., both methods should have `throws`
```java
// create Exception object to throw
throw new ExceptionType(<string_error_message>)
```

**Checked Exceptions**
- Inform caller of the method using `throws`
- Include in `try` and `catch` block

### User Defined Exceptions
- User defined exception class is derived (subclass) from `Exception` class
- `Exception` class inherits methods from `Throwable` class
- Override `toString()` to give a description about the error
- Advantages
	- Customised error messages
	- Application specific error handling
	- Alternate handling mechanisms
```java
public String toString() {
	// getMessage returns the error message provided with constructor
	return this.getMessage();
}
```

### Chained Exceptions
- Required when cause for exception is something apart from the expected
- Exception constructor has two arguments
	- `message` -> error message
	- `cause` -> object of `Throwable`
		- `exception.getCause();` -> get the cause of exception 
		- `exception.initCause(cause_exception)` -> set the cause of exception
- Multiple causes can be chained
- Cause has to be initialised before throwing

### Exception Hierarchy
- For an exception hierarchy, the exception cannot be higher than what is already given
- All the subclasses and the class itself can be given as the exception, not the parent classes
- (Reference: Lecture 27 Quiz, Q2 19:00)