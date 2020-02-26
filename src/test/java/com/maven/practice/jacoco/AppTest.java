package com.maven.practice.jacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AppTest {
	App object = new App();
	
	@Test
	public void countVowelsPositive() {
		assertEquals(5, object.countVowels("Abstemious"));
	}
	
	@Test
	public void countVowelsFalse() {
		assertNotEquals(4, object.countVowels("abstemious"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void countVowelsException() {
		assertEquals(0, object.countVowels(null));
	}
}
