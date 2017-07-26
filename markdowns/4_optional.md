# Optional

Java 8 includes a nifty new class which was made specifically to manage **missing** values. It is a wrapper class which contains either an instance of the given class or a null value. Therefore, it is possible to manipulate null values as if they were normal instances without necessarily having to perform a null check at every step.

If you're versed in Functional Programming, you may have guessed that Optional is the Java implementation of a _maybe monad_.

You can check if the Optional contains a value with the `isPresent()` method.

An instance of Optional can be created from a potentially null object with the `ofNullable(value)` method.

How is this helpful? Now, by using the `map()` method, you can perform an operation on your Optional object without needing to check if a value exists first.

*Don't hesitate to check out [Optional in the javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html).*

Try to solve the two exercises below:

@[Solve the first TODO]({"stubs": ["src/main/java/com/yourself/UseOptional.java","src/main/java/com/yourself/Database.java", "src/main/java/com/yourself/User.java"], "command": "com.yourself.UseOptionalTest#findUserFromDatabasetest", "layout":"aside"})

@[Solve the second TODO]({"stubs": ["src/main/java/com/yourself/UseOptional.java"], "command": "com.yourself.UseOptionalTest#findUserNameToCapitalLetter", "layout":"aside"})

*Tip: the Stream API works very well with Optionals* 😉
