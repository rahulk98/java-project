package Student;

import java.io.Serializable;
import java.util.Scanner;

public class SecondPeriodicalMark implements Mark, Serializable{
    int mark;
    public SecondPeriodicalMark(){
        mark = 0;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("Enter second periodical marks");
        Scanner s = new Scanner(System.in);
        this.mark = s.nextInt();
    }
    public void printMark(){
        System.out.println("Second periodical marks" + mark);
    }

    public String toString(){
        return "Second Periodical Mark:" + this.mark + '\n';
    }
}
