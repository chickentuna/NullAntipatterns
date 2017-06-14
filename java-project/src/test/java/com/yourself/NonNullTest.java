package com.yourself;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

public class NonNullTest {

	@Test
	public void test() throws FileNotFoundException {
		try {
			
			Assert.assertEquals("containsVowels('Hello')", true, NonNull.containsVowels("Hello"));
			Assert.assertEquals("containsVowels('Sphynx')", false, NonNull.containsVowels("Sphynx"));
			boolean caughtNPE = false;
			try {
			    NonNull.containsVowels(null);
			} catch (NullPointerException npe) {
			    Assert.assertEquals("containsVowels(null) throws an NPE with a custom message?", "please don't give me a null", npe.getMessage());
			    caughtNPE = true;
			}
			
			Assert.assertTrue("containsVowels(null) throws an NPE?", caughtNPE);
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