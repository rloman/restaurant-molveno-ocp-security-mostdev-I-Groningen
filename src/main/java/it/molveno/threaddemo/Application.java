package it.molveno.threaddemo;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(new CounterRunnable(i));
            if (i % 3 == 0) {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }



            thread.start();

            // IK (wie is hier IK?!) wil hier wachten totdat thread klaar is
//            thread.join();
        }


        new Thread(() -> {
            System.out.println("Ik ben een lambda expression thread");
        }).start();


    }
}

class CounterRunnable extends Person implements Runnable {

    private int id;

    CounterRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.printf("Running in begin of thread '%d'%n", this.id);

        // Thread.yield(); // OCP yield is "opleveren / oogsten" en GEEFT GEEN EXCEPTIE

//        try {
////            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.printf("Running in end of thread '%d'%n", this.id);
    }
}

class Person {

}