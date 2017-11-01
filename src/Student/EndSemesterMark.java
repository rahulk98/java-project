package Student;

public class EndSemesterMark implements Mark{
    int mark;
    public EndSemesterMark(){
        mark = 0;
    }
    public EndSemesterMark(int mark){
        this.mark = mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("Enter end semester marks");

    }
    public void printMark(){
        System.out.println("End Semester marks:" + mark);
    }

    public String toString(){
        return "End Semester marks:" + this.mark + '\n';
    }
}
