## Lecture 08 - 1
- Arrays

### Arrays
- Data structure for a collection of data of the same type
	- Stored contiguously in memory
- Array is an instance of a class (so we use `new`)
	- Variable of Array type holds address of array object
- `new` keyword -> allocates memory and creates an object
- Objects are instantiated with default values
	- Default type on an object -> `null`
```java
varType[] varName; // array declaration -> [] represent array
// N is the size of the array
varName = new varType[N]; 
/* new creates an object and allocates memory, assignment places a reference 
to memory address of an array object in array variable */

// example
double[] score;
score = new double[5];

// syntax
BaseType[] ArrayName = new BaseType[size];

/* array of objects -> default value = null
specimen refers to references of objects (Person) so, specimen is an array of
references (objects) */
Person[] specimen = new Person[n];
specimen[0] = new Person;	// assigning values
```

**Order of Execution**
- `score` is a reference for an Array object
- `score`is stored on **stack** since it is a reference to an object
- The array referred by `score` is stored on **heap**

**Array Properties:**
- Indexed variables in a single array must be of the same type (*base type*)
- Base type can be any class type
- Type of an array is "base type array"
- `for` loop for array manipulations
- Length of an array cannot be changed once declared
- `array.length` -> size of array

**Array Index Out of Bounds**
- Index that is not a part of the array is used
- Run time exception -> terminates program

**Array Initialization**
- Initialized to default value of base type
```java
int[] age = {2, 4, 1};	// age -> int array of size 3

// using a for loop
for(int i = 0; i < arr.length; i++) {
	arr[i] = value; }
```

**Array of Characters**
- Not a `String`
- Can be converted to a String
- `String s = new String(a)` where a is `char[]`
- s is an *independent copy*

**Arrays with a Class Base Type**
- Array stores indexed reference variables of class type
- Initialized to `null`
- Each indexed variable should be initialized using `new` and a constructor for the class to create an object to reference

### Arrays as Parameters
- Array arguments behave like objects of a class
	- So, a method can change the values stored in indexed variables
	- Array parameters can take arrays of any size
- Syntax for parameter -> `BaseType[] parameterName`
- Syntax for argument -> `methodName(arrayName)`
	- Size and `[]` are not reqd
- Arrays can also be returned by methods

### Pass by Reference/Value
- Everything passed to an object is passed by **value**
- Object references are also passed by value
- Java doesn't support Pass by Reference
- Primitive type variables as well as object references are **Passed by Value**

**Pass by Value**
- A copy of the variable is made and assigned to the argument
- For objects, the parameters refer to the same memory address in the heap as the argument
	- Any changes made to the object attributes are reflected in the heap
	- So, the changes made in the called method will be reflected in the caller method as well
- If the memory address that a parameter refers to is changed within the called method, this will only be reflected locally and not in the caller method
- Thus, Java uses only **Pass by Value**