## Lecture 15 (Flipped)
- Interfaces and Default Static methods

### Interfaces - Default Methods
- Interfaces can have default methods
	- Methods with implementation that are inherited by all the classes implementing the interface
- Default methods can be overridden by the implementer classes
- Preface a default method in the interface with `default`
- Helps to remove base implementation class
- Also called **Defender** or **Virtual Extension** methods

**`super`**
- If two interfaces have default methods with the same names but different implementations, the `super` keyword can be used to choose the method called by the implementer class
```java
interface Printable {
	default void show() {
		//
	}
}

interface Showable {
	default void show() {
		//
	}
}

// Both interfaces have default show()
class Trial implements Printable, Showable {
	public void show() {
		// to call Printable's show()
		Printable.super.show();
		
		// to call Showable's show
		Showable.super.show();
	}
}
```

### Static Methods
- Similar to default methods, but can't be overridden in the implementation classes
- Called using the interface's name
	- Cannot be called using an object reference
	- By contrast, static methods for a class can be called using an object reference
- Implementation class can have a method with the same signature since interface's static method can only be called using the interface
```java
interface Printable {
	static void show() {
		//
	}
}
// to call
Printable.show()
```

### Misc - Interfaces
- If there are multiple interfaces with the same method name, the return type should be same
	- Otherwise, error

**Interfaces vs Abstract Classes**
- Interfaces
	- Multiple extend classes
	- Preferred for base implementation
- Abstract Classes
	- Non-static methods