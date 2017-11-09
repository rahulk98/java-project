package Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class PersonalDetail extends Student implements Serializable{
	long phno;
	String address;
	String email;
	public PersonalDetail() {
		super();
		phno = 0;
		address = "";
		email = "";
	}

	
	public void newPersonalDetail() {
	try {	
			this.newStudent();
			System.out.println("Enter student personal details");
			System.out.println("Enter address");
			Scanner sc = new Scanner(System.in);
			address = sc.nextLine();
			System.out.println("Enter email");
			email = sc.next();
			String s = "@";
			if(!email.contains(s)) throw new InvalidEmailException();
			System.out.println("Enter phone number of Student");
			phno = sc.nextLong();
			int length=0; 
			long n = phno;
			while(n != 0) {
				n = n/10;
				length++;
			}
			if(length != 10) throw new InvalidPhoneNumberException();
			
	}catch(InvalidPhoneNumberException e) {
		System.out.println(e);
		System.exit(0);
			
	}catch(InvalidEmailException n) {
		System.out.println(n);
		System.exit(0);
	}
	}

	public void printPDetail() {
		System.out.println("Personal Details");
		System.out.println("----------------");
		System.out.println("Phone no:"+ this.phno +"\n" + "Address:"+ this.address + "\n" + "Email:" + this.email);
		
	}


}
