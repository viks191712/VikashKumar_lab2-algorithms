package com.vikash.lab2;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		int n, transaction[], target, sum = 0;
		int i;
		boolean flag = false;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the size of transaction array: ");
			n = scan.nextInt();
			transaction = new int[n];
			System.out.println("Enter the value of array: ");
			for (i = 0; i < n; i++) {
				transaction[i] = scan.nextInt();
			}
			System.out.println("Enter the total no of targets that needs to be achieved");
			int noOfTargets = scan.nextInt();
			
			int targetAmount[] = new int[noOfTargets];
			
			for(int index=0; index < targetAmount.length; index++) {
				System.out.println("Enter the value of target");
				int amount = scan.nextInt();
				
				int total = 0;
				boolean targetAchieved = false;
				for(int travel=0; travel < transaction.length; travel++) {
					total += transaction[travel];
					
					if(total >= amount) {
						System.out.println("Target achieved after " + (travel +1) +  " transaction(s) ");
						targetAchieved = true;
						break;
					}
				}
				if(! targetAchieved)
					System.out.println("Given target is not achieved");			
			}
			scan.close();
		}
	}
		
		
}