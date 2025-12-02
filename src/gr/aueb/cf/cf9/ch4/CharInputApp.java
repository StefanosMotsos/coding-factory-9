package gr.aueb.cf.cf9.ch4;

import java.io.IOException;
import java.util.Scanner;

public class CharInputApp {
    public static void main(String[] args) throws IOException {
        int inputchar = ' ';

        inputchar = System.in.read();
        System.out.println("numeric value " + inputchar);
        System.out.println("char " + (char)inputchar);

        System.in.read();

        char inputChar2 = ' ';
        Scanner in = new Scanner(System.in);

        inputChar2 = in.nextLine().charAt(0);
        System.out.println(inputChar2);
    }
}
