package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 * String Input/Output.
 */
public class StrIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String str2 = "";

        System.out.println("Please enter 2 strings: ");
        str = sc.next();        //διαβαζει μεχρι να βρει whitespace (spaces, tab, new line)
        str2 = sc.nextLine();   //διαβαζει μεχρι να βρει new line

        System.out.println(str);
        System.out.println(str2);
    }
}
