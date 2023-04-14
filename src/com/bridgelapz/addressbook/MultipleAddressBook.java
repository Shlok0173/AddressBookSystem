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
	  public void editContactInBook() {
		  System.out.println("Enter Name of AddresBook exist edit");
		  Scanner scanner=new Scanner(System.in);
		  String editBookName=scanner.nextLine();
		  if(addressBookMap.containsKey(editBookName)) {
		  addressBookMap.get(editBookName);
		  
		  }else {
			  System.out.println("AddressBook doesn't exist,please enter correct name");
			//  editContactInBook();
	  }
		  
	  }
	  public void deleteAddressBook() {
		  System.out.println("Enter Name of Address Book you want to delete");
		  Scanner scanner=new Scanner(System.in);
		  String bookName=scanner.next();
		  if(addressBookMap.containsKey(bookName)){
			  addressBookMap.remove(bookName);
		  }else {
			  System.out.println("AddressBook doesn't exist");
			  deleteAddressBook();
		  }
	  }
	  public void deleteAddressInBook() {
		  Scanner scanner=new Scanner(System.in);
		  String bookName=scanner.next();
		  if(addressBookMap.containsKey(bookName)) {
			  addressBookMap.get(bookName).contactDelete();
		  }else {
			  System.out.println("AddressBook doesn't exist,please enter correct name");
			  deleteAddressInBook();
		  }
	  }
	  public void printBook() {
		  System.out.println("These are AddressBooks in program");
		  for(Map.Entry<String ,AddressBook> entry :addressBookMap.entrySet()) {
		  System.out.println(entry.getKey()+"[]");
	  }
	  }
		  public void printContactsInBook() {
			  for(Map.Entry<String, AddressBook>entry:addressBookMap.entrySet()) {
			  System.out.println("The contact in the book of<"+entry.getKey());
			  System.out.println(entry.getValue().displayContact());
		  }
	 }
		//public void editContactInBook() {
			// TODO Auto-generated method stub
			
		//}
	
}

