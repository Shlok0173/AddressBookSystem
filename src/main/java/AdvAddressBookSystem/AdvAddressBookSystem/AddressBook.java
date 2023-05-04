package AdvAddressBookSystem.AdvAddressBookSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class AddressBook extends Contacts{


		static ArrayList<Contacts> contact = new ArrayList<Contacts>();
	    Scanner sc = new Scanner(System.in);
	        
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
		 public void searchByName(String name) {
	     	List<Contacts>collect=contact.stream().filter(p->p.getFirstNames().equalsIgnoreCase(name)).collect(Collectors.toList());
	     	for(Contacts contact:collect) {
	     		System.out.println(collect);
	     	}
	     }
	     
	     public void searchByCity(String city) {
	     	List<Contacts>collect=contact.stream().filter(p->p.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
	     	for(Contacts contact:collect) {
	     		System.out.println(contact);
	     	}
	     }
	     
	        public void searchByState(String state) {
	     	   List<Contacts>collect=contact.stream().filter(p->p.getState().equalsIgnoreCase(state)).collect(Collectors.toList());
	     	   for(Contacts contact:collect) {
	     		   System.out.println(contact);
	     	   }
	        }
	        
	        public void countContactsByUsingCity(String cityName) {
	        	long count=0;
	        	long count1=contact.stream().filter(p->p.getCity().equalsIgnoreCase(cityName)).count();
	        	for(Contacts contact:contact) {
	        	count1=count1+count;
	        	}
	        	System.out.println("Contacts List"+count1);
	        }
	        
	        // sort Method Sorting the details
	        
	        public void sortByName() {
	        	List<Contacts> list=contact.stream().collect(Collectors.toList());
	        	list.stream().sorted((g1,g2)->((String)g1.getFirstNames()).compareTo(g2.getFirstNames()))
	        	        	.forEach(contact->{System.out.println(contact.getFirstNames()+" "+contact.getFirstNames());});
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
		  
		  public void viewByOptions() {
			  Scanner scanner=new Scanner(System.in);
			  while(true) {
				  System.out.println("Enter \n 1.By name\n 2.By city\n 3.By state\n 4.for previous menu");
				  int choice=sc.nextInt();
				  switch(choice) {
				  case 1:
					  System.out.println("Enter the name");
					  String name=sc.nextLine();
					  searchByName(name);
					  break;
					  
				  case 2:
					  System.out.println("Enter the city");
					  String city=sc.nextLine();
					  searchByCity(city);
					  break;
					  
				  case 3:
					  System.out.println("Enter the state");
					  String state=sc.nextLine();
					  searchByState(state);
					  break;
				  }
			  }
		  }
		  
		  // Writer File
		  public void writeToFile(String filename)  {
			  try(PrintWriter writer=new PrintWriter(new FileWriter(filename))){
				  for(Contacts person:contact) {
					  writer.println(person.getFirstNames()+"\n"+person.getLastNames()+"\n"+person.getAddress()+"\n"+person.getCity()+"\n"+person.getState()
					  +"\n"+person.getState()+"\n"+person.getZip()+"\n"+person.getPhone()+"\n"+person.getEmail());
				  }  
		  }
			  
		  catch(IOException e) {
			  e.getMessage();
		  }
		  }
		  
		  // Reader File
		  
		  public void readToFile(String filename) {
			  try(BufferedReader br=new BufferedReader(new FileReader(filename))){
				  String line;
				  while( (line=br.readLine())!=null) {
					  String[] tokens=line.split(",");
					  String firstName=tokens[0];
					  String lastName=tokens[1];
					  String address=tokens[2];
					  String city=tokens[3];
					  String state=tokens[4];
					  int zip=Integer.parseInt(tokens[5]);
					  long phone= Long.parseLong(tokens[6]);
					  String email=tokens[7];
					  Contacts person=new Contacts();
					  addContact();
				  }
			  }
			  catch(IOException e) {
				  e.getMessage();
			  }
		  }
		  
		  public static final String delimiter=",";
		  
		  public static void write(String csvFile ,String [][]data) {
			  try {
			  File f=new File(csvFile);
			  FileWriter fw=new FileWriter(f);
			  BufferedWriter bw=new BufferedWriter(fw);
			  for(String []row:data) {
				  StringBuilder sb = new StringBuilder();
				  for(String cell :row) {
					  sb.append(cell);
					  sb.append(delimiter);
				  }
				  sb.setLength(sb.length()-1);
				  bw.write(sb.toString());
				  bw.newLine();
				  bw.flush();
			  }
			  bw.close();
			  
		  }catch(IOException e) {
			  e.printStackTrace();
		  }
}
		  
		  public static void read(String csvFile) {
			  try {
				  File f = new File(csvFile);
				  FileReader fr=new FileReader(f);
				  BufferedReader br=new BufferedReader(fr);
				  String line;
				  String [] tempArr;
				  while((line=br.readLine())!=null) {
					  tempArr=line.split(delimiter);
					  for(String str:tempArr) {
						  System.out.println(str);
					  }
					  br.close();
				  }
			  }catch(IOException e) {
				  e.printStackTrace();
			  }
		  }
}
