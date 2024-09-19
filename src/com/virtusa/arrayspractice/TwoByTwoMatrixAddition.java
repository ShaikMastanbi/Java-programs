package com.virtusa.arrayspractice;

import java.util.Scanner;

public class TwoByTwoMatrixAddition {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int row,col,i,j;
		System.out.println("enter the number of rows");
		row=sc.nextInt();
		System.out.println("enter the number of columns");
		col=sc.nextInt();
		
		int mat1[][]=new int[row][col];
		int mat2[][]=new int[row][col];
		int res[][]=new int[row][row];
		
		
		System.out.println("enter the elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				mat1[i][j]=sc.nextInt();
			
			System.out.println();
		}
		
		

		System.out.println("enter the elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				mat2[i][j]=sc.nextInt();
			
			System.out.println();
		}
		
		
		
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				res[i][j]=mat1[i][j]+mat2[i][j];
		
		
		
		System.out.println("sum of matrices is");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				System.out.print(res[i][j]+"\t");
			
			System.out.println();
		}
		
		
	}

}
