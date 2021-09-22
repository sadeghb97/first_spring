package ir.sbpro.firstspring.Models;

public class Person {
    //baraye gson mitavan harjuri class ra tarif kard
    /*baraye inke betavan az an be onvane model attribute tuye form ha
    estefade kard bayad hatman baraye field haye an getter va setter neveshte shavad */

    private String fname;
    private String lname;
    private int age = 24;

    public Person(){}

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Person -- FirstName: " + fname + " -- " + lname + " >";
    }
}
