package Student;

import java.util.Scanner;

public class Event {
    String eventName;
    String prize;
    public Event(){
        eventName = "";
        prize = "";
    }
    public void addEvent(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter event name and prize");
        this.eventName = s.next();
        this.prize = s.next();
    }
    public String toString(){
        return eventName + ":  " + prize + "\n";
    }
    public void print(){
        System.out.println(this.toString());
    }
}
