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
