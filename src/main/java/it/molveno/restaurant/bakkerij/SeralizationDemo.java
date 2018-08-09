package it.molveno.restaurant.bakkerij;

import java.io.*;

public class SeralizationDemo {

    // this demo proves that yes ... the Voorraad is null after deserialization EVEN if there is a constructor call in the field construct (question S. Ander) :-)
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        writeToSerFile();

        readFromSerFile();
    }


    private static void writeToSerFile() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream(
                        new File("bakker.ser")));

        Bakker victim = new Bakker(new Voorraad());
        os.writeObject(victim);
    }

    private static void readFromSerFile() throws IOException, ClassNotFoundException, InterruptedException {

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("bakker.ser")));

        Bakker b = (Bakker) is.readObject();

        new Thread(b).start();
    }
}
