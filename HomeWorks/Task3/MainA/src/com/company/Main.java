package com.company;

import java.util.*;

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
        System.out.println();
        for(int y [] : arr) {
            for(int x : y){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        int count = 0;
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(arr[i][j] != 0){
                    for(int p = i; p < m; p++) {
                        for (int s = j + 1; s < n; s++) {
                            if(arr[i][j] == arr[p][s]){
                                arr[p][s] = 0;
                                count++;
                            }
                        }
                    }
                }
                if(count > 0) {
                    arr[i][j] = 0;
                    count = 0;
                }
            }
        }
        System.out.println("\n\rЗамена нулями повторяющихся элементов\n\r");
        for(int y [] : arr) {
            for(int x : y){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
