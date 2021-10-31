package Assignment1.Module.src.package1;

// Attention!!! write down your own package path
// package Assignments.assignment1;

import java.util.Date;

public class Student {
    private String firstname;
    private String lastname;
    private long studentId;
    private double weight;
    private Date birthday;

    public enum SortKey {
        FIRSTNAME,
        LASTNAME,
        STUDENT_ID,
        WEIGHT,
        BIRTHDAY
    }

    public Student() {
    }

    public Student(String firstname, String lastname, long studentId, double weight, Date birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.weight = weight;
        this.birthday = birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public long getStudentId() {
        return studentId;
    }

    public double getWeight() {
        return weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    // the getName method for getting the fullname
    public String getName() {
        return this.firstname + " " + this.lastname;
    }

    @Override
    public String toString()
    {
        String appendAll = "\t" + this.firstname + "\t\t\t" + this.lastname + "\t\t\t" + this.studentId + "\t\t\t" + this.weight + "\t\t\t" + this.birthday;
        return appendAll;
    };
}
