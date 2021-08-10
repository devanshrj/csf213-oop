## Lecture 6
- Constructors and Methods
- Getter and Setter, Static, Passing Objects as Parameters

### Constructor
- Method with `method_name = class_name`
	- **Doesn't have a return type**
- Constructor initializes a class and state variables (so always reqd)
- Called when an object is instantiated
	- `object = new <class_name>;` -> new signifies constructor
- Default constructor
	- Created by Java runtime if a constructor is not defined explicitly
	- Any explicit constructor will overload default constructor
	- Parameterless constructor is also called default constructor
- Standard -> initialize state variables in the constructor
- Shadowing constructor -> overloading of default constructor by an explicit constructor
- Parameterized constructor -> parameters for initializing state variables
- **Constructor Overloading**
	- Constructors can also be differentiated and overloaded based on the parameters

### Methods
- Signature
	- modifiers, name, parameters
- Two methods with the same names but diff parameters can be used in the same class
- Only parameters and name are used to differentiate between methods

### Instance Variables
- Defined in class definition and not included in any methods (`Bicycle` class)
- Define the **state of a class**
- Instance variables should be **private** in the spirit of encapsulation
- Use **Accessors/Getters** to get the values of instance variables
- Use **Mutators/Setters** to set the values of instance variables
	- Can be done in Eclipse using `Generate` (source or alt + shift +S)
- `this` -> keyword that refers to the **current object** (similar to `self` for py)

**Stateless Class**
- Class without any instance variables
- Should be used directly as `<class>.method()`
- Creating objects for such a class is just a waste of memory

### Static
- `static` variables and methods can be used without instantiating an object
- They are class variables/methods and not instance variables/methods
- For static variables, memory is assigned at compile time (before object instantiation)
- Called by `<class_name>.variable` or `<class_name>.method`
	- static methods are always called using class name (convention)
- `static` variable copies are **maintained for the class and not individual objects. The copies are simply shared with all the objects.**
	- So, if the value of a `static` variable is changed, it is reflected for all objects
	- Think of it as a class/global variable
- `this` cannot be used with `static` variables in a class because objects are created after `static` variables
	- `this` doesn't refer to anything in this case
- Static methods can also be overloaded

**Note: `main` is the entry point for any application and is always defined as `public static void main(String[] args)`**

### Parameters
- Parameters -> list of variables in method declaration
- Arguments -> actual values passed to parameters
- Parameter types:
	- Primitive data types -> int, boolean, etc
	- Reference data types -> objects, arrays, etc
- Methods of an object can be used within a method by passing the object as a parameter to the method and then invoking the object's methods