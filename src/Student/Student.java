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
	String roll_No;
	Date dob;
	String campus;
	
	public Student(){
		name = "";
		roll_No = "";
		Calendar cal = Calendar.getInstance();
	    cal.set(2016, 1, 1);
		dob = cal.getTime();
	}
	public Student(String name, String roll, Date dob, String campus) {
		this.name = name;
		this.roll_No = roll;
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
		return roll_No;
	}
	public String getCampus() {
		return campus;
	}
	public void newStudent() {
		System.out.println("Enter Name, rollno ,date of birth and campus");
		Scanner s = new Scanner(System.in);
		this.name = s.next();
		this.roll_No = s.next();
		System.out.println("Enter day , month , year");
		int day, month, year;
		day = s.nextInt();
		month = s.nextInt();
		year = s.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		this.dob = cal.getTime();
		this.campus = s.next();
	}
	public void readFile() {
		try {
			FileInputStream fin = new FileInputStream("Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			Student s = (Student) ois.readObject();
			this.name = s.getName();
			this.roll_No = s.getRollNo();
			this.dob = s.getDate();
			this.campus = s.getCampus();
			this.printDetails();
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
			FileOutputStream fout = new FileOutputStream("Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			Student s = new Student(this.name, this.roll_No, this.dob, this.campus);
			oos.writeObject(s);
			fout.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
	public void printDetails() {
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Name:" + name + "\n" + "Roll No:" + roll_No + "\n" + "dob:" + dateOnly.format(dob) + "\n" + "Campus:" + campus);
		
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.newStudent();
		s.writeFile();
		s.readFile();
	}
}
