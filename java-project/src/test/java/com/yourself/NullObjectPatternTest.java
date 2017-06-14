package com.yourself;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

public class NullObjectPatternTest {

    @Test
    public void test() throws FileNotFoundException {
        try {
            boolean caughtNPE = false;
            try {
                Assert.assertEquals("applyCountryTaxToPrice(50, 'Denmark')", 50 * 1.25,
                        NullObjectPattern.applyCountryTaxToPrice(50, "Denmark"), 0);
                Assert.assertEquals("applyCountryTaxToPrice(150, 'Italy')", 150 * 1.20,
                        NullObjectPattern.applyCountryTaxToPrice(150, "Italy"), 0);
                Assert.assertEquals("applyCountryTaxToPrice(300, 'USA')", 300,
                        NullObjectPattern.applyCountryTaxToPrice(300, "USA"), 0);
                Assert.assertEquals("applyCountryTaxToPrice(80, null)", 80,
                        NullObjectPattern.applyCountryTaxToPrice(80, null), 0);

                Assert.assertEquals("getTaxByCountry('Denmark')", 50 * 1.25,
                        NullObjectPattern.getTaxByCountry("Denmark").apply(50), 0);
                Assert.assertEquals("getTaxByCountry('Italy')", 50 * 1.20,
                        NullObjectPattern.getTaxByCountry("Italy").apply(50), 0);
                Assert.assertEquals("getTaxByCountry('USA')", 50,
                        NullObjectPattern.getTaxByCountry("USA").apply(50), 0);
                Assert.assertEquals("getTaxByCountry(null)", 50,
                        NullObjectPattern.getTaxByCountry(null).apply(50), 0);
                

            } catch (NullPointerException e) {
                caughtNPE = true;
            }
            Assert.assertTrue("null handled?", !caughtNPE);
            success(true);

        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
        }
    }

    private static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }

    private static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }
}