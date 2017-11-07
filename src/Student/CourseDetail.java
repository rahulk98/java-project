package Student;
import java.io.Serializable;
import java.util.Scanner;
public class CourseDetail implements Serializable {
    String degree;
    String branch;
    String batch;
    String year;

    public CourseDetail(){
        degree = "";
        branch = "";
        batch = "";
        year = "";
    }
    public CourseDetail(String degree, String course, String batch, String year){
        this.degree = degree;
        this.branch = course;
        this.batch = batch;
        this.year = year;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setCourseDetail(String degree, String course, String batch, String year){

        this.degree = degree;
        this.branch = course;
        this.batch = batch;
        this.year = year;
    }
    public void addCourseDetail(){
        System.out.println("Enter degree");
        Scanner s = new Scanner(System.in);
        degree = s.next();
        System.out.println("Enter branch");
        branch = s.next();
        System.out.println("Enter batch");
        batch = s.next();
        System.out.println("Enter current year");
        year = s.next();
    }
    public String getDegree(){
        return degree;
    }
    public String getBranch(){
        return branch;
    }
    public String getBatch(){
        return batch;
    }
    public String getYear(){
        return year;
    }
    public void displayCourse(){
        System.out.println("Degree:" + degree + "\nBranch:" + branch + "\nBatch:" + batch + "\nCurrent year:" + year);
    }

}
