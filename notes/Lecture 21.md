## Lecture 21 
- Collections - Set and Map

### Set
- Key features
	- Unordered
	- No duplicate elements
	- No control over index

- Implemented by
	- HashSet
	- LinkedHashSet
	- TreeSet (sorted representation)
- Hashing
	- Mechanism to put a set of objects into separate bins
	- Number of bins != number of objects
	- object.hashCode() -> to get hash code of any object

- Objects are inserted based on their hash code (function in Object class)
	- Hash code -> internal address of object is converted to integer
	- Unique hash code for each address/object

- hashCode() function can be overridden
	- Since multiple objects can have the same hash code, an overridden implementation of `equals()` method must also be provided

- Hash Set first uses the hash code to identify the bin
	- Within the bin, `equals()` method is used to identify objects

**Hash Set**
- Hash Table
	- Data structure incorporated by HashSet
	- **Faster retrieval mechanism**
- NULL elements are allowed
- add(), contains(), remove(), size() take **constant time**
```java
// syntax
HashSet<Type> set = new HashSet<Type>();
set.add(element);		// add element to set

// Iterator for iterating set
Iterator<Type> iterator = set.iterator();

// custom hashCode function
public int hashCode() {
	return elem.hashCode();
}

// overridden equals() method to differentiate objects
public boolean equals(Object object) {
	if (object instanceof Class) {
		Class instance = (Class) object;	// downcast
		// compare objects
		}
}
```

**Linked Hash Set**
- Maintains a linked list of entries in the set
- **Insertion order is maintained**
- Basically, a linked list that does not allow duplicates

**Tree Set**
- Implements NavigableSet interfaces
- Data structure -> tree
- Objects are stored in **sorted, ascending order**
- **Access and retrieval times are fast**

### Map
- Object that stores key: value pairs
	- Each pair is an entry
- Keys are unique, values can be duplicated
	- Value is overridden if same key is used multiple times
- Pros
	- **Search, update, or delete elements based on a key**
- Maps don't implement Iterator interfaces

**Entry**
- Entry is sub interface of Map
- Used for traversal of Map
- Provides methods to get key and value
	- Object getKey()
	- Object getValue()

**Hash Map**
- Values based on keys
- Insertion order is not preserved
- May have one null key and multiple null values
```java
// syntax
HashMap<KeyType, ValueType> hm = new HashMap<KeyType, ValueType>();
hm.put(key, value);			// add entry

// traversal
for(Map.Entry<KeyT, ValueT> m: hm.entrySet()) {
	key = m.getKey();
	value = m.getValue();
}
```

**Linked Hash Map**
- Insertion order is preserved

**Tree Map**
- Maintains ascending order

![map methods](../imgs/Map%20Methods.png)