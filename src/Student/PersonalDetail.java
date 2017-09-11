package Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class PersonalDetail implements Serializable{
	long phno;
	String address;
	String email;
	public PersonalDetail() {
		phno = 0;
		address = "";
		email = "";
	}
	public PersonalDetail(long phno, String add, String email) {
		this.address = add;
		this.phno = phno;
		this.email = email;
	}
	public long getPhoneNo() {
		return phno;
	}
	public String getAdd() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public void setPersonalDetails(long phno, String address, String email) {
		this.phno = phno;
		this.email = email;
		this.address = address;
	}
	
	public void newPersonalDetail() {
	try {	
			System.out.println("Enter address, email, phone no");
			Scanner sc = new Scanner(System.in);
			address = sc.next();
			email = sc.next();
			String s = "@";
			if(!email.contains(s)) throw new InvalidEmailException();
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
	public void readFile() {
		try {
			FileInputStream fin = new FileInputStream("PersonalDetail.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			PersonalDetail p = (PersonalDetail) ois.readObject();
			this.setPersonalDetails(p.phno, p.address, p.email);
			this.printPDetail();
			fin.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		}catch (ClassNotFoundException cnf) {
			System.out.println(cnf);
		
		}
	}
	public void writeFile() {
		try {
			FileOutputStream fout = new FileOutputStream("PersonalDetail.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			PersonalDetail p = new PersonalDetail(this.phno, this.address, this.email);
			oos.writeObject(p);
			fout.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		
		}
	}
	public void printPDetail() {
		System.out.println("Phone no:"+ this.phno +"\n" + " Address:"+this.address + "\n" + "Email:" + this.email);
		
	}
}
