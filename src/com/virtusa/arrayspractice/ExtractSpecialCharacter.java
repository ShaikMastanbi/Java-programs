package com.virtusa.arrayspractice;

import java.util.Scanner;

public class ExtractSpecialCharacter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Given string");
		String s=scan.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
			{
				System.out.println(s.charAt(i));
			}
		}	

	}

}
