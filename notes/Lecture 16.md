## Lecture 16
- Nested Classes

### Nested Classes
- Used to logically group classes or interfaces in one place
- Nested class can access **all members of the outer class** including private members.
- Two types:
	- Non static nested class (inner class)
		- Member
		- Local
		- Anonymous
	- Static nested class
- Interfaces can also be nested inside a class

**Member Inner Class**
- Associated with the instance of the enclosing class
- Direct access to object's members
- Can not define `static` members
	- Can define `static final` members
- The inner class has a **reference** to the outer class
- The inner can be private, with a getter in the outer class to use the inner class
- Compiler creates two class files of the inner class, `Outer.class` and `Outer$Inner.class`
- Inner class can only be instantiated through an instance of the outer class

```java
// outer class
class Outer {
	private int val;
	
	// nested inner class
	class Inner {
		void show() {
			System.out.println(val)
		}
	}
}

/* to create an object for Inner
1) create instance for Outer
2) use the instance to create an instance for Inner 
Alternatively, create anon object for Outer and then create instance for Inner */
Outer o = new Outer();
Outer.Inner in = o.new Inner();
Outer.Inner oi = new Outer().new Inner();
```

**Anonymous Inner Class**
- Anonymous object
	- `new <class>().<method>`
- Class with no name
- Can be treated as a subclass
	- Used for method overriding
- A reference for the Outer class is created but the object created is of the Anonymous class
	- Upcasting takes place here
- Anonymous class can only implement or override methods that are defined in the Outer class
	- Cannot define new unique methods
- Anonymous classes can be used with interfaces as well

```java
// outer class
abstract class Outer or interface Outer
{
	private int val;
	abstract void show();
}

/* to create an object for Anonymous Inner Class
1) create instance for Outer
2) implement overridden methods in a code block to create 
object of anonynmous inner class */
Outer o = new Outer() {
	// implementation of show() from Outer
	void show() {
		System.out.println(val);
	}
};
```

**Local Inner Class**
- A class inside a method
- Scope of the inner class is within the method it is defined
	- So, it can only be instantiated within the method it is defined

```java
// outer class
class Outer {
	private int val;
	
	void show {
		class Inner {
			void print() {
				System.out.println(val)
			}
		}
		Inner i = new Inner(); // instantiation
	}
}
```

### Applications of Inner Classes
- Local Class
	- To use local variables defined in a method
	- Multiple references to the same type
- Nested Class
	- Similar to Local, but access to local variables or method parameters is not reqd
	- Inner class if access to enclosing instance's non-public members is reqd
	- Static nested class if not