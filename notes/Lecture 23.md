## Lecture 23
- Wildcard in Generics, Lambda Intro

### Comparable/Comparator
- To use Comparable or Comparator with Generics, the type/class being used with the generic method should implement Comparable or Comparator interfaces
- Use upper bound to add type safety for this
```java
public int <T extends Comparable<T>> T method(T elem1, T elem2) {
	// method compares objects of a class using compareTo()
	// of Comparable interface
}
```

### Wildcard
- There's no relationship between dtypes in Generics
	- Integer is not considered a subset of Number like it usually is
- Wildcard provides a mechanism to allow unknown types without using generic methods/classes
```java
double sum(List<? extends Number> elem) {
	// generic method with wildcard
	// ? represents unknown type, but a subset of Number due to bound
}
```

### Lambda Expressions
- Used for implementing **functional interfaces**
	- Functional interface
		- Should have only one abstract method
		- Can have default and static methods
- Similar to anonymous class
- Can use local variables, variables defined outside the expression
- Parameters can be passed with type or without type
- Parameters cannot be constants or literals
- Single parameter can be passed without parenthesis ()

**Expression Lambda**
- Single line
- Return is implicit
```java
// syntax
(params) -> expression

// example using forEach method of lists
list.forEach( (n) -> System.out.println(n) );
```

**Block Lambda**
- Block of lines
- Return must be mentioned explicitly
```java
// syntax
(params) -> { code block }

// example using forEach method of lists
list.forEach( (n) -> {
	n += 2;
	System.out.println(n) 
	}
);
```

**Lambda implementing Functional Interface**
- Steps
	1. Anonymous class implementing functional interface
	2. Implement getValue()
	3. Create instance of anon class
	4. Return instance and assign to interface reference
```java
interface FuncInt {
	// single abstract method
	double getValue();
}

// single line lambda exp using interface reference
// lambda expr creates and returns instance of anonymous class
// interface reference refers to this instance
FuncInt f1 = () -> Math.random();

// this is equivalent to any anonymous class implementing the interface
FuncInt f1 = new {getValue() {
				  		return Math.random();
						}
				};
```