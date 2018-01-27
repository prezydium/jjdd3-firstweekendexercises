package com.prezydium;

import java.math.BigInteger;

public class Student {


    public int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] lata = {0, 0, 0};
        do {
            if ((lata[0] == 0)) {
                lata[0]++;
                lata[1] = lata[1] + 15;
                lata[2] = lata[2] + 15;
            } else if (lata[0] == 1) {
                lata[0]++;
                lata[1] = lata[1] + 9;
                lata[2] = lata[2] + 9;
            } else {
                lata[0]++;
                lata[1] = lata[1] + 4;
                lata[2] = lata[2] + 5;
            }
        } while (lata[0] < humanYears);
        return lata;
    }

    public int solveAMT(int n) {
        int[] nominal = {500, 200, 100, 50, 20, 10};
        int howMany = 0;
        int temp;
        for (int i = 0; i < nominal.length; i++){
            temp = n / nominal[i];
            howMany = howMany + temp;
            n = n - (temp * nominal[i]);
        }
        if(n > 0)
        {
            howMany = -1;
        };
        return howMany;
    }

        public BigInteger[] findInitialNumbers(long divisor, long iterations) {
            return new BigInteger[] { BigInteger.ZERO, BigInteger.ZERO };
        }

    public int FindGCD(int a, int b) {
        int iter = 0;
        // Swaping `a` and `b`
        if (a < b) {
            a += b;
            b = a - b;
            a = a - b;
        }

        while (b > 0) {
            int c = a % b;
            a = b; //wieksza
            b = c; //modulo
            iter++;
        }
        System.out.println(iter);
        // `a` - is greatest common divisor now
        return a;
    }

    public int reverseElquides(int dzielnik, int iteracje){
        int drugaLiczba = 0;
        int b;
        drugaLiczba = dzielnik * iteracje;
        int c;
        c = drugaLiczba * 2;
        for(int i = 1; i < iteracje; i++){
            c = c  + dzielnik;
        }
        System.out.println("pierwsza " + c + " || druga " + drugaLiczba );
        return drugaLiczba;
    }

}