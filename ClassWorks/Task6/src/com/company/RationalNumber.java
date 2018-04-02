package com.company;

public class RationalNumber {
    int a;
    int b;
    public RationalNumber(){
        this.a = 0;
        this.b = 1;
    }
    public RationalNumber(int x, int y){
        this.a = x;
        this.b = y;
    }

    public String show(){
        return this.a + "/" + this.b;
    }
    public double toDouble(){
        return (double)this.a / this.b;
    }
}
