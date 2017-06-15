// { autofold
package com.yourself.nullobject;

import java.util.HashMap;
import java.util.Map;
// }
public class TaxFactory {
    static Map<String, Double> vats = new HashMap<>();
    static {
        // These are the only three countries will want to apply a VAT tax to
        vats.put("Denmark", 1.25);
        vats.put("Italy", 1.20);
        vats.put("Hungary", 1.27);
    }
    
    public static Tax getTaxByCountry(String country) {
        Double vat = vats.get(country);      
        
        if (vat != null) {
            //No problem as long as we receive a country which exists
            return new RealTax(country, vats.get(country));
        }
        
        // This null might cause errors!
        // Replace it with a special NullTax object which does not modify the value of price.
        return null;
    }
}

