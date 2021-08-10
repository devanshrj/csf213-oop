## Lecture 10
- Inheritance: Intro

### Inheritance
- Generalisation -> Parent class generalises methods that are common to other classes
- Object of child class acquires all the properties of parent class
	- When an object of the child class is created, an object of the parent class is **not** created
	- Instead, the child class' object contains all the attributes and methods of both the child and parent class
- Method Overriding
	- Child has a method with the same signature as parent
- Runtime polymorphism
- Every class is a subclass of `Object`
```java
class SubClass extends SuperClass { /* code */}
```

**Rules**
- Members and methods of super class -> subclass
- In general, subclass attributes and methods override/shadow super class' attributes and methods
	- `super` can be used to access super class' attributes and methods
- Private methods of super class cannot be accessed directly from subclass
- Super class' name -> `object.getClass().getSuperclass().getName()`
- Static methods in subclass override/shadow static methods in super class
```java
class SuperClass {
	static void method() { }
}

class SubClass extends SuperClass {
	static void method() { }
}

// overriding super class method
SubClass.method()		// will call SubClass' method()
```

### Types of Inheritance
- Single
	- One child inherits from one parent
- Multilevel
	- Child inherits from parent that inherits from grandparent
- Hierarchical
	- Multiple child classes inheriting from the same parent
- Multiple
	- One child inherits from two parents
- Hybrid
	- Child class inherits from two parents, both parents inherit from a grandparent
- **Note:** Java doesn't support Multiple and Hybrid inheritance
	- Two parent classes can have the same method names but the compiler will not be able to differentiate

### Constructor
- When an object for a child class is constructed, the child class' constructor is called
- The super class' **default constructor (no argument constructor)** is also implicitly called
	- equivalent to `super()` in the child class' constructors
- Compile time error if the super class doesn't have a default or no argument constructor
- Constructors of parent can be invoked but are not inherited by the child class

**`super()`**
- To explicitly call a super class' non default constructors, use super
- `super` can only be used within the child class
- `super` should be the first statement within the constructor
```java
class SuperClass {
	SuperClass(int a) { }
}

class SubClass extends SuperClass {
	SubClass(int b) {
		super(b);
		// super(b) invokes SuperClass(int a) constructor for SuperClass
	}
}
```