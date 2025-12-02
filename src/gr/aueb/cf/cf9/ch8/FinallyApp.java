package gr.aueb.cf.cf9.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int num = 0;

//        try {
//            num = sc.nextInt();
//            System.out.println("num is: " + num);
//        } catch (InputMismatchException e) {
//            System.err.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            try {
//                if (sc != null) {
//                    sc.close();
//                }
//            } catch (Exception e) {
//                System.err.println("ERROR: " + e.getMessage());
//                e.printStackTrace();
//            }
//        }
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
            System.out.println("num = " + num);
        } catch (InputMismatchException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

//        try (Scanner sc = new Scanner(new File("C:/users/stefa/data.txt")) {
//            int num2 = sc.nextInt();
//            System.out.println("num = " + num2);
//       } catch (InputMismatchException | FileNotFoundException e2) {
//            System.err.println("Error: " + e2.getMessage());
//            e2.printStackTrace();
//           }
    }
}
