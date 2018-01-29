package com.prezydium;

import java.math.BigInteger;
import java.util.ArrayList;

public class Student {

    ArrayList<Integer> primes = new ArrayList<Integer>();

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
        for (int i = 0; i < nominal.length; i++) {
            temp = n / nominal[i];
            howMany = howMany + temp;
            n = n - (temp * nominal[i]);
        }
        if (n > 0) {
            howMany = -1;
        }
        ;
        return howMany;
    }

    public BigInteger[] findInitialNumbers(long divisor, long iterations) {
        return new BigInteger[]{BigInteger.ZERO, BigInteger.ZERO};
    }

    public ArrayList<Integer> getPrimes() {
        return primes;
    }

    public void setPrimes(ArrayList<Integer> primes) {
        this.primes = primes;
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

    public int reverseElquides(int dzielnik, int iteracje) {
        int drugaLiczba = 0;
        int b;
        drugaLiczba = dzielnik * iteracje;
        int c;
        c = drugaLiczba * 2;
        for (int i = 1; i < iteracje; i++) {
            c = c + dzielnik;
        }
        BigInteger f;
        // f.m
        System.out.println("pierwsza " + c + " || druga " + drugaLiczba);
        return drugaLiczba;
    }

    public void createPrimeNumbers(int x) {

        for (int i = 0; i < x; i++) {
            if (this.isPrime(i)) {
                primes.add(i);
            }
        }
    }

    /*
    taken from https://stackoverflow.com/questions/17963004/return-an-array-of-prime-numbers
     */
    private boolean isPrime(int n) {

        if (n < 2) return false;

        int maxIteration = n / 2;

        for (int i = 2; i <= maxIteration; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public void doSort(int[] numbers) {
        numbers = this.bubbleSort(numbers);
        for (int a : numbers) {
            System.out.print(a + " ");
        }


    }

    public int[] bubbleSort(int[] numbers) {

        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                this.bubbleSort(numbers);
            }
        }
        return numbers;
    }


}