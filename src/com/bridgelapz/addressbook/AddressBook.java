package com.bridgelapz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends Contacts {

	static ArrayList<Contacts> contact = new ArrayList<Contacts>();
	static Scanner sc = new Scanner(System.in);
	// Contacts contacts = new Contacts();

	public void addContact() {
		Contacts contacts = new Contacts();

		System.out.println("Enter The FirstName");
		String firstName = sc.nextLine();
		contacts.setFirstNames(firstName);

		System.out.println("Enter the LastName");
		String lastName = sc.nextLine();
		contacts.setLastNames(lastName);

		System.out.println("Enter The Address");
		String address = sc.nextLine();
		contacts.setAddress(address);

		System.out.println("Enter The City");
		String city = sc.nextLine();
		contacts.setCity(city);

		System.out.println("Enter The State ");
		String state = sc.nextLine();
		contacts.setState(state);

		System.out.println("Enter The Zip");
		long zip = sc.nextLong();
		contacts.setZip(zip);

		System.out.println("Enter The Phone");
		long phone = sc.nextLong();
		contacts.setPhone(phone);

		System.out.println("Enter The Email");
		String email = sc.nextLine();
		contacts.setEmail(email);

		contact.add(contacts);

	}

	public void displayContact() {
		if (contact.isEmpty()) {
			System.out.println("AddressBook Contact is empty");
		}
		System.out.println("AddresBook");

		for (Contacts contact : contact) {
			System.out.println(contact.getFirstNames());
			System.out.println(contact.getLastNames());
			System.out.println(contact.getAddress());
			System.out.println(contact.getState());
			System.out.println(contact.getZip());
			System.out.println(contact.getPhone());
			System.out.println(contact.getEmail());
		}
	}

	public void contactEdit() {
         
		System.out.println("Enter first name for confirmation : ");
		String firstName = sc.nextLine();
		for (int i = 0; i < contact.size(); i++) {
			if (contact.get(i).getFirstNames().equalsIgnoreCase(firstName)) {
				contact.remove(i);
				addContact();
				System.out.println(contact);
			} else {
				System.out.println("No data found in Address Book");
			}
		}
	}
	
	
	  public void contactDelete() {
		  System.out.println("Enter first name for delete");
		  String firstName=sc.nextLine();
		  for(int i=0;i<contact.size();i++) {
			  if(contact.get(i).getFirstNames().equals(firstName)) {
				  contact.remove(i);
				  System.out.println(contact);
			  }else {
				  System.out.println("No data found in Address Book");
			  }
		  }
	  }
}
