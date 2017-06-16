package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UseOptionalTest {

	private UseOptional useOptional = new UseOptional();


	@Test
	public void findUserFromDatabasetest() {
	    try {
		Assert.assertTrue("Nico should be in the database.", useOptional.getUserFromDatabase("Nico").isPresent() );
		Assert.assertEquals("What is Nico's status?", "CTO", useOptional.getUserFromDatabase("Nico").get().getStatus() );
		Assert.assertFalse("James should not be in the database.", useOptional.getUserFromDatabase("James").isPresent() );
    } catch (AssertionError ae) {
        success(false);
        msg("Oops! 🐞", ae.getMessage());
    }
	}

	@Test
	public void findUserNameToCapitalLetter() {
	    try {
		Assert.assertTrue("Uppercase Val should be present.", useOptional.getUserNameToUpperCaseFromDatabase("Val").isPresent());
		Assert.assertEquals("Uppercase Val.", "VAL", useOptional.getUserNameToUpperCaseFromDatabase("Val").get());
		Assert.assertFalse("Uppercase Toto should not be present.", useOptional.getUserNameToUpperCaseFromDatabase("Toto").isPresent());
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