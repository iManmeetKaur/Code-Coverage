package com.maven.practice.jacoco;

public class App {
	public int countVowels(String input) {
		if (input == null) {
			throw new IllegalArgumentException("Input can't be null.");
		}
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'i' || input.charAt(i) == 'e'
					|| input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A'
					|| input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U') {
				count++;
			}
		}
		return count;
	}
}
