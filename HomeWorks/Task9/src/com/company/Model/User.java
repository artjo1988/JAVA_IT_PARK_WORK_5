package com.company.Model;

import com.company.IdGenerstor.UtilImplIdGenerator;

import java.time.LocalDate;

/**
 * Created by Макс on 19.04.2018.
 */
public class User {
    private String firstName;
    private String lastName;
    private LocalDate birthday;

    public User(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return " " + firstName + " " + lastName + " " + birthday;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
