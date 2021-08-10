## Lecture 14 - Flipped
- Downcasting, Access Modifiers

### Downcasting
- Create a reference for a Child and assign it to an object of Parent
- Downcasting is usually done with upcasting
- Downcasting can be done in the same way as typecasting
- Downcasting for a Child class can only be performed on references of Parent class that are referring to objects of **that** Child class
	- Otherwise, `Class Cast Exception`
- To prevent `Class Cast Exception`, use `instanceof` operator to check the class that an object belongs to

```java
class Parent {
	//
}

class Child extends Parent {
	//
}

Parent p = new Child(); 		// Upcasting
if (p instanceof Child)			// instanceof operator
	Child c = (Child) p;		// Downcasting
```

### Access Modifiers
- Modifiers with UML representation
	- public -> +
	- private -> -
	- protected -> #
	- Default -> ~
		- Public wrt package

**Overriding with Access Modifiers**
- public methods in super class must be public in all sub classes
- protected methods in super class must be protected or public in sub classes
- private methods are not inherited at all
- Visibility cannot be reduced across packages

![access modifiers](../imgs/Access%20Modifiers.png)