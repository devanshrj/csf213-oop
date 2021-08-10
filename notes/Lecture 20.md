## Lecture 20
- Collections

### Collections
- Collections
	- Unified framework for data structures
	- Made up of interfaces, concrete and abstract classes

**List**
- Extends Collections
- Stores sequence of elements accessed by position
	- Order is preserved
- Can contain duplicate and `null` elements

**Set**
- Extends Collections
- Insertion order is not preserved
- Duplicate values are not allowed

### Lists
**Array List**
- Elements are stored in contiguous memory
- Insertion and deletion are more complex
- Retrieval is faster
- Preferred for search and retrievals

**Linked Lists**
- Elements can be stored in non-contiguous memory through pointers
- Insertion and deletion are faster (change head)
- Traversal is slower
- Preferred for insertions and deletions

### Array List
- Syntax
	- Uses generics for type safety and collections framework
```java
// create reference and object of ArrayList
ArrayList<Type> al1 = new ArrayList<Type>();
ArrayList<Type> al2 = new ArrayList<Type>();

/* 
- Create reference of List (interface type) and assign to object of AL
- Upcasting -> so only methods of List interface can be used
- Useful if the AL has to be changed to a Linked List later
*/
List<Type> l;
l = new ArrayList<Type>();

// add elements
al1.add(2);
al1.addAll(al2);			// add all elements from al2 to al1

// sort elements
Collections.sort(al1);

// ArrayList to Array
Type[] arr = new Type[al1.size()];
al1.toArray(arr);
```
- Features
	- Dynamic array implementation
	- Insertion order is preserved
	- Duplicate and null elements are allowed
- Default size of Array List = 10
	- Size grows with formula on reaching max capacity
	- `newCap = (oldCap * 3) / 2 + 1`
- Advantage
	- Retrieval -> due to `RandomAccess Interface`
- Disadvantage
	- Insertions and deletions at specific positions

### Iterator
- Interfaces for traversal (forward only)
- Implemented by most structures in Collections
	- Moving from one structure to another thus becomes easier as the code for iteration remains same
- Key methods:
	- `hasNext()` -> checks if a next element exists
	- `next()` -> returns next object
	- `remove()` -> removes object

**List Iterator**
- Interface that is specifically implemented by **Lists** (ArrayList and LinkedList)
- Forward and backward traversal
- Methods:
	- `add()` -> add element to list
	- `remove()` -> removes element that is currently being pointed to
	- `set()` -> replaces element that is currently being pointed to
	- `set()` and `remove()` don't have their own pointers, need `next()` or `previous()`
```java
// create Array List
ArrayList<Type> al = new ArrayList<Type>();

// create List Iterator for al
// maintains a pointer for current position
ListIterator<Type> itr = al.listIterator();

// forward traversal
while (itr.hasNext())
	itr.next();				// pointer moves to next element

// backward traversal
while (itr.hasPrevious())
	itr.previous();			// pointer moves to previous element
```