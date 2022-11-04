
package library.contact;

import java.util.Scanner;


class Contact {
	String name;
	String phone;
	String email;

	public boolean equals(Object x) {
		Contact c = (Contact)x;
		return ( (name.length()  != 0 && c.name.length()  != 0 && name.equals(c.name))   ||
				 (phone.length() != 0 && c.phone.length() != 0 && phone.equals(c.phone)) ||
				 (email.length() != 0 && c.email.length() != 0 && email.equals(c.email)) );
	}

	public String toString() {
		return "Name:" + name + " Phone:" + phone + " Email:" + email;
	}
}
