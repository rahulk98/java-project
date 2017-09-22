package Student;

public class InternalAssessmentMark {
    int mark;
    public InternalAssessmentMark(){
        mark = 0;
    }
    public InternalAssessmentMark(int mark){
        this.mark = mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("Enter internal assessment marks");

    }
    public void printMark(){
        System.out.println("internal assessment marks" + mark);
    }
}
