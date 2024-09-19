package com.virtusa.arrayscodes;

import java.util.Scanner;

public class AllUniqueCharectersInString {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String s = scan.nextLine();
		char[] s1 = s.toCharArray();
		boolean s2 = true;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s1[i]==s1[j])
				{
					s2=false;
				}
			}
		}
		if(s2==true)
		{
			System.out.println("unique charecters");
		}
		else
		{
			System.out.println("Duplicate values");
		}
		
	}

}
