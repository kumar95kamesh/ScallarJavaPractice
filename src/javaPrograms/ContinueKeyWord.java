package javaPrograms;

import java.util.Scanner;

public class ContinueKeyWord {

	public static void main(String[] args) {
		//print all even number
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)//odd number
			continue;//here it will not execute further code but continue the loop
			System.out.println(i);
		}

	}
	

}
