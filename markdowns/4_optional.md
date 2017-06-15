# Optional
Java 8 includes a nifty new class which was made specifically to manage **missing** values. It is a wrapper class which contains either an instance of the given class, or a null value. It is therefore possible to manipulate null values as if they were normal instances without necessarily having to perform a null check at every step.

If you're interested in Functional Programming, you may have guessed that Optional is the Java implementation of a _maybe monad_ as illustrated below.
![Maybe](/markdowns/img/maybe.png "Maybe monad example")

You can check if the Optional contains a value with the `isPresent()` method.

An instance of Optional can be created from a potentianally null object with the `ofNullable()` method.

How is this helpful? Well, now you can perform an operation on your Optional object without needing to check if a value exists first by using the `map()` method.

*Don't hesitate to check out [Optional in the javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html).*

Now try to solve the two exercises below.

@[Solve the first TODO]({"stubs": ["src/main/java/com/yourself/UseOptional.java","src/main/java/com/yourself/Database.java", "src/main/java/com/yourself/User.java"], "command": "com.yourself.UseOptionalTest#findUserFromDatabasetest", "layout":"aside"})

@[Solve the second TODO]({"stubs": ["src/main/java/com/yourself/UseOptional.java"], "command": "com.yourself.UseOptionalTest#findUserNameToCapitalLetter", "layout":"aside"})

*Tip: the Stream API works very well with Optionals* 😉