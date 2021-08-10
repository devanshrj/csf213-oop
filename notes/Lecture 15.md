## Lecture 15
- Interface - Default and Static Methods

### Questions
1. class A is default with public methods and constructors in package 1. Can it be used to create a subclass in package 2?
	- No, since the class itself is default, it is not available outside the package.
	- Can't create a reference
	- Possible if class is protected or public

2. class A is public with private methods and constructors in package 1. Can it be used to create a subclass in package 2?
	- No, since the constructors and methods are private, nothing from the class can be inherited, irrespective of the package.
	- The constructor of the subclass implicitly calls the constructor of the parent class, this will lead to an error if the constructor is private.
	- Object of the class can not be created since the constructor is private

- Creation of subclass has two components:
	- Creating a reference
	- Creating an object

### Interface
- References for an interface can be created
	- Objects for an interface cannot be created
- Upcasting and downcasting is possible with an interface reference

**Runtime Polymorphism with an Interface**
- Create a reference to the interface
- The reference of the interface should be assigned to the object of a class that implements the interface 

### Misc
- `getClass()` -> returns a reference to a class
- `getSimpleName()` -> returns name of the class
- The methods of `Object` class are implicitly added to every interface and can thus be used directly.

```java
class Person {}
Person x = new Person();

// returns the name of the class that x is an instance of
x.getClass().getSimpleName();
```