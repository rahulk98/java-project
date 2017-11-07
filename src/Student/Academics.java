package Student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Academics extends CourseDetail implements Serializable {
    ArrayList<Semester> sems;
    CGPA cgpa;
    public Academics(){
        super();
        sems = new ArrayList<Semester>();
        cgpa = new CGPA();
    }
    public void addCDetail(){
        this.addCourseDetail();
    }
    public void addSem(){
        Scanner sc = new Scanner(System.in);
        Semester s = new Semester(this.sems.size()+1);

        System.out.println("Enter no of courses");
        int c = sc.nextInt();
        int i = 0;
        while(i<c){
            s.addCourse();
            i++;
        }this.sems.add(s);
    }

    @Override
    public String toString() {
        String st = "";
        for(Semester s:sems)
            st += s.toString();
        return st;
    }
    public void print(){
        System.out.println("Academic Details");
        System.out.println("----------------");
        this.displayCourse();
        System.out.println(this.toString());
        System.out.println(cgpa.toString());
    }

    public void calculateCGPA(){
        cgpa.setGpa(sems);
    }

}
