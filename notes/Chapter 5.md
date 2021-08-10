## Chapter 5
### Control Statements
```java
// if-else if-else -> condition must resolve to boolean type
if (condition) {
	statement;
} else if (condition) {
	statement;
} else {
	statement;
}

// switch -> expression must resolve to integer type
switch (expression) {
	case value1:
		statement;
		break;
		
	case valueN:
		statement;
		break;
	
	default;
		statement;
}
```

### Iteration Statements
```java
// while loop
// first condition, then body
while (condition) {
	body;
}

// do-while loop -> executes atleast once
// first body, then condition
do {
	body;
} while (condition);

// for loop
// (init ->) condition -> body -> iteration -> condition -> body -> iteration
// comma for multiple statement execution together
for(init; condition; iteration) {
	body;
}

// for-each variant -> for each element in a collection
for(type itr-var: collection) {
	body;
}
```

### Jump Statements
```java
// terminate loop completely
// returns control to statement after loop
break;

// terminate current iteration of loop
// returns control to beginning of loop for next iteration
continue;

// terminate current method execution
// returns control to caller method
return;
```