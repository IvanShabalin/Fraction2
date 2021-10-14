package com.traninr.fr.main;

import com.traninr.fr.bin.Fraction;
import com.traninr.fr.logic.FractionLogic;
import com.traninr.fr.viev.FractionViev;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,4);

        FractionLogic logic = new FractionLogic();
        FractionViev viev = new FractionViev();

        Fraction f;

        f = logic.addition(f1,f2);
        f = logic.division(f2,f1);

        viev.printArop(f1,f2,f,'+');
    }
}
