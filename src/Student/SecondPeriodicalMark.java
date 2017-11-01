package Student;

public class SecondPeriodicalMark implements Mark{
    int mark;
    public SecondPeriodicalMark(){
        mark = 0;
    }
    public SecondPeriodicalMark(int mark){
        this.mark = mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public void addMark(){
        System.out.println("Enter second periodical marks");

    }
    public void printMark(){
        System.out.println("Second periodical marks" + mark);
    }

    public String toString(){
        return "Second Periodical Mark:" + this.mark + '\n';
    }
}
