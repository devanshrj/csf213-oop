## Lecture 11
- Inheritance: Final, Method Overriding

### Multi Level Inheritance
- `super` can only be used for the immediate parent
- For multilevel, each child class should have `super` to call its parent's methods
- `super` is only valid for non-static methods
- Use casting to access values of all super classes
	- `((className) this).varName`

### `final`
- Usage
	- Make a variable constant
	- Prevent method overriding
	- Prevent inheritance

- Variables
	- For references defined with final, members of the reference can be changed but the reference itself cannot be changed
	- Blank `final` initialization is allowed
	- Similar to `const` for C/C++

- Method Overriding
	- Child has a method with the same signature as parent
	- `final` can prevent method overriding

- Inheritance
	- Class should be defined with `final` to prevent other classes from inheriting from it
	- `final` methods of parent are inherited by child class
```java
/* 
- since final has been used with Test, it can't be inherited by
  other classes
- since final has been used with method(), Child cannot have a 
  method with the same signature
  Defining method() in Child will throw an error
*/

final class Test {
	// code
}

class Parent {
	final void method() { }
}

class Child extends Parent {
	void method() { }
}
```

### Method Overriding
- A method in a subclass with the same name and type signature as a method in the super class overrides the super class' method
	- Overriding happens only if the method signatures are the same
- An overridden method (child method) will always be called using the child's reference
	- To call parent's method, use `super`
- Consider local references
	- LGEB referencing system

**Method Overloading**
- If the same class has methods with the same name but different parameters or return types, the methods are said to be **Overloaded**
- Parent and child same method -> overriding
- Methods within the same class -> overloading

**Method Overloading in Inheritance**
- Overloading happens within a class
- New methods in the sub class with the same name as the methods in the parent class can be called new methods

### Queries
- Should all constructors include initialization for blank final variable?
	- Yes, every constructor should init blank final variables
- Significance of `@Override` construct?
	- Can be used as a checker or reminder to override a method in the future
	- If a method has already been overriden, no use of the construct