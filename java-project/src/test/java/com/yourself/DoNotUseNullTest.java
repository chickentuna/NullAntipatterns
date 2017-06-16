package com.yourself;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by charlotte on 14/06/17.
 */
public class DoNotUseNullTest {

    private DoNotUseNull doNotUseNull = new DoNotUseNull();

    @Test
    public void testDealWithList() {
        try {
            doNotUseNull.dealWithEmptyList();
            Assert.assertNotNull(doNotUseNull.getNameList());
            Assert.assertTrue(doNotUseNull.getNameList().isEmpty());
        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());

        }
    }

    @Test
    public void testDealEmptyString() {
        try {
            String name = doNotUseNull.dealWithEmptyString();
            Assert.assertEquals(StringUtils.EMPTY, name);
        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
        }
    }

    private static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }

    private static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }
}
