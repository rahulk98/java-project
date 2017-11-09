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

    public void displayCourse(){
        System.out.println("Degree:" + degree + "\nBranch:" + branch + "\nBatch:" + batch + "\nCurrent year:" + year);
    }

}
