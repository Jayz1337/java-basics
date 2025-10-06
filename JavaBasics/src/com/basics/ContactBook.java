package com.testjava;
import java.util.ArrayList;
import java.util.Scanner;
public class ContactBook {

	public static void main(String[] args) {
		
		ArrayList<String> contact_names = new ArrayList<>();
		ArrayList<String> phone_nums = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		boolean KeepRunning = true;
		while (KeepRunning) {
			System.out.println("----- MENU -----");
			System.out.println("1.Add Contact\n2.Remove Contact\n3.Show Contacts\n4.Close Program");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Give me name of contact: ");
					String contactname = scanner.next();
					System.out.println("Give me number of contact: ");
					String phone_num = scanner.next();
					if (contact_names.contains(contactname)) {
						System.out.println("Contact already exists!");
						break;
					}
					contact_names.add(contactname);
					phone_nums.add(phone_num);
					break;
				case 2:
					String contact = scanner.next();
					if(contact_names.contains(contact)==false) {
						System.out.println("Contact not found!");
					} else {
						for(int i = 0 ; i < contact_names.size(); i++) {
							if (contact_names.get(i)==contact) {
								contact_names.remove(i);
								phone_nums.remove(i);
							}
						System.out.println(contact+" Was successfully removed!");
						}
					}
					break;
				case 3:
					if(contact_names.isEmpty()) {
						System.out.println("Contact book is empty");
					}else {
						for (int i = 0 ; i<contact_names.size(); i++) {
							System.out.println(i+1+"."+contact_names.get(i));
							System.out.println(" "+phone_nums.get(i));
						}
						
					}
					
					break;
				case 4:
					KeepRunning = false;
					break;
				default:
					System.out.println("Invalid choice!");
			}
			
			
			
		}
	}
	

}
