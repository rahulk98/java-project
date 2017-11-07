package Student;

import java.io.Serializable;

public class GPA implements Serializable {
    float gpa;
    GPA(){
        gpa = 0;
    }
    public void setGpa(InternalMark im, EndSemesterMark esm){
        gpa = (im.getMark() + esm.getMark()/2)/10;
    }
    public float getGpa(){
        return gpa;
    }
    public String toString(){
        return "\nGPA:" + gpa;
    }
    public void print(){
        System.out.println(toString());
    }

    }

