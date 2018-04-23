package com.company;

import com.company.IdGenerstor.UtilImplIdGenerator;
import com.company.Model.User;
import com.company.Repository.UtilImplCrudAndFileWriter;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static String fileId = "id.txt";
    public static String fileRepository = "repository.txt";

    public static void main(String[] args) {
        new UtilImplCrudAndFileWriter().create(new User("Maks","Mirov", LocalDate.now()));

    }
}
