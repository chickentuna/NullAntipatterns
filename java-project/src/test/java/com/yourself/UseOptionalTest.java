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
		Assert.assertTrue("Nico should be in the database.", useOptional.getUserFromDatabase("Nico").isPresent() );
		Assert.assertEquals("What is Nico's status?", "CTO", useOptional.getUserFromDatabase("Nico").get().getStatus() );
		Assert.assertFalse("James should not be in the database.", useOptional.getUserFromDatabase("James").isPresent() );
	}

	@Test
	public void findUserNameToCapitalLetter() {
		Assert.assertTrue("Uppercase Val should be present.", useOptional.getUserNameToUpperCaseFromDatabase("Val").isPresent());
		Assert.assertEquals("Uppercase Val.", "VAL", useOptional.getUserNameToUpperCaseFromDatabase("Val").get());
		Assert.assertFalse("Uppercase Toto should not be present.", useOptional.getUserNameToUpperCaseFromDatabase("Toto").isPresent());
	}
}