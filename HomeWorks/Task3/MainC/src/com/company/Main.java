package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива");
        int m = scanner.nextInt();
        System.out.println("Введите кол-во cтолбцов массива");
        int n = scanner.nextInt();
        Random random = new Random();
        int arr [][] = new int [m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = random.nextInt(100);
            }
        }
        for(int y [] : arr) {
            for(int x : y){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("\n\r");
        for(int i = 0; i < m; i++){
            int min = arr [i][0];
            for(int j = 0; j < n; j++){
                if(arr[i][j] < min) min = arr[i][j];
            }
            System.out.println("строка " + i + " min = " + min);
        }
    }
}
