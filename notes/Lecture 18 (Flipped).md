## Lecture 18 (Flipped)
- Generics - Intro

### Generics
- Ensure type safety
- Type can be a parameter to methods, classes and interfaces
- `<>` -> specify parameter type
- Type cannot be primitive, has to be Wrapper class
- Multiple types can be passed to a class or method
- Syntax to create objects:

```java
BaseType<Type> obj = new BaseType<Type>()
```

**Advantages**
- Type safety
	- Allows to store only a single type of object in generics
- Type casting is not required
- Compile time checking

```java
// class with two datatypes
class Identity <T, U> {
	// defining objects for each type
	private T object1;
	private U object2;
	
	public Identity(T object1, U objects2) {
		this.object1 = object1;
		this.object2 = object2;
	}
}

// T = Long, U = String
Identity<Long, String> I1 = new Identity<Long, String>(4L, "X");
// T = String, U = Long
Identity<String, Long> I2 = new Identity<String, Long>("X", 4L);
```