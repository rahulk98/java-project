package Student;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDiary implements Serializable {
    ParentDetail pd;
    Academics ac;
    ArrayList<Attendance> att;
    Finance finance;
    Library lib;
    Club c;
    Scholarship scholarship;
    Event ev;
    Hostel h;
    public StudentDiary(){
        pd = new ParentDetail();
        ac = new Academics();
        att = new ArrayList<Attendance>();
        finance = new Finance();
        lib = new Library();
        scholarship = new Scholarship();
        ev = new Event();
        h = new Hostel();
    }
    public void addStudentDetails(){
        pd.newParentDetail();
    }
    public void addAcademics(){
        ac.addCDetail();
        Scanner s = new Scanner(System.in);


        ac.addSem();


    }
    public void addFinancialDetails(){
        finance.addFinanceDetail();
    }
    public void print(){
        pd.printAll();
        ac.print();
        finance.printFinancials();
        System.out.println(lib.toString());
        c.print();
        ev.print();
        h.print();
    }
}
