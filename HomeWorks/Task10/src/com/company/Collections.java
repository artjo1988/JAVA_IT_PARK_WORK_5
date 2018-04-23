package com.company;

/**
 * Created by Макс on 23.04.2018.
 */
public interface Collections<T>{
    void add(T element);
    boolean delete(T element);
    int size();
    boolean contains(T element);
}
