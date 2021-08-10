## Lecture 34
- Design Patterns: Composite

### Structural: Composite
- Structural patterns
	- Structural organization of classes
	- Work with aggregation and composition
	- One class composes instance(s) (multiple instances using array, etc.) of another class and performs certain operations
- Convenient to manipulate composites just like manipulating individual components
- Container containing components is called **Composite**
	- A function applied to the composite will be recursively/iteratively applied to all the components of the composite
- Composite objects -> objects that contain other objects
- Perform operations on primitive objects and composites without distinguishing between the two
- Aggregation -> child can exist independent of parent
- Composition -> child cannot exist independent of parent

**Leaf Class**
- Concrete primitive component

**Composite**
- Concrete composite component
- `HAS-A` relationship from component to composite
- Composite has a collection of `Component`
	- Can also have leaf as component
- Objective is to not distinguish between `leaf` and `composite`

**Component**
- Super class of `leaf` and `composite`
- Can be `abstract` class or interface

**Limitation**
- `Composite` can have its own methods, apart from the common ones
- To execute these methods, the instance reference of `Component` has to be type casted to `Composite` and then called

**Solution**
- Solution to the above limitation is to implement all the methods through `Component`
- For methods, that are specific to `Composite`, provide overridden implementation in `Leaf` that throws custom exception
![composite](../imgs/Composite%20Pattern.png)

**Which implementation of Composite pattern to use?**
- The implementation with `Composite` methods in `Component` becomes messy and lengthy because each such method has to be overridden in `Leaf` with a custom exception
	- This will require rewriting code
	- `Composite` specific methods here are called `Responsibilites` and are domain specific to `Composite`
- Design Principle: `Open Closed Principle`
	- Class should be open for extension but closed for modification
	- Class can be extended by composing it in another class
	- Rewriting code is not desirable