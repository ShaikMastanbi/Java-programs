package com.virtusa.arrayspractice;

public class NumberOfVowelsAndConsonetsAndSpaceInString {
	public static void main(String[] args)
	{
		String str ="Hello Every One";
		str.strip().toLowerCase();
		int vcount=0;
		int ccount=0;
		int wcount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='0'||str.charAt(i)=='u')
			{
				vcount++;
			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z'&&str.charAt(i)!=' ')
			{
			ccount++;
			}
			else if(str.charAt(i)==' ')
			{
				wcount++;
			}
			else {
				System.out.println();
			}
			
		}
		System.out.println("number of vowels:"+vcount);
		System.out.println("number of consonats:"+ccount);
		System.out.println("number of white spaces:"+wcount);
	}

}
