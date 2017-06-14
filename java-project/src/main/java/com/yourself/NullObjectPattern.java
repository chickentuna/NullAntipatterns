// { autofold
package com.yourself;

import com.yourself.nullobject.Tax;

public class NullObjectPattern {
 // }
/**
 * In this example, we apply a tax if the country is Denmark or Italy.  
 * We instantiate a different Tax object for each country.
 * For all other countries, no changes to the price is made.
 */    
public static double applyCountryTaxToPrice(double price, String country) {
	Tax tax = getTaxByCountry(country);
	
	return tax.apply(price);
}

public static Tax getTaxByCountry(String country) {
    if ("Denmark".equals(country)) {
        // The tax for Denmark add 25% to the price
        return (price) -> {
            return price * 1.25;
        };
    } else if ("Italy".equals(country)) {
        // The tax for Italy add 20% to the price
        return (price) -> {
            return price * 1.20;
        };
    }
    // This null might cause errors!
    // Replace it with a special Tax object which does not modify the value of price.
    return null;
}
//{ autofold
}
// }