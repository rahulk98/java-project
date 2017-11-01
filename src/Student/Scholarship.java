package Student;

import java.util.Scanner;

public class Scholarship {
    int percent;

    public Scholarship(){
        percent = 0;
    }
    public void addPercentage(){
        System.out.println("Enter percentage");
        Scanner s = new Scanner(System.in);
        percent = s.nextInt();
    }
    public void upgradeSchoalarship(int percent){
        this.percent = percent;
    }
    public void print(){
        System.out.println("Scholarship percent: " + percent);
    }
}
