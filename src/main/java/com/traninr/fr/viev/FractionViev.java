package com.traninr.fr.viev;

import com.traninr.fr.bin.Fraction;

public class FractionViev {
    public String print (Fraction f1, Fraction f2, Fraction rez, char op) {
        String str;
        str = print("privet");
        str = print(f1);
        str = str + op;
        str = str + print(f2);
        str = str + "+";
        str = str + print(rez);

        return str;
    }

    public String print (Fraction f) {
        return f.getNumerator() + "/" + f.getDenominator();
    }

    public String print ( String fr) {
        return  "[" + fr + "]";
    }
}
