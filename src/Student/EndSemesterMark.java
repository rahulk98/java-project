package Student;

import java.io.Serializable;
import java.util.Scanner;

public class EndSemesterMark implements Mark, Serializable{
    int mark;
    public EndSemesterMark(){
        mark = 0;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("Enter end semester marks");
        Scanner s = new Scanner(System.in);
        this.mark = s.nextInt();

    }
    public void printMark(){
        System.out.println("End Semester marks:" + mark);
    }

    public String toString(){
        return "End Semester marks:" + this.mark + '\n';
    }
}
