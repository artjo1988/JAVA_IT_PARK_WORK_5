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

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void show(){
        System.out.println(this.a + "/" + this.b);
    }

    public double toDouble(){
        return (double)this.a /this.b;
    }

    public int nod (int a, int b){
        if(a == b) return a;
        if(a > b) {
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
            return a;
        }
        if(b > a) {
            while (a != 0) {
                int tmp = b % a;
                b = a;
                a = tmp;
            }
            return b;
        }
        return 0;
    }

    public void optimaze(){
        this.a = this.a / nod(this.a , this.b);
        this.b = this.b / nod(this.a , this.b);
        show();
    }
}
