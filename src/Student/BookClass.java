package Student;


import java.awt.*;
import java.io.Serializable;
import java.util.Scanner;

public class BookClass implements Serializable {
    String bookName;
    String author;
    public BookClass(){
        bookName = "";
        author = "";
    }
    public BookClass(String bookName, String author){
        this.bookName = bookName;
        this.author  = author;
    }
    public void addBook(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Book name");
        bookName = s.next();
        System.out.println("Enter author");
        author = s.next();
    }
    public String toString(){
        return "Book Name:" + bookName + "\nAuthor:" + author;
    }
    public String getBookName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }
}
