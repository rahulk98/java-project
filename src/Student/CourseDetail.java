package Student;
import java.util.Scanner;
public class CourseDetail {
    String degree;
    String course;
    String batch;
    String year;

    public CourseDetail(){
        degree = "";
        course = "";
        batch = "";
        year = "";
    }
    public CourseDetail(String degree, String course, String batch, String year){
        this.degree = degree;
        this.course = course;
        this.batch = batch;
        this.year = year;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setCourseDetail(String degree, String course, String batch, String year){

        this.degree = degree;
        this.course = course;
        this.batch = batch;
        this.year = year;
    }
    public void addCourseDetail(){
        System.out.println("Enter degree");
        Scanner s = new Scanner(System.in);
        degree = s.next();
        System.out.println("Enter course");
        course = s.next();
        System.out.println("Enter batch");
        batch = s.next();
        System.out.println("Enter current year");
        year = s.next();
    }
    public String getDegree(){
        return degree;
    }
    public String getCourse(){
        return course;
    }
    public String getBatch(){
        return batch;
    }
    public String getYear(){
        return year;
    }
    public String toString(){
        return "Degree:" + degree + "\nCourse:" + course + "\nBatch:" + batch + "\nCurrent year:" + year;
    }
    public void displayCourse(){
        CourseDetail c = new CourseDetail(this.degree, this.course, this.batch, this.year);
        System.out.println(this.toString());
    }
    public static void main(String[] args){
        CourseDetail c = new CourseDetail();
        c.addCourseDetail();
        c.displayCourse();
    }
}
