# Optional
Java 8 also includes a nifty new class which was made specifically to manage *missing* values. It is effectively a wrapper class which contains either an instance of the given class, or a null value. It is therefore possible to manipulate null values as if they were normal instances without necessarily having to perform a null check at every step.

Optional are the java implementation of maybe monad:
![uml1](/markdowns/img/maybe.png "Maybe monad example")

To keep it simple an option is a wrapper which accepts two kinds of content: 
* A content "value" which will be return each time that it's possible
* A "Nul" value which will be return when no correct value can be returned

You can check if the value is defined with the isPresent() method.
Optional can be created from nullable data with from nullable.




[You can check the javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)

Optional has a bunch of functional method:
```java
Optional.ofNullable(object)	return an optional from a nullable object
Optional.isPresent()		true if the value is setted
option.map(x->x)			will applicate the predicate to the value of the option
```

You can now solve theses two exercises.


@[Solve the first todo]({"stubs": ["src/main/java/com/yourself/UseOptional.java"], "command": "com.yourself.UseOptionalTest#findUserFromDatabasetest"})

@[Solve the second todo]({"stubs": ["src/main/java/com/yourself/UseOptional.java"], "command": "com.yourself.UseOptionalTest#findUserFromDatabasetest", "layout":"aside"})


*Tips: if you are used to use Stream api in java 8, it is return optional*