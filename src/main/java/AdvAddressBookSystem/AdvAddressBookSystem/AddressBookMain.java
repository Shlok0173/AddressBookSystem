package AdvAddressBookSystem.AdvAddressBookSystem;

import java.util.Scanner;



public class AddressBookMain {

	AddressBook addressbook=new AddressBook();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String args[])  {
		AddressBook addressbook=new AddressBook();
		
		addressbook.writeToFile("address_book.txt");
		addressbook.readToFile("address_book.txt");
		
		//csv Write
		String csvFileToWrite="https://github.com/Shlok0173/AddressBookSystem.git//AddressBookCsv.txt";
		
		String dataWrite[][]= {
				{"Shlok","Kumar","Mishra","Ajit","Kumar","Mishra"},
				{"Abhinav","Kumar","Mishra",}
		};
		AddressBook.write(csvFileToWrite, dataWrite);

		AddressBook.read(csvFileToWrite);
		 
		System.out.println("Welcome To AddressBook Program");
		Scanner scanner = new Scanner(System.in);
		
		Contacts contact = new Contacts();
		int i = 0;
		do {
			System.out.println("Enter Your Choice");
			System.out.println("1 : Add Contacts");
		    System.out.println("2 : Edit Contact");
			System.out.println("3 : ContactDelete");
			System.out.println("4: displayContact");
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
				addressbook.contactDelete();
				break;
			case 4:
				addressbook.displayContact();
				
			default:
			}

			System.out.println("Continue press 1");
			i = scanner.nextInt();
		} while (i == 1);	
	
	}
}