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
		System.out.println("Enter Student data");
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

	public void printDetails() {
		System.out.println("Student Details");
		System.out.println("---------------");
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Name:" + name + "\n" + "Roll No:" + rollNo + "\n" + "dob:" + dateOnly.format(dob) + "\n" + "Campus:" + campus);

	}
	public Student getStudentObject(){
		Student s = new Student(this.rollNo, this.name, this.dob, this.campus);
		return s;
	}
	public void setStudentObject(Student s){
		this.rollNo = s.getRollNo();
		this.name = s.getName();
		this.campus = s.getCampus();
		this.dob = s.getDate();
	}
}
