package com.company;

import java.util.ArrayList;

public class Application extends  User {


    public Application(String fname, String lname, int age, String email, String time) {
        super(fname, lname, age, email, time);
    }

    public static void main(String[] args) {


        ArrayList<User> user = new ArrayList<User>();//Am pus datele in Collectia ArrayList
        user.add(new User("Sterbu", "Victoria", 28, "Vica@mail.ru", "01.10.2020", Status.Active));
        user.add(new User("Lernatov", "Dumitru", 21, "Dumitru@gmail.com", "08.09.2018", Status.Inactive));
        user.add(new User("Dordov", "Mihaela", 23, "Mihaila@gmail@com", "09.08.2019", Status.New));
        user.add(new User("Ematov", "Anastasia", 26, "Anastasia@mail.ru", "09.06.2020", Status.Blocked));
        for (User user1 : user) {
            System.out.println("User" + user1);//Afiseaza user
        }

        for (User change : user) {//cum schimbam status?


        }
    }
    