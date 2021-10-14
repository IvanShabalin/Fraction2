package com.traninr.fr.viev;

import com.traninr.fr.bin.Fraction;

public class FractionViev {
    public void printArop (Fraction f1, Fraction f2, Fraction rez, char op) {
        printFractionInOneLine(f1);
        System.out.println(op);
        printFractionInOneLine(f2);
        System.out.println("=");
        printFractionInOneLine(rez);
    }

    private void printFractionInOneLine ( Fraction f) {
        System.out.println(f.getNumerator() + "/" + f.getDenominator());
    }
}
