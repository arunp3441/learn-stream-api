package com;

import java.util.stream.IntStream;

public class StringPalindromeStream {

	public static void main(String[] args) {
		System.out.println("Is radar a Palindrome? - " + isPalindrome("radar"));
		System.out.println("Is apple a Palindrome? - " + isPalindrome("apple"));
		System.out.println("Is applpa a Palindrome? - " + isPalindrome("applpa"));
	}

	public static boolean isPalindrome(String originalString) { 
		String tempString = originalString.replaceAll("\\s+", "").toLowerCase(); 
        return IntStream.range(0, tempString.length() / 2)
            .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
    }

}
