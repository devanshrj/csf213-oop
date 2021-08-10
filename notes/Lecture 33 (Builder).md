## Lecture 33
- Design Patterns: Builder
- [UML Representation](https://www.tutorialspoint.com/uml/uml_basic_notations.htm)

### Creational: Builder
**Intent**
- Separate construction of a complex object from its representation so that the same construction process can create different representations
- Parse a complex representation, create one of several targets.

**Problem**
- An application needs to create the elements of a complex aggregate

**Terms**
- Cardinality -> terms in which one class is related to another class
- Aggregation
- Composition
	- If a containing object is destructed, all the objects that it contains will also be destructed
	- Stronger form of aggregation
	- Black diamond
- Sequence diagram in UML

**Example**
- Vacation planning
	- Day wise activity planning
- Invoking the constructor of vacation builds all the objects required for vacation

**Description**
- Need a flexible design
- Flexible data structure
- Follow a sequence of potentially complex steps