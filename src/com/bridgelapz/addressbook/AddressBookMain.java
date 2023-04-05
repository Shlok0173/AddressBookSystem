package com.bridgelapz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("Welcome To AddressBook Program");
		Scanner scanner = new Scanner(System.in);
		AddressBook addressbook = new AddressBook();
		Contacts contact = new Contacts();
		int i = 0;
		do {
			System.out.println("Enter Your Choice");
			System.out.println("1 : Add Contacts");
			System.out.println("2 : Edit Contact");
			System.out.println("3 : Delete Contact");
			System.out.println("4 :Display");
			System.out.println("5 : Exist");
			int ch = scanner.nextInt();

			switch (ch) {
			case 1:
				addressbook.addContact();
				break;

			case 2:
				addressbook.contactEdit();
				break;
			case 3:
				addressbook.contactEdit();
				break;

			case 4:
				addressbook.displayContact();
				break;
			case 5:
			default:
			}

			System.out.println("Continue press 1");
			i = scanner.nextInt();
		} while (i == 1);

		addressbook.addContact();
		addressbook.contactEdit();
		addressbook.contactDelete();
		addressbook.displayContact();

	}
}
