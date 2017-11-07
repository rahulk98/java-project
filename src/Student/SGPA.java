package Student;

import java.io.Serializable;
import java.util.ArrayList;

public class SGPA implements Serializable {
    float sgpa;
    SGPA(){
        sgpa = 0;
    }
    public void setSGpa(ArrayList<Course> c){
        for(Course i:c){
            sgpa += i.gpa.getGpa();
        }
        sgpa =  sgpa/c.size();
    }

    public float getSgpa(){
        return sgpa;
    }
    public String toString(){
        return "\nSemester GPA:" + sgpa;
    }
    public void print(){
        System.out.println(toString());
    }
}