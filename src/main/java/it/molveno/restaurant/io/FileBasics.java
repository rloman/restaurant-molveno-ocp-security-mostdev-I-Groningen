package it.molveno.restaurant.io;

import java.io.*;

public class FileBasics {

    private static final String FILENAME = "zoo.txt";

    public static void main(String[] args) throws IOException {
        createAndWriteFile(FILENAME);

        readFile(FILENAME);

        printToFile();

//        readfromConsole(); // TIP Run with jar since Eclipse and Intellij fail since it is not having access to console

        formatting();
    }


    public static void createAndWriteFile(String filename) {
        File zoo = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(zoo));
            writer.write("Elephant");
            writer.newLine();
            writer.write("Giraffe");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            assert false : "Failing to open file for writing";
        }

    }

    public static void readFile(String filename) {
        File file = new File(filename);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            reader.lines().forEach(System.out::println);
            reader.lines().forEach(n -> {

                assert false : "Should never come here since stream is used";
                System.out.println("In the second for each");
                System.out.println(n);
            });

            long lines = reader.lines().count();

            assert 0 == lines : "Lines should be 0 here since reader is read ... ";

            reader = new BufferedReader(new FileReader(file)); // create new reader over file

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            assert false : "Unable to open file for reading";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readfromConsole() throws IOException {

        Console console = System.console();
        // this console will be null when run in Eclipse / IntelliJ
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered the following in Console: " + userInput);
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            System.out.println("You entered the following in oldWay: " + userInput);
        }
    }

    public static void printToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File("output.log"));

        writer.println("The quick brown fox");
        writer.println("drinks some beer together");
        writer.println("with the lazy dog.");

        writer.flush();
        writer.close();
    }

    public static void formatting() throws FileNotFoundException {

        final String footballFormatString = "%-23s - %-23s  %2d - %2d%n";

        PrintWriter writer = new PrintWriter(new File("footballresults.txt"));

        writer.printf(footballFormatString, "Heracles", "Ajax", 2, 0);
        writer.printf(footballFormatString, "Feyenoord", "FC Den Haag", 10, 3);
        writer.printf(footballFormatString, "Telstar", "FC TWente", 10, 14);

        writer.flush();
        writer.close();
    }
}