package Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ParentDetail  extends PersonalDetail  implements Serializable {
	String fName;
	String mName;
	String PEmail;
	String pPhno;
	String fOccupation;
	public ParentDetail() {
		super();
		fName = "";
		mName = "";
		PEmail = "";
		pPhno = "";
		String fOccupation = "";
	}
	public ParentDetail(String f, String m, String em, String phno, String fo) {
		super();
		this.fName = f;
		this.mName = m;
		this.PEmail = em;
		this.pPhno = phno;
		this.fOccupation = fo;
	}
	public void setParentDetail(String f, String m, String em, String phno, String fo) {
		this.fName = f;
		this.mName = m;
		this.PEmail = em;
		this.pPhno = phno;
		this.fOccupation = fo;
	}
	public String getFatherName() {
		return fName;
		
	}
	public String getMotherName() {
		return mName;
		
	}
	public String getParentEmail() {
		return PEmail;
		
	}
	public String getPhno() {
		return pPhno;
		
	}
	public String getOccupation() {
		return fOccupation;
		
	}
	public void newParentDetail() {
		try {
			this.newPersonalDetail();
			System.out.println("Parent Details");
			System.out.println("Enter father's name");
			Scanner sc = new Scanner(System.in);
			this.fName = sc.next();
			System.out.println("Enter mother's name");
			this.mName = sc.next();
			System.out.println("Enter father's email");
			this.PEmail = sc.next();
			String s = "@";
			if(!PEmail.contains(s)) throw new InvalidEmailException();
			System.out.println("Enter father's occupation");
			fOccupation = sc.next();
			System.out.println("Enter parents phone number");
			pPhno = sc.next();
			if(pPhno.length() != 10) throw new InvalidPhoneNumberException();
			 
	}catch(InvalidPhoneNumberException e) {
		System.out.println(e);
		System.exit(0);
			
	}catch(InvalidEmailException n) {
		System.out.println(n);
		System.exit(0);
	}
	}

	public void printParentDetails() {
		System.out.println("Parent Details");
		System.out.println("--------------");
		System.out.println("Father's Name:" + fName + "\n" +"Mother's Name:" + mName + "\n" + "Parent Email:" + PEmail + "\n" + "Parent Phone no:" + pPhno +"\n" + "Father's Occupation:" + fOccupation);
	}
	public void printAll(){
		this.printDetails();
		this.printPDetail();
		this.printParentDetails();


	}
	public static void main(String[] args){
		ParentDetail d = new ParentDetail();
		d.newParentDetail();
		d.printAll();
	}
}
