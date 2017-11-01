package Student;

import java.util.ArrayList;

public class Academics extends CourseDetail{
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
        Semester s = new Semester(this.sems.size()+1);
        s.addCourse();
        this.sems.add(s);
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
    public static void main(String[] args){
        Academics a = new Academics();
        a.addCDetail();
        a.addSem();
        a.print();
    }
    public void calculateCGPA(){
        cgpa.setGpa(sems);
    }
}
