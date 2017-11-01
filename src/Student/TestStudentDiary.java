package Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudentDiary {
    public void writefile(ArrayList<StudentDiary> sd){
        try{
            FileOutputStream f = new FileOutputStream("StudentDiary.ser");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(sd);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public ArrayList<StudentDiary> readfile(){
        ArrayList<StudentDiary> sd = new ArrayList<StudentDiary>();
        try{
            FileInputStream f = new FileInputStream("StudentDiary.ser");
            ObjectInputStream ois = new ObjectInputStream(f);
            ArrayList<StudentDiary> s = (ArrayList<StudentDiary>) ois.readObject();
            for(StudentDiary i:s)
                sd.add(i);
        }catch(Exception e){
            e.printStackTrace();
        }
    return sd;
    }
    public static void main(String[] args){
        ArrayList<StudentDiary> sd = new ArrayList<StudentDiary>();
        Scanner sc = new Scanner(System.in);
        int ch1 = -1;
        while(ch1!=6){
            System.out.println("Student Diary Menu");
            System.out.println("------------------");
            System.out.println("1.Add new student");
            System.out.println("2.Select existing student");
            System.out.println("3.Print");
            System.out.println("4.Write to file");
            System.out.println("5.Read from file");
            System.out.println("6.Exit");
            ch1 = sc.nextInt();
            switch(ch1){
                case 1: StudentDiary s = new StudentDiary();
                        int ch2 = -1;
                        while(ch2!=4) {
                            System.out.println("Add data");
                            System.out.println("--------");
                            System.out.println("1.Add student details");
                            System.out.println("2.Add academic details");
                            System.out.println("3.Add financial details");
                            System.out.println("4.return to main menu");
                            ch2 = sc.nextInt();
                            switch(ch2){
                                case 1:s.addStudentDetails();
                                    break;
                                case 2:s.addAcademics();
                                break;
                                case 3:s.addFinancialDetails();
                                break;
                            }
                        }
                        break;
                case 2:System.out.println("Enter roll no of student whose record should be modified");
                       String roll = sc.next();
                       StudentDiary modStud = new StudentDiary();
                       for(StudentDiary i:sd){
                           if(i.pd.getRollNo().equals(roll)) {
                               modStud = i;
                               break;
                           }
                       }
                       int ch3 = -1;
                    while(ch3!=7){
                        System.out.println("1.Add academic details");
                        System.out.println("2.Add financial details");
                        System.out.println("3.Add Event");
                        System.out.println("4.Add library details");
                        System.out.println("5.Add attendance");
                        System.out.println("6.Print details");
                        System.out.println("7.Exit");
                        ch3 = sc.nextInt();
                        switch(ch3){
                            case 1:int ch4 = -1;
                                    System.out.println("Enter semester no");
                                    int semNo = sc.nextInt();
                                    System.out.println("Enter course name");
                                    String cn = sc.next();
                                    int courseIndex=0;
                                    for(Course i : modStud.ac.sems.get(semNo-1).courses){
                                        if(i.courseName.equals(cn))
                                            break;
                                        courseIndex++;
                                    }
                                while(ch4!=10){
                                    System.out.println("1.Add First Periodical Marks");
                                    System.out.println("2.Add Second periodical marks");
                                    System.out.println("3.Add Continuous assessment mark");
                                    System.out.println("4.Add End Sem Mark");
                                    System.out.println("5.Calculate Internals");
                                    System.out.println("6.Display SGPA");
                                    System.out.println("7.print course details");
                                    System.out.println("8.Print semester details");
                                    System.out.println("9.Print degree details");
                                    System.out.println("10.Go back to menu");

                                }
                        }
                    }
            }
        }
    }
}
