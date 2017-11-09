package Student;

import java.io.Serializable;
import java.util.Scanner;

public class Scholarship implements Serializable {
    int percent;

    public Scholarship(){
        percent = 0;
    }
    public void addPercentage(){
        System.out.println("Enter percentage");
        Scanner s = new Scanner(System.in);
        percent = s.nextInt();
    }

    public void print(){
        System.out.println("Scholarship percent: " + percent);
    }
}
