package com.arrays.practice;

public class Three_ThreeMatrixMultiplication {
	public static void main(String args[]) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{6,2,3},{8,5,1},{8,2,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
