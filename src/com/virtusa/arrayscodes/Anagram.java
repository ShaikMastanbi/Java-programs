package com.virtusa.arrayscodes;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string1");
		String s1 = sc.nextLine();
		System.out.println("enter the second String");
		String s2 = sc.nextLine();
		
		if(s1.length()==s2.length()) {
			
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean result = Arrays.equals(ch1, ch2);
		
		if(result) {
			System.out.println(s1+"and" +s2+ "are anagrams");
		}
		else {
			System.out.println(s1+"and" +s2+ "are not anagrams" );
		}
		
		}
		else {
			System.out.println(s1+"and" +s2+ "are not anagrams" );
		}
		
		
	}

}
