package com.traninr.fr.bin;

public class Fraction {
    private int numerator;//полня экземпляра класса
    private int denominator;
    {
        System.out.println("logic block 1");
    }
    {
        System.out.println("logic block 2");

    }


    public Fraction() {
        numerator = 0;
        denominator = 1;
        System.out.println("Fraction()");
    }

    public Fraction(int _numerator, int _denominator) {
        numerator = _numerator;

        if (_denominator == 0) {
            throw new RuntimeException("The denominator is 0");
        }
        denominator = _denominator;
        System.out.println("Fraction(int _numerator, int _denominator)");
    }

    public void setNumerator(int _numerator) {
        numerator = _numerator;
    }

    public void setDenominator(int _denominator) {
        if (_denominator == 0) {
            throw new RuntimeException("The denominator is 0");
        }
        denominator = _denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
