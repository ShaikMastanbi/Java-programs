package com.virtusa.arrayspractice;

import java.util.Scanner;

public class PringArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			//System.out.println(a[i]);
			
		}
		System.out.print("elements are");
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		
		
	

	}

}
