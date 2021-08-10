## Lecture 12
- Run-time Polymorphism

### Run Time Polymorphism
- Also called **Dynamic Method Dispatch**
	- Mechanism by which a call to an overridden method is resolved at run time

- Achieved using Method Overriding
- An overridden method is called through the reference variable of a super class
- The method to be called is based on the object being referred to by the reference variable
- **Upcasting** -> Reference variable of Parent class refers to an object of Child class
- Using upcasting a reference variable of Parent can refer to an object of any Child class, in case of multiple child classes
- Upcasting only works for methods defined in the Parent or overridden methods in the Child
	- Since the reference variable is of type Parent class and is associated with the members/attributes of Parent

```java
class Sports {
	method1(int n) {
		//
	}
}

class Soccer extends Sports {
	method1(int n) {
		//
	}
}

class Test {
	public static void main() {
		int n;
		Sports c;		// reference for Parent class
		
		/* value of n decides which method to call
		 if n == 11, we want to call Soccer's method1
		 So, using Upcasting, the reference variable (c) of Parent
		 (Sports) refers to an object of the Child (Soccer)
		*/
		
		if (n == 11)
			c = new Soccer(n);		// Upcasting
		else
			c = new Sports(n);
	}
}
```