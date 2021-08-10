## Lecture 33
- Design Patterns: Factory

### Creational: Factory
- Returns concrete instances of a particular class that has multiple interpretations
- Construction process of instances is localized in a single method `getInstance()`
	- Parameters of `getInstance()` decide the interpretation of the class
- Example: Bank Account
	- Account can be of different types: Saving, Checking, Sweep in, etc
	- All account classes either extend a main account class or implement a main account interface
	- A string controls the type of account and each account has different interest rates
	- The string is a parameter for Factory's `getInstance()` and decides which account type's object will be created and returned
	- Downcasting is used in the driver class for dynamic object creation

### Creational: Abstract Factory
- Abstract factory returns a concrete factory instead of instances
3. `getFactory()` -> localizes construction of concrete factories (normal or rounded)

![abstract-factory](../imgs/Abstract%20Factory.png)