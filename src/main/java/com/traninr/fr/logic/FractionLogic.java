package com.traninr.fr.logic;

import com.traninr.fr.bin.Fraction;
import com.traninr.fr.util.Util;

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

    public static Fraction multiplication(Fraction f1, Fraction f2) {
        int num, den;
        den = f1.getDenominator() * f2.getDenominator();
        num = f1.getNumerator() * f2.getNumerator();
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }

    public static Fraction division(Fraction f1, Fraction f2) {
        int num, den;
        den = f1.getDenominator() * f2.getNumerator();
        num = f1.getNumerator() * f2.getDenominator();
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }


    public void reduction(Fraction f) {
        int nod = Util.nod(f.getNumerator(), f.getDenominator());
        f.setDenominator(f.getNumerator() / nod);
        f.setDenominator(f.getDenominator() / nod);
    }
}
