package bank;

import java.util.Scanner;

public class BankAccount {
		double bal;
		double prevTrans;
		String customerName;
		String customerId;

		BankAccount(String customerName, String customerId) {
			this.customerName = customerName;
			this.customerId = customerId;
		}

		void deposit(double amount) {
			if (amount < 0) {
				System.out.println("Enter a valid amount.");
			} else if (amount != 0) {
				bal += amount;
				prevTrans = amount;
			}
		}

		void withdraw(double amt) {
			if (amt != 0 && bal >= amt) {
				bal -= amt;
				prevTrans = -amt;
			} else if (bal < amt) {
				System.out.println("Bank Balance Insufficent");
			}
		}

		void getPreviousTrans() {
			if (prevTrans > 0) {
				System.out.println("Deposited: " + prevTrans);
			} else if (prevTrans < 0) {
				System.out.println("Withdrawn: " + Math.abs(prevTrans));// It is used for only positive value.
			} else {
				System.out.println("No Transaction occured");
			}
		}

		void menu() {
			char option;
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome: " + customerName);
			System.out.println("YourId: " + customerId);
			System.out.println("\n");
			System.out.println("a) Check Balance");
			System.out.println("b) Deposit Amount");
			System.out.println("c) Withdrawn Amount");
			System.out.println("d) Previous Transaction");
			System.out.println("e) exit");

			do {
				System.out.println("********************");
				System.out.println("Choose an option");
				option = sc.next().charAt(0);
				System.out.println("\n");

				switch (option) {
				case 'a':
					System.out.println("Bank balance: " + bal);
					System.out.println("\n");
					break;
				case 'b':
					System.out.println("Enter an amount to deposit: ");
					double amt = sc.nextDouble();
					deposit(amt);
					System.out.println("\n");
					break;
				case 'c':
					System.out.println("Enter an amount to Withdrawn: ");
					double amtW = sc.nextDouble();
					withdraw(amtW);
					System.out.println("\n");
					break;
				case 'd':
					System.out.println("Previous Transaction: ");
					getPreviousTrans();
					System.out.println("\n");
					break;
				case 'e':
					break;
				default:
					System.out.println("Choose a correct option to proceed");
					break;
				}

			} while (option != 'e');

			System.out.println("Thank you for using our Banking service. ");
		}

	}


