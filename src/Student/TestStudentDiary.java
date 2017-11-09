package Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudentDiary {
    public static void writeFile(ArrayList<StudentDiary> sd){
        try{
            FileOutputStream f = new FileOutputStream("StudentDiary.ser");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(sd);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static ArrayList<StudentDiary> readfile(){
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
            System.out.println("3.View details");
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
                    sd.add(s);
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
                    while(ch3!=8){
                        System.out.println("1.Add academic details");
                        System.out.println("2.Add financial details");
                        System.out.println("3.Add Event");
                        System.out.println("4.Add library details");
                        System.out.println("5.Add attendance");
                        System.out.println("6.Add hostel details");
                        System.out.println("7.Print details");
                        System.out.println("8.Go back to menu");
                        ch3 = sc.nextInt();
                        switch(ch3){
                            case 1:int ch4 = -1;
                                    System.out.println("Enter semester no");
                                    int semNo = sc.nextInt();
                                    semNo--;
                                    System.out.println("Enter course name");
                                    String cn = sc.next();
                                    int courseIndex=0;
                                    for(Course i : modStud.ac.sems.get(semNo).courses){
                                        if(i.courseName.equals(cn))
                                            break;
                                        courseIndex++;
                                    }
                                while(ch4!=6){
                                    System.out.println("1.Add First Periodical Marks");
                                    System.out.println("2.Add Second periodical marks");
                                    System.out.println("3.Add Continuous assessment mark");
                                    System.out.println("4.Add End Sem Mark");
                                    System.out.println("5.Add supply");
                                    System.out.println("6.Go back to menu");
                                    ch4 = sc.nextInt();
                                    switch(ch4){
                                        case 1:modStud.ac.sems.get(semNo).courses.get(courseIndex).fpm.addMark();
                                                break;
                                        case 2:modStud.ac.sems.get(semNo).courses.get(courseIndex).spm.addMark();
                                                break;
                                        case 3:modStud.ac.sems.get(semNo).courses.get(courseIndex).cam.addMark();
                                            modStud.ac.sems.get(semNo).courses.get(courseIndex).CalculateInternal();
                                            break;
                                        case 4: modStud.ac.sems.get(semNo).courses.get(courseIndex).endsem.addMark();
                                            modStud.ac.sems.get(semNo).courses.get(courseIndex).CalculateGPA();
                                            modStud.ac.sems.get(semNo).calculateSGPA();
                                            modStud.ac.calculateCGPA();
                                            break;
                                        case 5:modStud.ac.sems.get(semNo).courses.get(courseIndex).addSupply();
                                            break;
                                        case 6:break;
                                    }

                                }
                                break;
                            case 2:int ch5 = -1;
                                    while(ch5 != 6){
                                        System.out.println("1.Add Fees");
                                        System.out.println("2.Add Department dues");
                                        System.out.println("3.Add Scholarship");
                                        System.out.println("4.Print Financials");
                                        System.out.println("5.Print Scholarship details");
                                        System.out.println("6.Go back to menu");
                                        ch5 = sc.nextInt();
                                        switch(ch5){
                                            case 1:modStud.finance.addFinanceDetail();
                                            break;
                                            case 2:modStud.finance.department.addDues();
                                            break;
                                            case 3:modStud.scholarship.addPercentage();
                                            break;
                                            case 4:modStud.finance.printFinancials();
                                            break;
                                            case 5:modStud.scholarship.print();
                                            System.out.println("Effective fees after scholarship:" + modStud.finance.calculateScholarship(modStud.scholarship));
                                            break;
                                            case 6:break;
                                        }
                                    }
                                    break;
                            case 3: modStud.ev.addEvent();
                            break;
                            case 4:int ch7 = -1;
                                    while(ch7 != 5){
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("1.Borrowed book details");
                                        System.out.println("2.Extend due date");
                                        System.out.println("3.Add dues");
                                        System.out.println("4.View dues");
                                        System.out.println("5.Go back to menu");
                                        ch7 = sc.nextInt();
                                        switch(ch7){
                                            case 1:System.out.println(modStud.lib.toString());
                                            break;
                                            case 2:modStud.lib.extendDueDate();
                                            break;
                                            case 3:modStud.lib.addFine();
                                            break;
                                            case 4:System.out.println(modStud.lib.getDue());
                                            break;
                                            case 5:break;
                                        }

                                    }
                                    break;
                            case 5:int ch8 = -1;
                                    while(ch8 != 3){
                                        System.out.println();
                                        System.out.println("1.Add attendance");
                                        System.out.println("2.View attendance");
                                        System.out.println("3.Go back to menu");
                                        ch8 = sc.nextInt();
                                        switch(ch8){
                                            case 1:Attendance a = new Attendance();
                                            a.addAttendance();
                                            modStud.att.add(a);
                                            break;
                                            case 2:for(Attendance i:modStud.att){
                                                i.print();
                                            }
                                            break;
                                            case 3:break;
                                        }
                                    }break;
                            case 6:modStud.h.addRecords();
                            break;
                            case 7:modStud.print();
                            break;
                            case 8:break;

                        }
                    }break;
                case 3:int ch9 = -1;
                    System.out.println("Enter roll no of student whose details should be printed");
                    roll = sc.next();
                    modStud = new StudentDiary();

                    for(StudentDiary i:sd){
                        if(i.pd.getRollNo().equals(roll)) {
                            modStud = i;
                            break;
                        }
                    }
                        while(ch9!=7){
                            System.out.println("1.Print student details");
                            System.out.println("2.Print academic details");
                            System.out.println("3.Print financial details");
                            System.out.println("4.Print attendance");
                            System.out.println("5.Print semester details");
                            System.out.println("6.Print all details");
                            System.out.println("7.Go back to menu");
                            ch9 = sc.nextInt();
                            switch(ch9){
                                case 1:modStud.pd.printAll();
                                break;
                                case 2:modStud.ac.print();
                                break;
                                case 3:modStud.finance.printFinancials();
                                break;
                                case 4:for(Attendance i : modStud.att)
                                            i.print();
                                break;
                                case 5:for(Semester i : modStud.ac.sems)
                                        i.print();
                                break;
                                case 6:modStud.print();
                                break;
                                case 7:break;
                            }

                        }
                        break;
                case 4: writeFile(sd);
                break;
                case 5: sd = readfile();
                break;
                case 6:
                    break;
            }
        }
    }
}
