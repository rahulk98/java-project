package Student;

import java.io.Serializable;
import java.util.Scanner;

public class FirstPeriodicalMark implements Mark, Serializable{
    int mark;
    public FirstPeriodicalMark(){
        mark = 0;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("Enter first periodical marks");
        Scanner s = new Scanner(System.in);
        this.mark = s.nextInt();

    }
    public void printMark(){
        System.out.println("First periodical marks" + mark);
    }
    public String toString(){
        return "First Periodical Mark:" + this.mark + '\n';
    }
}
