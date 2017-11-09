package Student;
import java.io.Serializable;
import java.util.Scanner;
public class Dues implements Serializable {
    int fine;
    String remark;
    public Dues(){
        fine = 0;
        remark = "";
    }

    public void setFine(int fine){
        this.fine = fine;
    }
    public int getFine(){
        return fine;
    }
    public void addDues(){
        System.out.println("Enter fine amount in rupees");
        Scanner s = new Scanner(System.in);
        fine = s.nextInt();
        System.out.println("Enter remarks");
        remark = s.next();
    }
    public  String toString(){
        return '\n' + "Fine:" + fine + "\nRemarks:" + remark;
    }
}
