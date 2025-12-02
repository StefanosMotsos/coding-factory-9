package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Demo of java.nio.file package.
 */
public class NioReadWriter {
    public static void main(String[] args) {
        Path path = Path.of("C:/Users/stefa/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/nio.txt");
        Path source = Path.of("C:/Users/stefa/Downloads/dbz.jpg");
        Path target = Path.of("C:/Users/stefa/Downloads/dbz-nioCopy.jpg");

        try {
            textWriter(path);
            textReader(path);
            binaryReadWrite(source, target);
        } catch (IOException e) {
            System.out.println("Kapoio lathos sunebi");
        }

    }

    public static void textWriter(Path path) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(
                path,
                "Hello Coding",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    public static void textReader(Path path) throws IOException {
        var text = Files.readString(
                path,
                StandardCharsets.UTF_8
        );
        System.out.println(text);
    }

    public static void binaryReadWrite(Path source, Path target) throws IOException {
        try (var sourceStream = Files.newInputStream(source);
             var targetStream = Files.newOutputStream(target);) {
            sourceStream.transferTo(targetStream);      // efficient, streaming σε chunks
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
