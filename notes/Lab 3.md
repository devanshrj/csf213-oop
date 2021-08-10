## Lab 3
### Static
```java
static {
}
```
- Non static methods cannot call static methods/variables
- `static` blocks
- Order of execution
	- When a class is loaded
		- Static variables assigned
		- Static blocks executed
			- If a static method is called within a static block, the method is executed first
	- Main method
	- Other methods

- Static methods can be used without `class_name` if the method is accessed within the same class

### Constructor Blocks
```java
{ }
```
- Clubbed together in the order they have been created
- Blocks will be appended first and then invoked within each constructor method

### Wrapper Classes
- Autoboxing and Unboxing
- Wrapper classes and primitive data types can be used together
- Autoboxing -> auto conversion of primitive dtype to Wrapper class
- Unboxing -> assigning Wrapper class reference to primitive dtype

```java
int a; 
Integer j = a; // autoboxing
int b = j; // unboxing
static void print(Integer... i) // variable arguments
// ^values can be accessed like an array
```
- Rules:
	- Autoboxing and Widening cannot happen together
	- Preferences: Widening > Boxing > Variable args
	- Widening between Wrapper classes is not allowed

### Misc.
- Widening -> lower dtype variable to bigger dtype
	- example: short stored in int