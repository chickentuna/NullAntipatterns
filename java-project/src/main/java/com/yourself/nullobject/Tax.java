// { autofold
package com.yourself.nullobject;
// }
/**
 * A Tax object contains the country for which the tax exists.
 * The apply method performs an operation on a given price and returns the new price. * 
 */

public interface Tax {
    String getCountry();
    double apply(double price);
}
