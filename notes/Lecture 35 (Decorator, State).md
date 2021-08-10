## Lecture 35
- Design Patterns: Decorator, State
- [Github](https://github.com/JenniferRanjani/Object-Oriented-Programming-with-Java)

### Design Principle
- Classes should be open for extension and closed for modification
- Composition -> major part of a component
	- Ex: every car has an engine
- Aggregation -> not necessarily required
	- Ex: car may have passengers

### Structural: Decorator
- Structural -> organizing different classes and objects to form larger structures and provide new functionality
- Add functionality to a basic component, irrespective of order
	- Does not affect functionality of other objects
- Disadvantage
	- Code maintainability since a lot of similar decorators might be required
 
**Customized apartment, colored walls or curtains**
- Issues
	- Price changes require code alteration
	- New modifications will require new methods
- Modifies functionality of an object at **runtime**
- Inheritance or composition extends functionality of an object at **compile time**
	- Leads to **explosions of subclasses**

### Behavioral
- Describes the way in which objects and classes interact and divide responsibilities among themselves.
- Conditional checking decides behavior of objects

### Behavioral: State
- Similar to state graphs in DD
- Used when an object can be in one of several states
- Intent: Object oriented state machine
- Uses **Polymorphism** to define different behaviors for different states of an object
- Instead of using `if else` conditionals, we create a class for every state

**Implementation**
- Context class
	- Represents interface to outside world
	- Maintains a pointer to current state
	- Change of state requires change of pointer
- State `abstract` class
	- Base class -> defines different states of **state machine**
- Derived classes from State class
	- Defines true nature of state that the state machine can be in

**When to use?**
- Object has a complex set of possible states, with rules for transitions and state changes
- Real world problems with complex workflows

**Advantages**
- Minimizes conditional complexity and eliminates `if else` conditions
- Useful for state machines

**Disadvantages**
- Code size depends on number of states and transition methods
	- Can lead to **explosion of subclasses**

![state](../imgs/State%20Pattern.png)