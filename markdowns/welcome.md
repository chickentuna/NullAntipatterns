# Welcome!

The source code is on [GitHub](https://github.com/CodinGame/java-template), please feel free to come up with proposals to improve it.

In this playground, we will see how Java's `null` value should always be avoided and what solutions exist to bypass it.

# The problem

Should you null check everything? and what goes in else?

Semantically, what is null?
In this example:
```
d.get("Bob") // 044646464
d.get("Ted") // null, because Ted has no phone
d.get("Alice") // null, because Alice is unkown
```

object.method() => NPE (crash far away from source of problem)
Bugs only in runtime.

Let's take a look at how to avoid null-based problems sorted by ascending complexity

# Best practices with null
* Empty Collections.
* Empty String.


# requireNonNull

One of the first things you can do to avoid getting lost in null checks within your program is to guarantee that the arguments you start with are not null by using Object's static method `requireNonNull()`. This will throw an NPE from the very start before any of your code runs, which makes it far easier to debug than if your program malfunctions mysteriously later on.

@[Using requireNonNull]({"stubs": ["src/main/java/com/yourself/NonNull.java"], "command": "com.yourself.NonNullTest#test"})*

This is exaclty how [Guava Precondtion's checkNotNull](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/base/Preconditions.html#checkNotNull-T-) works.

# Optional
Java 8 also includes a nifty new class which was made specifically to manage *missing* values. It is effectively a wrapper class which contains either an instance of the given class, or a null value. It is therefore possible to manipulate null values as if they were normal instances without necessarily having to perform a null check at every step.

@[Using Optional]({"stubs": ["src/main/java/com/yourself/Optional.java"], "command": "com.yourself.OptionalTest#test"})*

# Null Object Pattern

It is sometimes possible to use a special Null Object to encapsulate the absence of an instance by providing an alternative that offers suitable default _do-nothing_ behavior. Basically, instead of using a null value, create an object which does absolutely nothing.

[comment]: <> (https://sourcemaking.com/design_patterns/null_object)

@[Null Object Pattern]({"stubs": ["src/main/java/com/yourself/NullObjectPattern.java"], "command": "com.yourself.NullObjectPatternTest#test"})*

