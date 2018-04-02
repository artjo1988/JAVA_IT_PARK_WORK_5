package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a [] = { 1, 2, 3 , 4, 5};
        //удаление элемента второй позиции
        System.out.println("Введите разряд замены замены: 0 - 4");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        for (int i = n; i < a.length - 1; i++){
            a [i] = a [i + 1];
            //a[i] = temp;
        }
        a[a.length - 1] = 0;
        for(int x : a) System.out.print(x + " ");

        System.out.println();

        for (int i = 0; i < a.length / 2; i++){
            int temp1 = a [i];
            a[i] = a[(a.length - 1) - i];
            //a[i] = temp2;
            a[(a.length - 1) - i] = temp1;
        }
        for(int x : a) System.out.print(x + " ");
    }
}
