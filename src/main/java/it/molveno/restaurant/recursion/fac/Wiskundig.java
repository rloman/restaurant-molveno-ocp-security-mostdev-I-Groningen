package it.molveno.restaurant.recursion.fac;

public final class Wiskundig {


    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }

    private Wiskundig() {

    }
}
