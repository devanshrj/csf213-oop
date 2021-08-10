## Lecture 18
- Generics

### Generics
- User defined types and classes can also be used as Parameter types for generics
- Wrapper class as well as user defined class instances can be used as parameter types
- Anonymous objects can be passed as instances to a generic class
- Parameter types (T, U) belong to `Object` class

**Type Inference**
- Types on the right hand side of assignment operator can be skipped
```java
BaseType<Type> obj = new BaseType<>();
```

**Without Parameter Types**
- Generic class instances can be created without passing parameter types as well
- Downcasting is necessary to prevent type casting errors

**Generics Compilation**
- Compilation for generics takes place at compile time
- Placeholders for parameter types are replaced by the parameters passed to the instance
- After compilation, parameter types are replaced by `Object` instances similar to legacy code
- **Type Erasure**

### Generic Methods
- Methods that are passed a parameter type
- Individual methods can be generic
- Syntax
```java
public <Type> void method() {
	// method accepts parameter type of Type
	/* generic method representation should take place 
	   before return type */
}

// method call
class_instance.<Type>method();
```

### Bounded Types
- Types
	- Number -> Integer, Long, Float, Double
	- String
```java
public <Type extends Number> void method() {
	// upper bound on type
	// parameter type is of Number (including Number)
	// method can now be used with all Number types
}

public <Type super Integer> void method() {
	// lower bound on type
	// parameter type is Integer and parents of Integer
	// method can now be used with Int, Number and Object
}
```

### Generics Compilation
- To examine bytecode from terminal after compiling class
	- `javap -c <ClassName>`
- After compilation, all parameter types are replaced by `Object`
- If an upper bound is provided, parameter type is replaced by the bound
	- `Number` or `String`