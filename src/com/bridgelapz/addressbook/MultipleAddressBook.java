package com.bridgelapz.addressbook;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class MultipleAddressBook {

	 Map<String,AddressBook>addressBookMap=new HashMap<String,AddressBook>();
	 
	 public void addAddressbook() {
		 System.out.println("Enter the Name of new AddressBook");
		 Scanner scanner=new Scanner(System.in);
		 String bookName=scanner.next();
		 if(addressBookMap.containsKey(bookName)) {
			 System.out.println("Address Book With this new exists,Enter New name");
			 addAddressbook();
		 }else {
			 AddressBook addressbook=new AddressBook();
			 addressBookMap.put(bookName, addressbook);
			 System.out.println("press 1 if you want to add another book or press any key to exist");
			 int newBook=scanner.nextInt();
			 if(newBook==1) {
				 addAddressbook();
			 }
		 }
		
			 }
	  public void addContact() {
		  System.out.println("Enter the name of Address book to add the contact");
		  Scanner scanner=new Scanner(System.in);
		  String newContact=scanner.nextLine();
		  AddressBook addressbook =addressBookMap.get(newContact);
		  if(addressbook==null) {
			  System.out.println("No book found");
		  }else {
			  addressBookMap.get(addressbook).addContact();
		  }
	  }
	 }

