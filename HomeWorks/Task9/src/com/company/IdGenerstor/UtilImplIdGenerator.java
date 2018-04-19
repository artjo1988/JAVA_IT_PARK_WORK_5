package com.company.IdGenerstor;

import com.company.Main;

import java.io.*;

/**
 * Created by Макс on 19.04.2018.
 */
public class UtilImplIdGenerator implements IdGenerator {

    private static int currentInstance;

    public static int getCurrentInstance() {
        return currentInstance;
    }

    static{
        new UtilImplIdGenerator();
    }

    public UtilImplIdGenerator() {
        this.currentInstance = getId();
        writeId(currentInstance);
    }

    @Override
    public void writeId(int newId) {
        try {
             BufferedWriter writer = new BufferedWriter(new FileWriter(Main.fileNameId));
             writer.write(String.valueOf(newId));
             writer.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

    }

    @Override
    public int getId() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Main.fileNameId));
            reader.close();
            int id = Integer.parseInt(reader.readLine());
            return ++id;
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void setChangeId() {
        currentInstance --;
        currentInstance --;
        writeId(currentInstance);
    }
}
