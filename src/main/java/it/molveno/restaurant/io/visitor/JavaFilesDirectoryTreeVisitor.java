package it.molveno.restaurant.io.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class JavaFilesDirectoryTreeVisitor extends SimpleFileVisitor<Path> {

    private static final Logger LOGGER = LoggerFactory.getLogger(JavaFilesDirectoryTreeVisitor.class);

    private static final String javaExtentie = "java";


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        // Files.do something with file;
        Path currentFile = file.getFileName();
        if (currentFile != null && currentFile.toString().endsWith(javaExtentie)) {
            try {
                List<String> lines = Files.readAllLines(file);
                int lineNumber = 1;
                for (String line : lines) {
                    if (line.matches("^\\s*@Override.*")) {
                        LOGGER.debug("Found @Override in file [{}] on line [{}]", currentFile.getFileName(), lineNumber);
                    }
                    if (line.matches("^\\s*@Deprecated.*")) {
                        LOGGER.debug("Found @Deprecated in file [{}] on line [{}]", currentFile.getFileName(), lineNumber);

                        lineNumber++;
                    }
                    if (line.matches("^\\s*public void .*")) {
                        System.out.println(line);
                    }
                }
            } catch (IOException e) {
                LOGGER.error("Unable to read all lines from file [{}]", file.getFileName());
            }
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException e) {
        if (e == null) {
            // OK. Next.
            return FileVisitResult.CONTINUE;
        } else {
            // directory iteration failed
            LOGGER.error("Unable to iterate through directory [{}]", dir.getFileName());

            return FileVisitResult.SKIP_SUBTREE;
        }
    }
}
