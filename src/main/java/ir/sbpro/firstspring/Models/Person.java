package ir.sbpro.firstspring.Models;

public class Person {
    public String fname;
    public String lname;
    public int age = 24;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Person -- FirstName: " + fname + " -- " + lname + " >";
    }
}
