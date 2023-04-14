package com.bridgelapz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("Welcome To AddressBook Program");
		Scanner scanner = new Scanner(System.in);
		MultipleAddressBook addressbook = new MultipleAddressBook();
		Contacts contact = new Contacts();
		int i = 0;
		do {
			System.out.println("Enter Your Choice");
			System.out.println("1:To add The new AddressBook");
			System.out.println("2 : Add Contacts");
			System.out.println("3: To edit the contact in AddressBook");
		//	System.out.println("2 : Edit Contact");
			System.out.println("4: TO delete the contact in AddressBook");
			System.out.println("5 : Delete AddresBook");
			System.out.println("6: printBook");
			System.out.println("5 : Exist");
			int ch = scanner.nextInt();

			switch (ch) {
			case 1:
				addressbook.addAddressbook();
			case 2:
				addressbook.addContact();
				break;

			case 3:
		      addressbook.editContactInBook();
				break;
			case 4:
				addressbook.deleteAddressInBook();
				break;
			case 5:
				addressbook.deleteAddressBook();
			case 6:
				addressbook.printBook();
				break;
			case 7:
				addressbook.printContactsInBook();
			default:
			}

			System.out.println("Continue press 1");
			i = scanner.nextInt();
		} while (i == 1);

		

	}
}
