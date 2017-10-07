package Student;

import java.util.ArrayList;

public class CGPA {
        float cgpa;
        CGPA(){
            cgpa= 0;
        }
        public void setGpa(ArrayList<SGPA> s){
            for(SGPA i:s) {
                cgpa += i.getSgpa();
            }
            cgpa /= cgpa/s.size();
        }
        public float getGpa(){
            return cgpa;
        }
        public String toString(){
            return "\nCumulative GPA:" + cgpa;
        }
        public void print(){
            System.out.println(toString());
        }


}
