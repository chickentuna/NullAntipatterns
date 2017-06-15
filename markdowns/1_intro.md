# Welcome!

The source code is on [GitHub](https://github.com/chickentuna/NullAntipatterns), please feel free to come up with proposals to improve it.

In this playground, we will see how Java's `null` value should always be avoided and what solutions exist to bypass it.

# The null problem

Typically, when writing Java code, you will find yourself asking questions such as:
* What if this API returns null?
* If so, what does null mean?
* Does this API accept null?
* Does null represent an error or normal behaviour?
And so on...

Eventually, you will see null checks everywhere, especially when dealing with external code.

A typical confusion situation:
```java
Man findABrotherInLawOf(Man user) {
    Man anyBrotherInLaw = null;
    Wife userWife = user.getWife();
    if (userWife != null) {
        List<Man> brothers = userWife.getBrothers();
        if (brothers != null) {
            Battery firstBrother = brothers.get(0);
            if (firstBrother != null) {
                anyBrotherInLaw = firstBrother;
            }
        }
    }
    return anyBrotherInLaw;
}
```
So many nulls! And this code still has the potential to crash because of one. What if `user` turns out to be null? Should it be necessary to check the nullity of `brothers` ? Isn't there a simpler way to write this piece of code and make it easier to both maintanable and readable? 

Absolutely.

The main issue with null is it's very existence. It doesn't even have a common semantical meaning. For example, what does null mean here?
```
phoneNumbers.get("Bob") // 202-555-0167
phoneNumbers.get("Ted") // null, because Ted has no phone
phoneNumbers.get("Alice") // null, because Alice is unknown
```

It wouldn't be so bad if the compiler could warn you when you risk a NullPointerException due to bad null handling. However, it will only ever crash at runtime and, more often than not, slap bang in the middle of some code very far away from the source of the problem.

Let's take a look at how to avoid the more common null-based problems sorted by ascending complexity.
