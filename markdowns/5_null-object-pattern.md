# Null Object Design Pattern

Sometimes, it is possible to use a special Null Object to encapsulate the absence of an instance by providing an alternative that behaves in a suitably passive way. Basically, instead of using a null value, create an object which has no impact on anything. The object will also be able to provide information on why a non-standard value was returned, whereas a null value cannot.

In Java, the pattern consists of having an `interface` to represent the object you wish to manipulate, a *Real* implementation which acts normally, and a *Null* implementation which can be used normally but will do nothing.

In the following example, an instance of `Tax` is created with a vat and a country, both received from a miniature database in `TaxFactory`. 

* You must modify the method `getTaxByCountry` to return a passive `NullTax` instead of a null.
* You must implement the `apply` method of the NullTax.

![uml1](/markdowns/img/uml1.png "NullObject Pattern UML example")


@[Implement the Null Object Pattern]({"stubs": ["src/main/java/com/yourself/NullObjectPattern.java", "src/main/java/com/yourself/nullobject/TaxFactory.java", "src/main/java/com/yourself/nullobject/Tax.java", "src/main/java/com/yourself/nullobject/RealTax.java", "src/main/java/com/yourself/nullobject/NullTax.java"], "command": "com.yourself.NullObjectPatternTest#test"})

# Going further

If you want several _normal_ objects to inherit from your interface, you need to make the equivalent of `RealTax` abstract and have all the non-null objects inherit from it. This enforces the semantical difference between a `RealTax` and a `NullTax`.

![uml2](/markdowns/img/uml2.png "Multiple Real classes")