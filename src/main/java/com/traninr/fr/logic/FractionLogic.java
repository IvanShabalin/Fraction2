package com.traninr.fr.logic;

import com.traninr.fr.bin.Fraction;

public class FractionLogic {
    public Fraction addition(Fraction f1, Fraction f2) {
        int num, den;
        den = f1.getDenominator() * f2.getDenominator();
        num = f1.getNumerator() * f2.getDenominator() + f2.getNumerator() * f1.getDenominator();
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }

    public Fraction substraction(Fraction f1, Fraction f2) {
        int num, den;
        den = f1.getDenominator() * f2.getDenominator();
        num = f1.getNumerator() * f2.getDenominator() - f2.getNumerator() * f1.getDenominator();
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }

    public Fraction multiplication(Fraction f1, Fraction f2) {
        int num, den;
        den = f1.getDenominator()*f2.getDenominator();
        num = f1.getNumerator()*f2.getNumerator();
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }

    public Fraction division(Fraction f1, Fraction f2) {
        int num, den;
        den = f1.getDenominator()* f2.getNumerator();
        num = f1.getNumerator() * f2.getDenominator();
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }

   /* private int nod() {
        int x = numerator;
        int y = denominator;
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }

    public void reduction() {
        int nod = nod();
        numerator = numerator / nod;
        denominator = denominator / nod;
    }*/
}
