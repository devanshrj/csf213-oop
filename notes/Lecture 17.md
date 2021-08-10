## Lecture 17
- Nested Classes

### Nested Classes
- Outer class cannot access members of the inner class directly, need an instance to do so
- `static` variables cannot be defined in inner classes
	-  `static final` variables can be defined
- If Inner and Outer class methods have the same signature, the Inner class method will be called
- `static` methods of Outer can be called from Inner using
	- `Outer.<method>();`
- Non-static methods of Outer can be called from Inner using
	- `Outer.this.<method>();`
	- Non-static methods can only be called using an instance
	- `this` works as an instance in this case
- Non-static methods of Outer can also be called from Inner using an **anonymous object**

**Member Inner Class**
- Can access all members of the Outer class
- Associated with instances of the Outer
	- Thus, cannot have `static` variables, but can have `static final`

**Static Inner Class**
- Can access static members of the Outer class but not non-static members
- Prefixed with `static`
- Not associated with instance of the Outer
	- Object of the outer class is not needed
	- Thus, can have `static` variables
```java
// Inner is a static nested class
class Outer {
	static class Inner {
	}
}

// to call non-static methods from Inner
Outer.Inner in = new Outer.Inner();

// to call static methods from Inner
Outer.Inner.<method>();
```

**Local Inner Class**
- To create a local data type within a method