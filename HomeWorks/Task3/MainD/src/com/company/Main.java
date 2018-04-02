package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов квадратного массива");
        int m = scanner.nextInt();
         Random random = new Random();
        int arr[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        System.out.println();
        for (int y[] : arr) {
            for (int x : y) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
        int summ = 0;
        int count = m - 1;
        for (int i = 0; i < m; i++) {
            summ += arr[i][count];
            count--;
        }
        System.out.println("Сумма элементов побочной диагонали: " + summ);
    }
}
