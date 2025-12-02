package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demo of file writers in java.io package.
 */
public class FileWritersJavaIo {
    public static void main(String[] args) {
        File file = new File("C:/Users/stefa/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");

        try ( PrintStream ps = new PrintStream("C:/Users/stefa/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file-ps.txt")) {
          //  fileWriter("C:/Users/stefa/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");
          //  bufferedWriter(file);
            sayHello(System.out);
            sayHello(ps);
        } catch (IOException e) {
            System.out.println("Το αρχειο δεν δημιουργηθηκε η καποιο λαθος συνεβει κατα την εγγραφη");
        }
    }

    public static void fileWriter(String file) throws IOException {
        try (FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8)) {
            fw.write("Hello world!");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedWriter(File file) throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8, true));
            bw.write("Hello World!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printStream(String file) throws IOException {
        try (PrintStream ps = new PrintStream(file)) {
            ps.println("Hello World");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printWriter(String file) throws IOException {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println("Hello World");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void sayHello(PrintStream ps) {
        ps.println("Hello coding!");
    }
}