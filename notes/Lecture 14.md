## Lecture 14
- Interfaces

### Interface
- Blueprint of a class containing `static final` constants and `abstract` methods
	- Treated as such even if keywords are not used
- Methods cannot have a body/implementation
	- Only method signature
- Mechanism for **abstraction**
- All members are public by default
- Implementation class for an interface should implement all the methods declared in the interface
	- **All the methods should be `public` in the implementation class**
	- Otherwise, the implementation class should be declared as `abstract`
- Implementation class can also have unique methods
- Interfaces cannot have private members
- **Compiler prepends `public abstract` to methods and `public static final` to variables**

**Relationships between Classes and Interfaces**
- Class implements interface
- Class extends class
- Interface implements interface

**Abstract Classes vs Interfaces**
- Abstract provides **partial abstraction**
	- Can have some implemented methods and depend on other classes for implementation of other methods
- Interface provides **full abstraction**
	- All the methods declared in an interface are implemented in an implementer class

**Interface for Multiple Inheritance**
1) A class can implement an interface and inherit from a different class at the same time
	- Thus, an interface can be used as a proxy for a second class, leading to multiple inheritance
2) A class can implement multiple interfaces
	- An interface only cares about an implementation of its methods in the implementer class
	- If a class implements multiple interfaces that have the same method signatures, this will not lead to an error since the interfaces' methods can use the same implementation
3) An interface can inherit from multiple interfaces
	- This is possible since an interface only contains method signatures

```java
interface Account {
	//
}

interface Bank {
	void deductFee();
}

class BankAccount implements Bank {
	public void deductFee() {
		//
	}
}

class CheckingAccount extends BankAccount implements Account {
	// inherits BankAccount and has to implement methods of Account
	// thus, multiple inheritance
}

class SavingAccount implements Bank, Account {
	// implements multiple interfaces
}
```

**Practices**
- In practice, a file can have an interface and its implementer class
- In industry, each interface has an individual file