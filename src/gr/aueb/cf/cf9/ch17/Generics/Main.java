package gr.aueb.cf.cf9.ch17.Generics;

public class Main {
    public static void main(String[] args) {
        FlexibleNode flex = new FlexibleNode();
        flex.setValue("Coding");

        // no compile time safety
        int value = (int) flex.getValue();

        System.out.println(value);
    }
}
