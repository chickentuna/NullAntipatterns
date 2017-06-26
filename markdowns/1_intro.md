# Welcome!

In this playground, we will learn why Java's `null` value should always be avoided and what solutions exist to bypass it.

# The null problem

Typically, when writing Java code, you will find yourself asking questions such as:
* What if this API returns `null`?
* If so, what does `null` mean?
* Does this API accept `null`?
* Does `null` represent an error or normal behaviour?

Eventually, you will see `null` checks everywhere, especially when dealing with external code.

A typical confusion situation:
```java
Man findABrotherInLawOf(Man user) {
    Man anyBrotherInLaw = null;
    Woman userWife = user.getWife();

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
So many nulls and this code snippet still has the potential to crash because of a runtime `null` error! What if `user` turns out to be `null`? Should it be necessary to check if `brothers` is `null`? Isn't there a simpler way to write this piece of code to make it easier to both maintain and read?

**Absolutely.**

The main issue with `null` is its very existence. It doesn't even have a common semantical meaning. For example, what does `null` mean here?
```java
phoneNumbers.get("Bob") // 202-555-0167
phoneNumbers.get("Ted") // null, because Ted has no phone
phoneNumbers.get("Alice") // null, because Alice is unknown
```

It wouldn't be so bad if the compiler could warn you when you risk a NullPointerException due to bad null handling. However, it will only crash at runtime and direct you to a random spot in the middle of some code snippet, quite distant from the source of the problem.

Let's take a look at how to avoid the more common null-based problems 🐛.

The full source and code of this course [GitHub](https://github.com/chickentuna/NullAntipatterns). Please feel free to come up with proposals to improve it.
