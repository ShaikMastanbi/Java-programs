package com.virtusa.arrayspractice;

import java.util.Scanner;

public class RepatedWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("write the paragraph");
		String str = sc.nextLine();
		int count=0;
		str=str.toLowerCase();
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			count = 1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i]==words[j]) {
					count++;
				}
			}
			
			if(count>1&& words[i]!="0") {
				System.out.println(words[i]);
			} 
		}
		
		
			
		
	}

}
