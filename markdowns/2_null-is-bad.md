# The Easiest way to manage null

Sometimes, the easiest way to manage `null` is to not use it. 
Java coders tend to acquire the habit of initializing data (attributes & variables) to `null`.
This puts them at risk of using a method on the `null` object, thus causing an overwhelming runtime exception to be thrown!

It's generally a better idea to use an empty type to initialize data and yield the same results as a null check.


## Empty Collections

We are frequently tempted to initialize a collection to null to represent the fact that it has not been given any data yet, making it necessary to instantiate it at a later time.

Why not instantiate it straight away?

This will prevent a potential NullPointerException at runtime and free us of the chore to check if it is null before we try to access it. Moreover, every collection has an `isEmpty()` method which is as easy to manipulate as anything.

@[Replace the NULL initialization of the list]({"stubs": ["/src/main/java/com/yourself/DoNotUseNull.java"], "command": "com.yourself.DoNotUseNullTest#testDealWithList", "layout":"aside"})

## Empty String

`String` data types are often initalized to null as well. However, for the exact same reasons, we prefer to use an **empty string** to replace `null`.

If you want to make it as clear as possible, you can declare a constant in your code such as:
```Java
public final String EMPTY_STRING = "";
```
Instead, many coders prefer to use an external library. The Apache Common Lang defines many useful methods for String manipulation, as well as an alias for an empty String.

```Java
import org.apache.commons.lang3.StringUtils;

public String name = StringUtils.EMPTY;
```

@[Replace the NULL initialization of the name]({"stubs": ["/src/main/java/com/yourself/DoNotUseNull.java"], "command": "com.yourself.DoNotUseNullTest#testDealEmptyString", "layout":"aside"})
