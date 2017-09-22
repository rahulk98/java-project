package Student;
import java.util.Scanner;
public class Dues {
    int fine;
    String remark;
    public Dues(){
        fine = 0;
        remark = "";
    }
    public Dues(int fine, String remark){
        this.fine = fine;
        this.remark = remark;
    }
    public void setFine(int fine){
        this.fine = fine;
    }
    public void setremark(String remark){
        this.remark = remark;
    }
    public int getFine(){
        return fine;
    }
    public String getremark(){
        return remark;
    }
    public void addDues(){
        System.out.println("Enter fine amount in rupees");
        Scanner s = new Scanner(System.in);
        fine = s.nextInt();
        System.out.println("Enter remarks");
        remark = s.next();
    }
    public  String toString(){
        return "Fine:" + fine + "\nRemarks:" + remark;
    }
}
