package com.prezydium;

public class Fraction {
    private int counter, denominator;
    private double value;

    public Fraction(int counter, int denominator){
        this.counter = counter;
        this.denominator = denominator;
    }

    public void doMath(){
        double counterDouble = (double) counter;
        double denominatorDouble = (double) denominator;
        value = counterDouble/denominatorDouble;

        System.out.println(value + " [" + counter + "/" + denominator + "]");
    }
}
