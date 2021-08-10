## Chapter 7
### Method Overloading
- Supports **Polymorphism**
- Define two or more methods within the same class that share the same name, as long as their parameter declarations (type and/or number) are different.
- The return type alone is insufficient to distinguish two versions of a method. 
- When Java encounters a call to an overloaded method, it simply executes the version of the method whose parameters match the arguments used in the call.
- When an overloaded method is called, Java looks for a match between the arguments used to call the method and the method’s parameters. 
- In some cases, Java’s automatic type conversions can play a role in overload resolution. Java will employ its automatic type conversions only if no exact match is found.
- Only overload closely related operations.
- **Constructors** can also be overloaded

### Objects as Parameters
- Objects can be passed as parameters to methods
- Commonly used with constructors to construct a new object that is initially the same as another object

### Argument Passing
**Call-by-Value**
- This approach copies the value of an argument into the formal parameter of the subroutine. 
- Therefore, changes made to the parameter of the subroutine have no effect on the argument.

**Call-by-Reference**
- In this approach, a reference to an argument (not the value of the argument) is passed to the parameter. 
- Inside the subroutine, this reference is used to access the actual argument specified in the call. 
- This means that changes made to the parameter will affect the argument used to call the subroutine.

**Primitive Types**
- Passed by value

**Objects**
- Objects are passed by what is effectively call-by-reference. 
- A variable of a class type is a reference to an object.
- Thus, when this reference is passed to a method, the parameter that receives it will refer to the same object as that referred to by the argument. 
- This effectively means that objects act as if they are passed to methods by use of **call-by-reference**. 
- Changes to the object inside the method do affect the object used as an argument.
- When an object reference is passed to a method, the reference itself is passed by use of **call-by-value**. However, since the value being passed refers to an object, the copy of that value will still refer to the same object that its corresponding argument does.

### Static
- A member declared as static can be accessed before any objects of its class are created, and without reference to any object.
- All instances of a class share the same static variables.

**Static Methods**
Methods declared as `static` have several restrictions:
- They can only directly call other `static` methods of their class.
- They can only directly access `static` variables of their class.
- They cannot refer to `this` or `super` in any way.

**Static Blocks**
- Static blocks get executed exactly once, when the class is first loaded.
- `static { body; }`
- Used to perform computation reqd for initializing `static` variables
- Order of execution when a class is first loaded:
	- static variables
	- static blocks
	- main

**Calling Static members**
- Static methods and variables can be used independently of any object. 
- Syntax: `className.method()` or `className.variable`