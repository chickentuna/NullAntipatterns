# The Easiest way to manage null

The easiest way to manage null is sometime to not using it. 
We often have the habbits to initialize our data (attributes, variable) to null.
It threaten us to use an method on a null object, and then, throw a amazing runtime exception later!
Why do not use empty type in the first place?


## Empty Collections
We often initialize collection to null to represent a collction who doesn got data yet. So we can replace it by an instanciation.
It prevent use of the runtinme exception and of the boring null check at every step of our code. Moreover each collection has a is empty method easy to manipulate.

@[Replace the NULL initialisation of the list]({"stubs": ["/src/main/java/com/yourself/Optional.java"], "command": "com.yourself.DoNotUseNullTest#testDealWithList", "layout":"aside"})

## Empty String

The other kind of data often initialized to null is String.
But for the same reasons we will prefer to use empty string, in place of null.

If you want to have a clearer way to write it, you can declare a constant in your code:
```Java
public final String EMPTY_STRING = "";
```
But if you prefer to use an external library, the Apache Common Lang define many usefull methods for String manipulation, and an alias for empty String.

```Java
import org.apache.commons.lang3.StringUtils;

public String name = StringUtils.EMPTY;
```

@[Replace the NULL initialisation of the name]({"stubs": ["/src/main/java/com/yourself/Optional.java"], "command": "com.yourself.DoNotUseNullTest#testDealEmptyString", "layout":"aside"})