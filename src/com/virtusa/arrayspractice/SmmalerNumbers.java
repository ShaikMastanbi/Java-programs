package com.virtusa.arrayspractice;

import java.util.Scanner;

public class SmmalerNumbers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int length = sc.nextInt();
		int a[] = new int[length] ;
		System.out.println("enter the elements");
		
		
		for(int i = 0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int small=a[0];
		int large=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small) {
				small = a[i];
			}
			if(a[i]>large) {
				large =a[i];
			}
		}
		System.out.println(small);
		System.out.println(large);
		
		
	}

}
