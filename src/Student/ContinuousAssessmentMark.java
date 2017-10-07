package Student;

import java.util.Scanner;

public class ContinuousAssessmentMark{
    int mark;
    public ContinuousAssessmentMark(){
        mark = 0;
    }
    public ContinuousAssessmentMark(int mark){
        this.mark = mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("Enter continuous assessment marks");
        Scanner s = new Scanner(System.in);
        this.mark = s.nextInt();
    }
    public void printMark(){
        System.out.println("Continuous assessment marks:" + mark);
    }
}
