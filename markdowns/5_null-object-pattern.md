# Null Object Design Pattern

It is sometimes possible to use a special Null Object to encapsulate the absence of an instance by providing an alternative that behaves in a suitably passive way. Basically, instead of using a null value, create an object which has absolutely no impact on anything.

In it's simplest form, the pattern consists of having an `interface` to represent the object you wish to manipulate along with a *real* implementation, which acts normally, and a *null* implementation wish can be used normally but will do nothing.

@[Simple Null Object Pattern]({"stubs": ["src/main/java/com/yourself/NullObjectPattern.java"], "command": "com.yourself.NullObjectPatternTest#test"})*

[comment]: <> (https://sourcemaking.com/design_patterns/null_object)



