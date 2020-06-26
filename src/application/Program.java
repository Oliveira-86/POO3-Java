package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount client;
		
		System.out.println("---Enter Account Data---");
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter cliente name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print(" Is tere an Inictial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			client = new BankAccount(accountNumber, name, initialDeposit);
		}else {
			client = new BankAccount(accountNumber, name);
		}
		
		  
		System.out.println("---Account Data: " + client);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double money = sc.nextDouble();
		client.depositMoney(money);
		System.out.println("Update Account Data: " + client);
		
		System.out.println();
		System.out.print("Enter a withdrow value: ");
		double money2 = sc.nextDouble();
		client.withDrow(money2);
		System.out.println("Update Account Data: " + client);

		
		sc.close();
			

	}

}
