package gr.aueb.cf.cf9.ch9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GeoData {
        public static void main(String[] args) {
            File file = new File("C:/User/stefa/Downloads/locations.csv");
            String[][] geoData;

            try {
                geoData = getGeoData(file);
                for (String[] geoDatum : geoData) {
                    for (String part : geoDatum) {
                        System.out.print(part + " ");
                    }
                    System.out.println();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Το αρχείο δεν βρέθηκε: " + e.getMessage());
            }
        }

        public static String[][] getGeoData(File file) throws FileNotFoundException {
            String line = null;
            String[] parts = null;

            int count = -1;
            String[][] returnedArray = new String[1000][4];

            try (Scanner scanner = new Scanner(file)) {

                // Skip header line
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }

                while (scanner.hasNextLine()) {
                    count++;
                    line = scanner.nextLine();
                    parts = line.split(",");

                    returnedArray[count] = parts;
                }

                return Arrays.copyOf(returnedArray, count);

            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
                throw e;
            }
        }
    }
