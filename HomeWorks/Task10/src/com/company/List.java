package com.company;

/**
 * Created by Макс on 23.04.2018.
 */
public interface List<T> extends Collections <T> {
    T get(int index);
    void delete(int index);
}
