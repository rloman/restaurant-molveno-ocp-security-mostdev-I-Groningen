package it.molveno.restaurant.recursion.fac;

public class Application {

    public static void main(String[] args) {


        System.out.println(Wiskundig.fac(3));

        assert(6 == Wiskundig.fac(3)): "3! zou 6 moeten zijn";

        assert(12 == Wiskundig.gcd(36, 24)): "Zou 12 moeten zijn";

        System.out.println(Wiskundig.gcd(36, 24));
    }
}
