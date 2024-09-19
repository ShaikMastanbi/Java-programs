package com.virtusa.arrayscodes;

import java.util.Scanner;

public class Duplicates {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		char[]  ch = str.toCharArray();
		
		System.out.println("the duplicate eliments are");
		
		for(int i =0;i<str.length();i++)
		{
			int count = 1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=0;
				}
			}
			if(count>1&&ch[i]!=0) {
				System.out.println(ch[i]);
			}
		}
	}

}
