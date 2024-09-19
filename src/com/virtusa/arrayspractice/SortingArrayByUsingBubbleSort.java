package com.virtusa.arrayspractice;

import java.util.Scanner;

public class SortingArrayByUsingBubbleSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=scan.nextInt();
		int array[]=new int[size]; 
		System.out.println("Enter the Elements");
		//storing
		for(int i=0;i<size;i++)
		{
			array[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}	
			}		
		}
		//printing
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}

	}

}
