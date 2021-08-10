## Lecture 13
- Run-time Polymorphism, Abstract Classes

### Run Time Polymorphism
- Only applicable in the case of inheritance, not for two individual classes
	- Case of inheritance -> Parent and Child relationship b/w classes
- Run time polymorphism is used for overridden methods
- Also valid for multi level inheritance
	- Grandparent reference can be used to access Child' overridden methods
- Method overriding is valid only for methods
- **If reference variable is of type Parent class, it will access only Parent's instance variables, irrespective of the object it is assigned to**

### Static Binding vs Dynamic Binding
- Static binding -> compile time
	- Binding of `private`, `static` and `final` since these methods cannot be overridden
	- Method overloading
- Dynamic binding -> run time
	- Method overriding
	- Upcasting

**Note: Important!!**
- Methods are linked to the object 
	- Object decides which methods are accessed
- Variables are linked to the reference
	- Reference's class type decides which variables are accessed

### Abstract Classes
**Rules**
1. Declared with `abstract` keyword
2. Can have `abstract` and non-abstract methods
3. Cannot be instantiated
	- Reference for abstract class can be created
	- Object for abstract class cannot be created
4. Can have `final` methods
5. Can have constructors and `static` methods

**Abstract Method**
- Methods that are declared but not defined
- Acts like a **dummy** method that does not have any useful code
- The purpose is to make the **method signature** available
- Can only be defined in an `abstract` class
- Usually, abstract methods are written in the parent class (abstract) while using inheritance and are implemented in the child class
	- If the abstract method is not implemented in the child class then the child class should also be abstract

**UML Representation**
- Abstract classes/methods are written in *italics*