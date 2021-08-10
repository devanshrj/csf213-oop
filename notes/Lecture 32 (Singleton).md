## Lecture 32
- Design Patterns: Singleton
- [Resource](https://sourcemaking.com/design_patterns)

### Design Patterns
- Creational
	- Class instantiation
- Structural
	- Class and Object composition
- Behavioral
	- Class's objects communication

### Creational: Singleton
- When a single instance of a class has to be created inside the application
- Ensures only a single instance is created by protecting the class creation process
- Sets the class constructor to `private`
- `getInstance()` method to get a single instance of the class
	- Only method accessed to get the instance

```java
public class Service {
	// single instance of the class, shared by all references
	private static Service instance = null;
	
	// private constructor
	private Service() {}
	
	// getInstance() -> returns instance of class
	// sync to make the code thread safe
	// prevent multiple threads from invoking the method at the same time
	public static synchronized Service getInstance() {
		if (instance == null)
			// instantiate instance if not created
			instance = new Service();
		
		return instance;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone is not allowed.");
	}
}
```
 
- `clone()`
	- `Object` class method
	- Used to clone instances of the class
	- In this case, it used to prevent cloning of instances so that only a single instance is allowed
	- `protected` -> to prevent unnecessary behavior if the class is inherited or used elsewhere

![singleton](../imgs/Singleton%20Pattern.png)