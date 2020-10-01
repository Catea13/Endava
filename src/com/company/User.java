package com.company;

import java.util.ArrayList;

public class User {//Am creat class ,care contine cimpuri privat
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private String timestamp;
    private Status status;


    public User(String fname, String lname, int age, String email, String time,Status status) {//am creat constructor
        this.firstname = fname;
        this.lastname = lname;
        this.age = age;
        this.email = email;
        this.timestamp = time;
        this .status=status;
    }

    public User(String fname, String lname, int age, String email, String time) {
    }

    protected static void set(ArrayList<User> user, Status aNew, Status active) {
    }


    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", status=" + status +
                '}';
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    protected void setStatus(Status aNew, Status active) {
    }
}
