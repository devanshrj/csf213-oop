## Chapter 3
### Char
- `char` is designed to hold Unicode characters
- It can also be used as an integer type to perform arithmetic operations. For example, add two characters together, or increment the value of a character variable.
- `char` is formally referred to as an Integral type.

### Boolean
- `true` or `false` only (not 1 or 0 like other languages)
- Relational operators return boolean values
- The true literal in Java does not equal 1, nor does the false literal equal 0. 
- Boolean literals can only be assigned to variables declared as boolean or used in expressions with Boolean operators.

### Variables
- Dynamic initialization

**Scope**
- A block is begun with an opening curly brace and ended by a closing curly brace. A block defines a scope. 
- Each time you start a new block, you are creating a new scope. 
- A scope determines what objects are visible to other parts of your program. 
- It also determines the lifetime of those objects.

### Type Conversion
**Widening Conversion**
- Automatic type conversion will take place if the following two conditions are met:
	- The two types are compatible.
	- The destination type is larger than the source type.
- Integer and Floating type are compatible with each other

**Narrowing Conversion**
- Explicit conversion

**Cast**
- To create a conversion between two incompatible types, you must use a cast. 
- A cast is simply an explicit type conversion. 
- Syntax: `(target-type) value`

**Truncation**
- Floating point to Integer type

**Automatic Type Promotion**
- Type promotion in expressions
- Can lead to compile time errors
- Type promotion rules:
	- byte, short, and char values are promoted to int
	- If one operand is a long, the whole expression is promoted to long. 
	- If one operand is a float, the entire expression is promoted to float.
	- If any of the operands are double, the result is double.

