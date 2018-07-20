package it.molveno.restaurant.io.visitor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    private static final String sourceTestDir = "src/main/java";

    public static void main(String[] args) {

        Path start = Paths.get(sourceTestDir);
        JavaFilesDirectoryTreeVisitor walker = new JavaFilesDirectoryTreeVisitor(sourceTestDir);
        try {
            Files.walkFileTree(start, walker);
        } catch (IOException e) {
            System.err.println("Jammer dan ...");
        }
    }
}
