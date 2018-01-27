package com.prezydium;

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
        int[] nominal = {500, 200, 100, 50, 20};
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


}