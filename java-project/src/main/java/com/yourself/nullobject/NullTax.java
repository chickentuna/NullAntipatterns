// { autofold
package com.yourself.nullobject;
// }
public class NullTax implements Tax {

    String country = "COUNTRY UNKNOWN";
    
    public NullTax(String country) {
        if (country != null) {
            this.country = country;
        }
    }
    
    @Override
    public String getCountry() {
        // return the country the user asked a tax for even if there is not VAT.        
        return country;
    }

    @Override
    public double apply(double price) {
        // TODO: Do not affect the price
        return 0;
    }

}
