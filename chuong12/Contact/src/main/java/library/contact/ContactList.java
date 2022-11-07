/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.contact;

import java.util.*;
public class ContactList {

	public static void main(String[] args) {

		LinkedList contacts = new LinkedList();
		LinkedListItr itr = contacts.zeroth();
		Scanner kb = new Scanner(System.in);
		String input,input2;
		String help = "Commands: 0 (0th), 1 (1th), a (add), c (current), f (find), n (next), l (last), p (print), q (quit), r (remove), s (size)";
		
		System.out.println(help);
		while (true) {
			System.out.print(">");
			input = kb.nextLine().trim();
			if (input.equals("q")) {
				System.out.println("Bye");
				break;
			}
			else if (input.equals("p")) {
				LinkedList.printList(contacts);
			}
			else if (input.equals("a")) {
				Contact contact = new Contact();
				System.out.print("Name: ");
				contact.name = kb.nextLine().trim();
				System.out.print("Phone: ");
				contact.phone = kb.nextLine().trim();
				System.out.print("Email: ");
				contact.email = kb.nextLine().trim();
				if (!(contact.name.length() == 0 && contact.phone.length() == 0 && contact.email.length() == 0))
					contacts.insert(contact, itr);
			}
			else if (input.equals("f")) {
				System.out.println("Enter any field");
				Contact contact = new Contact();
				System.out.print("Name: ");
				contact.name = kb.nextLine().trim();
				System.out.print("Phone: ");
				contact.phone = kb.nextLine().trim();
				System.out.print("Email: ");
				contact.email = kb.nextLine().trim();
				LinkedListItr itr2 = contacts.find(contact);
				if (itr2.isPastEnd()) System.out.println("Not found");
				else {
					itr = itr2;
					System.out.println(itr.retrieve());
				}
			}
			else if (input.equals("c")) {
				if (itr.isPastEnd()) System.out.println("End of list");
				else if (itr.retrieve() == null) System.out.println("Header node");
				else System.out.println(itr.retrieve());
			}
			else if (input.equals("s")) {
				System.out.println(contacts.size());
			}	
			else if (input.equals("0")) {
				itr = contacts.zeroth();
			}
			else if (input.equals("1")) {
				if(!contacts.isEmpty()) {
					itr = contacts.first();
				}
			}
			else if (input.equals("l")) {
				if(!contacts.isEmpty()) {
					itr = contacts.last();
				}				
			}	
			else if (input.equals("n")) {
				if(itr.current.next != null){
					itr.advance();
					System.out.println(itr.retrieve());					
				}
			}
			else if (input.equals("r")) {
				if(itr.retrieve() == null) {
					System.out.println("Nothing to remove.");
				}
				else {
					System.out.println("Removing " + itr.retrieve());
					System.out.println("Are you sure? (y/n)");
					input2 = kb.nextLine().trim();
					if(input2.equals("y")){
						contacts.remove(itr);
						if(itr.current.next != null){
							itr.advance();
						}
						else if(contacts.size() == 0){
							itr = contacts.zeroth();
						}
						else if(contacts.size() == 1){
							itr = contacts.first();
						}
					}
				}
			}						
			else {
				System.out.println("Unrecognized command");
				System.out.println(help);
			}
		}

		kb.close();
	}
	
}