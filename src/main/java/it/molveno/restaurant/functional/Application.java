package it.molveno.restaurant.functional;


public class Application {

    public static void main(String[] args) {
//        new Thread(() -> System.out.println("jansen")).start();

        // the samen
        Food one = new Food("BigMac"), two = new Food("Hamburger"), three = new Food("Bread");
        Cook cook = new Cook((n, m) -> {return n.add(m);});

//        System.out.println(cook.cook(two, three));

        Food hamburger = cook.cook(two, three);
        Food bigmac = cook.cook(one, two);

        System.out.println(bigmac);




    }
}
