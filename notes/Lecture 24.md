## Lecture 24
- Lambda Expressions

### Lambda Expressions
**Passing Code as Data**
- Lambda expressions can be used as arguments for methods
	- Instance reference is passed as argument
	- Parameter of method should be `Interface reference`
```java
double print(FuncInt f) { /* method */ }

FuncInt f = () -> Math.random();
print(f)
```

**Generic Functional Interface**
- Functional interface with Generics
```java
interface GenericInt <T> {
	// function that has generic argument and return
	T func(T t);
}

// provide type while creating interface reference
GenericInt<String> str = <lambda exp>;
```