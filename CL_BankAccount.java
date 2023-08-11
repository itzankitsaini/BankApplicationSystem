package bank;

import java.util.Scanner;

public class CL_BankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		System.out.println("Enter your customerId");
		String customerId = sc.nextLine();

		BankAccount bankAccount = new BankAccount(name, customerId);
		bankAccount.menu();
	}
}
