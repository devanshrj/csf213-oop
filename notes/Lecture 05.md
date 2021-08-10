## Lecture 5
- Data Types, Variables

### Basics of Classes in Java
- **Naming** -> **camelCase** for instances/methods
- Anatomy of a Method

```java
<visibility_mod> <return_type> <name> (<parameters>) {
	<method_body>
}
```

- Components of a Method Declaration:
	- Modifiers (access)
	- Return type
	- Method name
	- Parameters in ( ) `<dtype param_name>`
	- Exception list
	- Method body in { }

- Signature of a method
	- Function definition
	- modifiers, return type, name, parameter list

 - Access Modifiers
	 - `public` -> field/method is accessible from all classes
	 - `private` -> field/method is accessible only within its own class
	 - Within the class def, access mods don't have any significance
	 - **Encapsulation** -> make fields private and use public methods to retrieve their values
	
- Instantiating objects
```java
<class_name> <object_name> = new <class_name>(<params>);
```

- Debugging tutorial for Eclipse (check shortcuts for continue and terminate)