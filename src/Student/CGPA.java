package Student;

import java.util.ArrayList;

public class CGPA {
        float cgpa;
        CGPA(){
            cgpa= 0;
        }
        public void setGpa(ArrayList<Semester> s){
            for(Semester i:s) {
                cgpa += i.sgpa.getSgpa();
            }
            cgpa /= cgpa/s.size();
        }
        public float getGpa(){
            return cgpa;
        }
        public String toString(){
            return '\n' + "Cumulative GPA:" + cgpa;
        }
        public void print(){
            System.out.println(toString());
        }


}
