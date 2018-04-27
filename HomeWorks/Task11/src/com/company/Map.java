package com.company;

/**
 * Created by Макс on 26.04.2018.
 */
public interface Map <K, V> {
    void put(K key, V value);
    V get(K key);
}
