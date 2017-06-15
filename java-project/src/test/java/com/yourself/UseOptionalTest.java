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
	public void findUserFromDatabasetest()  {
		Assert.assertTrue( useOptional.getUserFromDatabase("Nico").isPresent() );
		Assert.assertEquals("CTO", useOptional.getUserFromDatabase("Nico").get().getStatus() );
		Assert.assertFalse(useOptional.getUserFromDatabase("James").isPresent() );
	}

	@Test
	public void findUserNameToCapitalLetter(){
		Assert.assertTrue(useOptional.getUserNameToUpperCaseFromDatabase("Val").isPresent());
		Assert.assertEquals("VAL", useOptional.getUserNameToUpperCaseFromDatabase("Val").get());
		Assert.assertFalse(useOptional.getUserNameToUpperCaseFromDatabase("Toto").isPresent());
	}
}