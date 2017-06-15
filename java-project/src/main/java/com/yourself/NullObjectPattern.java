// { autofold
package com.yourself;

import com.yourself.nullobject.Tax;
import com.yourself.nullobject.TaxFactory;

public class NullObjectPattern {
 // }
/**
 * In this example, we apply a tax if the country is Denmark or Italy.  
 * We instantiate a different Tax object for each country.
 * For all other countries, no changes to the price is made.
 */    
public static double applyCountryTaxToPrice(double price, String country) {
	Tax tax = TaxFactory.getTaxByCountry(country);
	
	return tax.apply(price);
}
//{ autofold
}
// }