package it.molveno.restaurant.io;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.List;

public class NIO2 {

    public static void main(String[] args) throws IOException, URISyntaxException {

        getFileFromPath();

        iterateOverPath();

        checkSomeAttr();

        fiddleWithFileDate();

        iterateOverDirectoryAndDirectories();
    }

    private static void getFileFromPath() {

        Path footballResults = Paths.get("footballresults.txt");

        File file = footballResults.toFile(); // for legacy use for Java IO ...

    }

    private static void iterateOverPath() throws IOException {
        Path footballResults = Paths.get("footballresults.txt");

        final List<String> lines = Files.readAllLines(footballResults);

        lines.forEach(System.out::println);
    }

    private static void checkSomeAttr() throws IOException {
        Path footballResults = Paths.get("footballresults.txt");


        assert Files.isRegularFile(footballResults) : " someFile (footballresults.txt) should be a regular file here";

        assert !Files.isSymbolicLink(footballResults) : "someFile should NOT be a symbolic link here";

        System.out.println("The length of the football file is: " + Files.size(footballResults));

    }


    private static void fiddleWithFileDate() throws IOException {

        Path footballResults = Paths.get("footballresults.txt");

        // print the file date
        System.out.println(Files.getLastModifiedTime(footballResults).toMillis());

        // touch the file (Linux:   $ touch footballresults.txt)
        Files.setLastModifiedTime(footballResults, FileTime.fromMillis(System.currentTimeMillis()));

        // print the file date
        System.out.println(Files.getLastModifiedTime(footballResults).toMillis());

    }


    private static void iterateOverDirectoryAndDirectories() throws IOException {

        // list all java files

        Path src = Paths.get("src/main/java");

        System.out.println(src.toAbsolutePath());

        // one level deep ... hence nothing ...
        Files.list(src)
                .filter(p -> !Files.isDirectory(p))
                .map(p -> p.toAbsolutePath())
                .peek(n -> {
                    assert false : "Should not be here since not expected java files in this src/main/java dir";
                })
                .forEach(System.out::println);

        // deep(er)
        Files.walk(src)
                .filter(p -> !Files.isDirectory(p))
                .map(p -> p.toAbsolutePath())
                .forEach(System.out::println);

        // deep(er)
        long amountOfFiles = Files.walk(src)
                .filter(p -> !Files.isDirectory(p))
                .count();

        System.out.printf("There are %d .java files in this project%n", amountOfFiles);
    }
}
