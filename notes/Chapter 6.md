## Chapter 6
### Class Basics
```java
class className {
	// data/variables
	type instance-var1;
	//
	type instance-varN;
	
	// code/methods
	type method1(params) {
		body; 
	}
	//
	type methodN(params) {
		body;
	}
}
```

- Dot Operator ( . ): Links the name of the object with the name of an instance variable
- `new`: Dynamically allocates memory for an object and returns a reference to it
- A class is like a "data engine".

**Instance Variables and Methods**
- When you assign one object reference variable to another object reference variable, you are not creating a copy of the object, you are only making a copy of the reference
- When an instance variable is accessed by code that is not part of the class in which that instance variable is defined, it must be done through an object, by use of the dot operator. However, when an instance variable is accessed by code that is part of the same class as the instance variable, that variable can be referred to directly. The same thing applies to methods.
- A parameter is a variable defined by a method that receives a value when the method is called. An argument is a value that is passed to a method when it is invoked.

### Constructors
- A constructor initializes an object immediately upon creation. 
- It has the same name as the class in which it resides and is syntactically similar to a method. 
- Once defined, the constructor is automatically called when the object is created, before the new operator completes. 
- Constructors have no return type, not even void. This is because the implicit return type of a class’ constructor is the class type itself. 
- It is the constructor’s job to initialize the internal state of an object so that the code creating an instance will have a fully initialized, usable object immediately.

### Misc
**`this` keyword**
- `this` can be used inside any method to refer to the current object.
- `this` is always a reference to the object on which the method was invoked.

**Instance Variable Hiding**
- When a local variable has the same name as an instance variable, the local variable hides the instance variable.
- `this` lets you refer directly to the object, thus resolving any namespace collisions that might occur between instance variables and local variables.

**Garbage Collection**
- Java handles deallocation of memory automatically through garbage collection.
- When no references to an object exist, that object is assumed to be no longer needed, and the memory occupied by the object can be reclaimed.
- Garbage collection only occurs sporadically during program execution.

