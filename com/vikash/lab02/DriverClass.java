package com.vikash.lab02;

import java.util.Scanner;

import com.vikash.lab02.MergeSort;

public class DriverClass {
	
	public static void main(String[] args) {
		System.out.println("Enter the size of currency denominations");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter the currency denominations value");
		int denominations[] = new int[n];
		for (int i = 0; i < n; i++) {
			denominations[i] = scan.nextInt();
			
		MergeSort mergeSort = new MergeSort();
		mergeSort.sortDsc(denominations, 0, denominations.length -1);
		}
		System.out.println("Enter the amount you want to pay");
		int sum = scan.nextInt();
		int count[] = new int[denominations.length];
		for (int i = 0; i < denominations.length; i++) {
			if (sum >= denominations[i]) {
				int x = sum / denominations[i];
				sum = sum - (denominations[i] * x);
				count[i] = x;
			}
		}
		if (sum > 0) {
			System.out.println("Not possible to pay the amount");
		} else {
			System.out.println("Your payment approach in order to give min no. of notes will be");
			for (int i = 0; i < count.length; i++) {
				if (count[i] !=0)
				System.out.println(denominations[i] + ":" + count[i]);
			}
		}
	}

}
