## Lecture 36
- Design Patterns: Strategy, Iterator

### Behavioral: Strategy
- Intent: Code should programmatically determine which algorithm, function or method should be executed at **runtime**
- Object's behavior changes based on client
- Capture abstraction in an interface, bury implementation details in a derived class
- Need to switch between different behaviors of classes in a class hierarchy

**Ex: Payment Strategy**
- Payment can be made through credit card or paypal
- So, we create a `PaymentStrategy` interface
	- `CreditCardStrategy` and `PaypalStrategy` implement the interface
- Additional payment strategies can also be implemented by simply adding new classes implementing `PaymentStrategy`
- This `PaymentStrategy` can be used in any situation where payment is required
	- Works as an independent component

**Pros**
- Prevents conditionals
- Strategy is completely independent from the rest of the code
	- Loosely coupled
- Easily extendable

**Cons**
- Client must be aware of different strategies
- Increases number of objects

**Difference with State**
- Main difference -> Context
- Strategy
	- Client chooses behavior at **runtime** without changing context
	- Client provides different strategies to context
	- Strategy object doesn't hold a reference to context
- State
	- Object can manage different states
	- State transition is managed by context or state itself
	- State object must hold a reference to context

![strategy](../imgs/Strategy%20Pattern.png)

### Behavioral: Iterator
- Used with other design patterns for traversal of a collection of objects

**Steps**
- Create `iterator()` to `Collections` class and grant iterated class privileged access
- Design `iterator()` that can encapsulate traversal of the collection class
- Clients ask the collection object to create an iterator object
- Clients use iterator methods to access elements of collection class

**Implementation**
- Create an **inner class** that implements `Iterator` interface
- Override the methods that are required for traversal of the collection
- Return the iterator created as inner class through an accessor method

**Pros**
- Doesn't expose underlying representation or data structure

**Cons**
- Applying pattern is overkill for simple collections
- Using an iterator may be less efficient than going through elements of specialized collections directly