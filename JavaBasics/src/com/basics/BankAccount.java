package com.testjava;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double currentMoney = 0.0;
		boolean KeepRunning = true;
		while (KeepRunning) {
			
		
			System.out.println("MENU!\n------------");
			System.out.println("1.Deposit\n2.Withdraw\n3.Check your balance\n4.Close programm");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					currentMoney += depositMoney();
					break;
				case 2:
					currentMoney -= withdrawMoney(currentMoney);
					break;
				case 3:
					printBalance(currentMoney);
					break;
				case 4:
					System.out.println("Closing..");
					KeepRunning = false;
					break;
				default:
					System.out.println("Invalid choice!");
			}
		}

	}
	public static double depositMoney() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money do you want to deposit? : ");
		double amount = scanner.nextDouble();
		if (amount <= 0.0) {
			System.out.println("You cannot deposit negative or 0 amount of money!");
			return 0.0;
		}
		return amount;
		
	}
	public static double withdrawMoney(double cur_money) {
		if (cur_money == 0) {
			System.out.println("You dont have any money left!");
			return 0.0;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money do you want to withdraw? :");
		double amount = scanner.nextDouble();
		if (amount > cur_money) {
			System.out.println("The amount you requested is more than your current money.");
			return 0.0;
		}
		return amount;
	}
	public static void printBalance(double balance) {
		System.out.println("Your balance is: "+balance);
	}

}
