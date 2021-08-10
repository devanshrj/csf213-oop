## Lecture 08 - 2
- Array

![array-param](../imgs/Array%20Parameters.png)

### Arrays
**Assignment Operation**
- Array variable contains memory address (reference) of an array object
- The assignment operator (=) only copies the address stored in one array variable to another -> **shallow copy**
```java
int[] a = new int[10];
int[] b;
b = a;		// b and a refer to the same array
```
- To create two different arrays with the same values or compare arrays, we use a `for` loop and individually assign every indexed variable
- This creates a **deep copy**
- Similarly, equality (==) operator only checks if two arrays have the same memory address
- `equalsArray` method to compare arrays in a class

**Arrays as Return Type**
- Syntax
```java
public baseType[] methodName {
	baseType[] varName;
	return varName;
}
```

### Main Method
- `public static void main(String[] args)`
	- `args` -> array of String
	- Values given through the command line for program execution are stored in args

### MultiDimensional Arrays
- Number of square bracket pairs = number of dimensions
- Can be used as parameters and returned
	- Similar to 1D arrays
	- Use appropriate sets of square brackets

**Two Dimension Arrays**
- Syntax -> `baseType[][] varName = new baseType[n][m];`
	- n -> rows, m -> columns

- Traversal
	- For $n^{th}$ row and $m^{th}$ column, `varName[n][m]`

- `length` Instance Variable
	- `varName.length` -> length of first dimension/indices (row)
	- `varName[i].length` -> length of second dimension/indices (column)

- Array of Arrays
	- Ex: `a[10][20]`
	- Each indexed variable (10 such variables) contains a reference to an array of size 20
![2d-array](../imgs/2D%20Array.png)

- 2D Array as a Parameter
	- Base address is shared with the parameter