package Student;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Library {
    Dues due;
    Date issue, dueDate;
    int issueNo=0;
    BookClass book;
    public Library(){
        due = new Dues();
        book = new BookClass();
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        issue = cal.getTime();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        dueDate = cal.getTime();
    }
    public Dues getDue(){
        return due;
    }
    public Library(Dues due, BookClass book){
        this.due = due;
        this.book = book;
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        issue = cal.getTime();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        dueDate = cal.getTime();
    }
    public void extendDueDate(){
    if(issueNo>=2){
        System.out.println("Cannot extend any longer.Please return immediately to avoid fine");
    }
    else{
        issueNo++;
        Calendar cal = Calendar.getInstance();
        cal.setTime(dueDate);
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
        dueDate = cal.getTime();
    }
    }
    public String toString(){
        SimpleDateFormat dateOnly = new SimpleDateFormat("dd/MM/yyyy");
        return book.toString() + "\nIssue date" + dateOnly.format(issue) + "\nDue date:" + dateOnly.format(dueDate) + "\nFine(if any):" + due.getFine() +"₹";

    }
    public void borrowBook(){
        BookClass b = new BookClass();
        b.addBook();
        this.book = b;
    }
    public void addFine(){
        due.addDues();
    }


}
