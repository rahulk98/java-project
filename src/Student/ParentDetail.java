package Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ParentDetail implements Serializable{
	String fName;
	String mName;
	String PEmail;
	String pPhno;
	String fOccupation;
	public ParentDetail() {
		fName = "";
		mName = "";
		PEmail = "";
		pPhno = "";
		String fOccupation = "";
	}
	public ParentDetail(String f, String m, String em, String phno, String fo) {
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
	public void readFile() {
		try {
			FileInputStream fin = new FileInputStream("ParentDetail.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			ParentDetail p = (ParentDetail) ois.readObject();
			this.setParentDetail(p.fName, p.mName, p.PEmail, p.pPhno, p.fOccupation);
			this.printParentDetails();
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
			FileOutputStream fout = new FileOutputStream("ParentDetail.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			ParentDetail p = new ParentDetail(this.fName, this.mName, this.PEmail, this.pPhno, this.fOccupation);
			oos.writeObject(p);
			fout.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		
		}
	}
	public void printParentDetails() {
		System.out.println("Father's Name:" + fName + "\n" +"Mother's Name:" + mName + "\n" + "Parent Email:" + PEmail + "\n" + "Parent Phone no:" + pPhno +"\n" + "Father's Occupation:" + fOccupation);
	}
	public static void main(String[] args){
		ParentDetail p = new ParentDetail();
		p.newParentDetail();
		p.writeFile();
		p.readFile();
	}
}
