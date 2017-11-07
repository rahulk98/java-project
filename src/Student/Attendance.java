package Student;

import java.io.Serializable;
import java.util.Scanner;

public class Attendance implements Serializable {
    String date;
    boolean att;
    public Attendance(){
        date = "";
        att = false;
    }
    public void addAttendance(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter date");
        this.date = s.next();
        this.att = true;
    }
    public String toString(){
        return " " + date + "\t" + att + "\n";
    }
    public void print(){
        System.out.println(this.toString());
    }
}
