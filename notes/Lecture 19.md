## Lecture 19
- Generics - Interfaces

### Generics
- Arrays of generics type cannot be created
	- Since object creation is done at runtime and data type has to be preserved
	- So, create object array and then type cast (downcast) to parameter type
```java
class Stack <T> {
	// array will be declared of type T
	private T[] arr;
	private int size;
	
	// initialisation will be done with Object type
	// downcast to array of T
	arr = (T[]) new Object[size];
	
	// directly
	T[] arr = (T[]) new Object[size];
}
```

**Type Name Conventions**
- Conventions:
	- T -> Type
	- E -> Element
	- K -> Key
	- V -> Value
	- N -> Number

### Generic Interfaces
- Only a generic class can implement a generic interface
	- A non generic class can implement a generic interface only if the parameter types are replaced and hard coded by Wrapper Classes
```java
interface IntGen <T, U> {
	// generic interface
}

class Identity <T, U> implements IntGen <T, U> {
	// generic class implements generic interface
}

class NonIdentity implements IntGen <Integer, String> {
	// non-generic class implements generic interface with specific types
	// T = Integer and U = String here
	// all occurences of T and U in the class have to be replaced with the types
}
```

### Multiple Bounds
- Similar to implementing multiple inheritance using interfaces
- T is bounded by a class A and interfaces B and C
- Type argument passed to T must be a subclass of A and have implemented B and C
```java
class A {}
interface B {}
interface C {}
class D <T extends A & B & C> {}
```

### Questions
1. Generics cannot be used for creating instances
	- Due to type erasure, type is replaced by `Object` after compilation
	- `new T();` will give error
2. Object is parent reference and can be assigned to any type's object
3. Object instance of Integer type cannot be assigned to an object instance of String type due to type mismatch at compile time
4. `Object` is super class of all classes, so assigning obj to string type is allowed (downcasting)