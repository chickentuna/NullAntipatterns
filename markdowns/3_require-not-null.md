
# Require non null parameters

One of the first things you can do to avoid null-related problems is to require that given values be not null by using the static method `Objects.requireNonNull()`. 

Without this, your code will have to check for null every time the given value should be used, which is error-prone and confusing. If a null manages to slip into your code, your program may start behaving in mysterious and unexpected ways.

By requiring non-null values from the very start of a method's execution, you will easily isolate the problem when dealing with a `NullPointerException`, which makes debugging far easier than if the program crashes several hundred lines later.

You may also attach a custom error message to the NPE by using Objects.requireNonNull.

@[Use Objects.requireNonNull]({"stubs": ["src/main/java/com/yourself/NonNull.java"], "command": "com.yourself.NonNullTest#test"})*

If you are a Guava user, you will have recognised this behaviour in [Guava's Preconditions.checkNotNull](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/base/Preconditions.html#checkNotNull-T-).

