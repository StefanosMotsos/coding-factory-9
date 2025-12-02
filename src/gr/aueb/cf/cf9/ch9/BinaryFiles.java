package gr.aueb.cf.cf9.ch9;

import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) {
        String inputFile = "C:/Users/stefa/Downloads/dbz.jpg";
        String outputFile = "C:/Users/stefa/Downloads/dbz-copy.jpg";

        try {
            binaryFileReaderWriter(inputFile, outputFile);
        } catch (IOException e) {
            System.out.println("copy failed");
        }
    }
    public static void binaryFileReaderWriter(String inputFile, String outputFile) throws IOException {
        final int BUFFER_SIZE = 8192; // 8KB
        byte[] buffer =  new byte[BUFFER_SIZE];
        int bytesRead = 0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))) {

             while ((bytesRead = bis.read(buffer)) != -1) {
                 bos.write(buffer, 0, bytesRead);
        }
            System.out.println("File written successfully");
    } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
}
}
