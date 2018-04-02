package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива");
        int m = scanner.nextInt();
        System.out.println("Введите кол-во cтолбцов массива");
        int n = scanner.nextInt();
        int arr [][] = new int [m][n];
        int count = 1;
        for(int i = 0; i < m; i++){
            if(i % 2 == 0) for(int j = 0; j < n; j++) arr[i][j] = count++;
            if(i % 2 != 0) for(int j = n - 1; j >= 0; j--) arr[i][j] = count++;
        }
        System.out.println("\n\rРаспоожение элементов змейкой\r\n");
        for(int y [] : arr) {
            for(int x : y){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
