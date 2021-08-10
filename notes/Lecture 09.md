## Lecture 09
- Strings

### String
- Class -> Strings are objects
- Operator overloading: + and += -> concatenation

**Literal Strings**
- String literals are **anonymous objects** of String class
	- Anonymous objects -> not assigned to a variable
	- `"<string>"`
- Can be assigned to variables
- Can be passed to methods as parameters
	- Parameter syntax -> `String <param_name>`
	- Anonymous references to the strings are passed to methods
- Callable methods -> String class methods
- Strings with the same values are the same objects
	- `String s1 = "Java", s2 = "Java";`
	- s1 and s2 refer to the same object
- Heap memory has a **String Pool** that stores string objects

**Immutable Objects**
- Cannot be changed once initialised
- Strings are immutable
- Multiple references to a String object can be used without the fear of one reference changing the value
- Advantages:
	- Less memory
- Disadvantages:
	- Less efficient -> small changes require construction of new objects

**Empty Strings**
- `String s1 = ""; String s2 = new String();`
	- s1 and s2 are empty strings
	- s2 -> No Argument Constructor
- `String s1;`
	- s1 is an uninitialised string with value `null`

**Copy Constructor**
- Constructor creates a copy of the argument object
- For strings, creates a copy of an existing string
	- A new copy/object is made in the heap

**Other Constructors**
- Take an array of characters as a parameter
- `char[]`

### Methods
`length()`
- Number of chars in string

`charAt(idx)`
- Returns character at index idx

`substring(i, j)`
- Returns a new String by copying characters from idx = i  to j - 1 from an existing string
- Returns IndexOutOfBound Exception if idx not found

`concat(<string>)`
- Concatenation of strings
- Shorthand -> +, +=
- Ints are casted to strings and concatenated

`indexOf(<string)`
- Returns index of first occurrence of string
- -1 if not string not found

`trim()`
- Returns a new String with whitespaces removed from both ends

`replace(old, new)`
- Returns a new String with old character replaced with new character

**Comparisons**
- More:
	- `equals()`
	- `compareTo`

**Changing Case**
- `toUpperCase()`
- `toLowerCase()`
- Methods return new String, no in-place operations

**Numbers to Strings**
- Implicit conversion
- Explicit:
	- `toString()`
	- `valueOf()`