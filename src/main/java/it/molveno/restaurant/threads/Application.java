package it.molveno.restaurant.threads;

public class Application {

    public static void main(String[] args) {
        // smallest and simplest
        {
            Thread t = new Thread();
            t.start();
        }































        //using inheritance
        for(int i = 1;i<4;i++) {
            Thread counterThread = new CounterThread(i);
            counterThread.start();
        }



        // using Runnable and better for when using a class which already extends from some
        {

            Runnable r = new Runnable(){

                @Override
                public void run() {
                    System.out.println("A running runnable ...");
                }
            };
            new Thread(r).start();

        }

        // using Lambda Expression
        new Thread(() -> System.out.println(3+4)).start();

        System.out.println("Done ...");
    }
}

class CounterThread extends Thread {

    private long id;

    public CounterThread(long id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i = 0;i<10;i++) {
            System.out.printf("Counterthread[%d] has value %d%n", this.id, i);

            try {
                Thread.sleep(100);// some sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            Thread.yield(); // sounds like cooperative multitasking
        }


    }
}
