package Student;

import java.io.Serializable;
import java.util.ArrayList;

public class CGPA implements Serializable {
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
        public String toString(){
            return '\n' + "Cumulative GPA:" + cgpa;
        }
        public void print(){
            System.out.println(toString());
        }


}
