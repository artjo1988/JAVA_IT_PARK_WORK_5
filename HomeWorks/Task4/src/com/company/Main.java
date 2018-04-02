package com.company;


public class Main {
    public static void main(String[] args) {
        char arr [] = {'4','7','2','9','9'};
        System.out.println(parse(arr));
    }

    public static int parse(char input[]){
        int count = 1;
        int numb = 0;
        for(int i= input.length - 1; i >= 0; i--) {
            numb += (input[i] - 48) * count;
            count *=10;
        }
        return numb;
    }
}
