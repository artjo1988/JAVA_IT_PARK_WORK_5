package com.company;
import java.util.Scanner;

public class Main {

    public static int summ(int st, int fin){
        int sum = 0;
        while(st != fin +1){
            sum += st;
            st++;
        }
        return sum;
    }

    public static int summChar(int a){
    boolean t = true;
    int sum = 0;
        while(t){
            
        }

    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int st = scanner.nextInt();
	int fin = scanner.nextInt();
        System.out.println(summ(st, fin));

    }
}
