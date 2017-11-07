package Student;

import java.io.Serializable;
import java.util.Scanner;

public class BIOS implements Serializable, Club {
    Student s;
    boolean member;
    String team;
    String url;
    String field;
    BIOS(){
        member = false;
    }
    public void addDetail(){
        System.out.println("Enter team, project link and field");
        Scanner s = new Scanner(System.in);
        member = true;
        team = s.next();
        url = s.next();
        field = s.next();
    }
    public void addStudent(Student s){
        this.s = s;
    }
    public String toString(){
        return "Active member: " + member + "\nProject url: " + url + "\nField of Expertise: " + field + "\n";
    }
    public void print(){
        System.out.println(this.toString());
    }
}
