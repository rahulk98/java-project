package Student;
import java.util.Date;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Student implements Serializable{
	String name;
	String rollNo;
	Date dob;
	String campus;
	
	public Student(){
		name = "";
		rollNo = "";
		Calendar cal = Calendar.getInstance();
	    cal.set(2016, 1, 1);
		dob = cal.getTime();
	}
	public Student(String name, String roll, Date dob, String campus) {
		this.name = name;
		this.rollNo = roll;
		this.dob = dob;
		this.campus = campus;
	}
	public String getName() {
		return name;
	}
	public Date getDate() {
		return dob;
	}
	public String getRollNo() {
		return rollNo;
	}
	public String getCampus() {
		return campus;
	}
	public void newStudent() {
		System.out.println("Enter Name");
		Scanner s = new Scanner(System.in);
		this.name = s.next();
		System.out.println("Enter roll no");
		this.rollNo = s.next();
		System.out.println("Enter date of birth in day , month , year format");
		int day, month, year;
		day = s.nextInt();
		month = s.nextInt();
		year = s.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		this.dob = cal.getTime();
		System.out.println("Enter campus");
		this.campus = s.next();
	}
	public static Student readFile() {
		try {
			FileInputStream f = new FileInputStream("Student.ser");
			ObjectInputStream o = new ObjectInputStream(f);
			Student st = (Student)o.readObject();
			Student s = new Student(st.getName(), st.getRollNo(), st.getDate(), st.getCampus());
			return s;
		}
		
		catch(FileNotFoundException fof) {
			System.out.println("File not found!");
		}
		
		catch(IOException ioe) {
			System.out.println("File may be corrupt!");
		}
		
		catch(ClassNotFoundException cnf) {
			System.out.println("Class not found!");
		}
		return null;
	}
	public static void writeFile(Student st) {
		try {
			FileOutputStream f = new FileOutputStream("Student.ser", true);
			ObjectOutputStream o = new ObjectOutputStream(f);
			Student s = new Student(st.name,st.rollNo,st.dob,st.campus);
			o.writeObject(s);
		}
		
		catch(FileNotFoundException fof) {
			System.out.println("File not found!");
		}
		
		catch(IOException ioe) {
			System.out.println("File may be corrupt!");
		}	
	}
	public void printDetails() {
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Name:" + name + "\n" + "Roll No:" + rollNo + "\n" + "dob:" + dateOnly.format(dob) + "\n" + "Campus:" + campus);

	}

	
}
