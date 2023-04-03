package com.bridgelapz.addressbook;

public class AddressBookMain {
	
      public static void main(String args[]) {
    	  
    	  System.out.println("Welcome To AddressBook Program");
    	  
    	  AddressBook addressbook = new AddressBook();
    	  Contacts contact=new Contacts();
    	  addressbook.addContact();
    	 // addressbook.displayContact();
    	  contact.toString();
    	  addressbook.contactEdit();
    	  addressbook.displayContact();
    	  
      }
}
