package javaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalTestCases = sc.nextInt();
		for(int t=0;t<totalTestCases ;t++)
		{
			int n = sc.nextInt();
			int count = 0;
			for (int i = 1; i < n; i++) {
				if (n % i == 0)
					count++;
				if (count > 1) {
					System.out.println("Not prime number");
					break;
				}
			}
			if (count == 1) {
				System.out.println(" prime number ");
			}
			
			if(count<1)	System.out.println("Prime number starts from 2 ");
			
		}
	}

}
