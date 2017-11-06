package Student;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDiary {
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

        System.out.println("Enter no of courses");
        int c = s.nextInt();
        int i = 0;
        ac.addSem();

        while(i<c-1){
            ac.sems.get(ac.sems.size()).addCourse();
            i++;
        }
    }
    public void addFinancialDetails(){
        finance.addFinanceDetail();
    }
    public void print(){
        pd.printParentDetails();
        ac.print();
        finance.printFinacials();
        System.out.println(lib.toString());
        c.print();
        ev.print();
        h.print();
    }
}
