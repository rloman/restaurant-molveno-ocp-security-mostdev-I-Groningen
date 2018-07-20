package it.molveno.restaurant.io;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2 {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Path someFile  = Paths.get("footballresults.txt");

        File footballResults = someFile.toFile();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(footballResults));

        bufferedReader.lines().forEach(System.out::println);

        bufferedReader.close();

        Path uriPath = Paths.get(new URI("http://www.nu.nl"));

        // A lot more to tell ... see the book and read on ...



        // shortest code in the OCP :-)
//        new BufferedReader(new InputStreamReader(uriPath.toUri().toURL().openStream())).lines().forEach(System.out::println);
    }
}
