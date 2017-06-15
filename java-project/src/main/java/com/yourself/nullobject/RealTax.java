// { autofold
package com.yourself.nullobject;
// }
public class RealTax implements Tax {
    String country; // to which country this tax applies 
    double vat; // the VAT or (Value-added tax) of the country 
    
    public RealTax(String country, double vat) {
        this.country = country;
        this.vat = vat;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public double apply(double price) {
        // A normal tax object add the vat to the price
        return price * vat;
    }
}
