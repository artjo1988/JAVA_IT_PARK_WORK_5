package com.company;

/**
 * Created by Макс on 05.04.2018.
 */
public class RationalNumbers {
    private int a;
    private int b;

    public RationalNumbers(){
        this.a = 0;
        this.b = 1;
    }

    public RationalNumbers(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void show(){
        System.out.println(this.a + "/" + this.b);
    }

    public double toDouble(){
        return (double)this.a /this.b;
    }

    public int nod (int x, int y){
        if(x == y) return x;
        while ( x != 0 || y != 0){
            if (x > y) x = x % y;
            else y= y % x;
        }
        return (a + b);
    }

    public void optimaze(){
        this.a = this.a / nod(this.a , this.b);
        this.b = this.b / nod(this.a , this.b);
        System.out.println(toDouble());
    }
}
