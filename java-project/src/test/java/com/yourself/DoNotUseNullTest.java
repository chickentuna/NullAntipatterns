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
    public void testDealWithList(){
        doNotUseNull.dealWithEmptyList();
        Assert.assertNotNull(doNotUseNull.getNameList());
        Assert.assertTrue(doNotUseNull.getNameList().isEmpty());
    }

    @Test
    public void testDealEmptyString(){
        String name = doNotUseNull.dealWithEmptyString();
        Assert.assertEquals(StringUtils.EMPTY, name);
    }
}
