## Lecture 22
- Comparator and Comparable Interfaces

### Comparable Interface
- Sorting interface for Collections
- Wrapper dtype classes (String) implement Comparable interface
- Only one method -> `compareTo(this, elem)`
	- Compares an instance with an object
	- Called as `this.compareTo(elem)`
- User defined classes can have an implementation of `compareTo()` using Comparable
- Ascending order return values
	- negative int if this < elem -> no swap
	- 0 if this = elem -> no swap
	- positive int if this > elem -> swap
```java
class Player implements Comparable<Player> {
	@Override
	public int compareTo(Player obj) {
		// comparison logic
	}
}

// array of Player references
Player[] player = new Player[n];

// sort() implicitly calls Comparable's compareTo()
Arrays.sort(player);
```

### Comparator Interface
- Built in classes don't have an implementation for Comparator
- User defined classes only
- Used for multiple ordering sequences
- Two methods
	- `compare(elem1, elem2)`
		- implementation required
		- params are two objects of the same class
	- `equals()` -> optional since `Object` class provides an implementation
		- used to **compare ordering sequence** of different Comparator classes
- Since multiple ordering sequences are possible, each ordering sequence is implemented in an individual class
```java
// Comparator class to sort in descending order
class CheckerDesc implements Comparator<Player> {
	@Override
	public int compare(Player obj1, Player obj2) {
		// comparison logic
	}
}

// Comparator class to sort in ascending order
class CheckerAsc implements Comparator<Player> {
	@Override
	public int compare(Player obj1, Player obj2) {
		// comparison logic
	}
}

class Player {
	// class for which comparator is used
}

// array of Player references
Player[] player = new Player[n];

// comparator class object
CheckerDesc checker = new Checker();

// sort() implicitly calls Comparator's compare()
Arrays.sort(player, checker);

// preferred: create anonymous object for Comparator class
Arrays.sort(player, new CheckerAsc());
```