package com.company.Repository;

import com.company.IdGenerstor.UtilImplIdGenerator;
import com.company.Main;
import com.company.Model.User;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by Макс on 19.04.2018.
 */
public class UtilImplCrudAndFileWriter implements Crud {



    @Override
    public void find(int id) {
        try {
            Scanner scanner = new Scanner(new FileReader(Main.fileNameRepository));
            while(scanner.hasNextLine()){
                String s = scanner.nextLine();
                String arr [] = s.split("\\s");
                if(Integer.valueOf(arr[0].trim()) == id){
                    System.out.println(s);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void create(User user) {
        try {
            Writer writer = new FileWriter(Main.fileNameRepository, true);
            writer.write(UtilImplIdGenerator.getCurrentInstance() + user.toString());
            new UtilImplIdGenerator();
            writer.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void update(int id, User user) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Main.fileNameRepository));
            int n = 0;
            while(reader.ready()){
                n++;
            }
            reader.close();
            reader = new BufferedReader(new FileReader(Main.fileNameRepository));
            String arrStr [] = new String [n];
            while(reader.ready()){
                String s = reader.readLine();
                String arr [] = s.split("\\s");
                for(int i = 0; i < n - 1; i++){
                    if(Integer.valueOf(arr[0].trim()) == id){
                        arrStr[i] = "" + id + user.toString();
                    }
                }
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(Main.fileNameRepository));
            for(String x : arrStr) writer.write(x);
            writer.close();
            new UtilImplIdGenerator().setChangeId();
        }
        catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void delete(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Main.fileNameRepository));
            int n = 0;
            while(reader.ready()){
                n++;
            }
            reader.close();
            reader = new BufferedReader(new FileReader(Main.fileNameRepository));
            String arrStr [] = new String [n -1];
            while(reader.ready()){
                String s = reader.readLine();
                String arr [] = s.split("\\s");
                for(int i = 0; i < n - 1; i++){
                    if(Integer.valueOf(arr[0].trim()) != id){
                        arrStr[i] = s;
                    }
                }
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(Main.fileNameRepository));
            for(String x : arrStr) writer.write(x);
            writer.close();
            new UtilImplIdGenerator().setChangeId();
        }
        catch (Exception e) {
             throw new IllegalStateException(e);
        }
    }

    @Override
    public User[] finfAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Main.fileNameRepository));
            int n = 0;
            while(reader.ready()){
                n++;
            }
            reader.close();
            reader = new BufferedReader(new FileReader(Main.fileNameRepository));
            User arrUsers [] = new User [n];
            while(reader.ready()){
                String s = reader.readLine();
                String arr [] = s.split("\\s");
                for(int i = 0; i < n - 1; i++){
                    arrUsers[i] = new User (arr[1], arr[2], LocalDate.parse(arr[3]));
                }
            }
            return arrUsers;
        }
        catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
