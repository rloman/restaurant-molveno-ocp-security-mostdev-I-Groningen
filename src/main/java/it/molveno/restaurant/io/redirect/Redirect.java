package it.molveno.restaurant.io.redirect;

import java.io.*;

public class Redirect {

    private static ByteArrayOutputStream baos = new ByteArrayOutputStream();

    private static PrintStream console;

    public static void main(String[] args) throws IOException {

        // save current stdout
        console = System.out;

        // redirect stdout
        System.setOut(new PrintStream(baos));

        // print something to stdout (which is now ... )
        System.out.println("This should be in baos");
        System.out.println("This should also be in baos");

        baos.flush();

        baos.close();

        // reset stdout to previous, original stdout
        System.setOut(console);

        // print the previously redirect values
        System.out.println(baos);

        // get the string
        String output = baos.toString();

        // validate some
        assert output.contains("This should be in baos");

        File consoleOut = new File("output.log");

        PrintStream printer = new PrintStream(consoleOut);

        System.setOut(printer);

        for(int i = 0;i<3;i++) {
            System.out.println("This should be in a regular file called output.log");
        }

        System.setOut(console);

        printer.flush();
        printer.close();

    }
}
