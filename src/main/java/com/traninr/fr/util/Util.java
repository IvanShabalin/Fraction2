package com.traninr.fr.util;

public final class Util {
    private Util() {
    }

    private static final double PI;

    static {
        PI = 3.14;
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 1");
    }

    public static int nod(int _x, int _y) {
        int x = _x;
        int y = _y;
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }
}
