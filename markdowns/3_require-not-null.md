
# requireNonNull

One of the first things you can do to avoid getting lost in null checks within your program is to guarantee that the arguments you start with are not null by using Object's static method `requireNonNull()`. This will throw an NPE from the very start before any of your code runs, which makes it far easier to debug than if your program malfunctions mysteriously later on.

@[Using requireNonNull]({"stubs": ["src/main/java/com/yourself/NonNull.java"], "command": "com.yourself.NonNullTest#test"})*

This is exaclty how [Guava Precondtion's checkNotNull](http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/base/Preconditions.html#checkNotNull-T-) works.

