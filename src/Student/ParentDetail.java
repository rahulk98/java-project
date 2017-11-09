package Student;

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
	public void newParentDetail() {
		try {
			this.newPersonalDetail();
			System.out.println("Parent Details");
			System.out.println("Enter father's name");
			Scanner sc = new Scanner(System.in);
			this.fName = sc.nextLine();
			System.out.println("Enter mother's name");
			this.mName = sc.nextLine();
			System.out.println("Enter father's email");
			this.PEmail = sc.nextLine();
			String s = "@";
			if(!PEmail.contains(s)) throw new InvalidEmailException();
			System.out.println("Enter father's occupation");
			fOccupation = sc.nextLine();
			System.out.println("Enter parents phone number");
			pPhno = sc.nextLine();
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

}
