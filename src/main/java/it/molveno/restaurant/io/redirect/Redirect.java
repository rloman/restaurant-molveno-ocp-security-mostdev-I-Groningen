package it.molveno.restaurant.io.redirect;

import java.io.*;

public class Redirect {

    private static ByteArrayOutputStream baos = new ByteArrayOutputStream();

    private static PrintStream console;

    public static void main(String[] args) throws IOException {

        redirectToByteArrayOutputStream();
        redirectToLogfile();
    }

    public static void redirectToByteArrayOutputStream() throws IOException {
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

    }

    public static void redirectToLogfile() throws FileNotFoundException {

        console = System.out;

        // create a file
        File consoleOut = new File("output.log");

        // create a printer (to log file)
        PrintStream printer = new PrintStream(consoleOut);

        // redirect stdout to the printer
        System.setOut(printer);

        // create some printable data
        for (int i = 1; i < 4; i++) {
            System.out.printf("This should be in a regular file called output.log line %d%n", i);
        }

        // close
        printer.flush();
        printer.close();

        // reset
        System.setOut(console);
    }
}
