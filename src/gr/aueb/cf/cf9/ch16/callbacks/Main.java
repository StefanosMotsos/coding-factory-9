package gr.aueb.cf.cf9.ch16.callbacks;


import java.awt.print.Printable;

public class Main {
    public static void main(String[] args) {
        IPrintable printable1 = new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        };

        // Lambda expression
        IPrintable printable2 = () -> System.out.println("Hello coding!");
        IPrintable printable3 = () -> doPrint();

        // Method reference
        IPrintable printable4 = Main::doPrint;

        doWithPrintable(printable1);
        doWithPrintable(printable2);
        doWithPrintable(printable3);
        doWithPrintable(printable4);

        System.out.println("--------------------------- ANONYMOUS CLASSES");


        doWithPrintable(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });

        System.out.println("--------------------------- LAMBDA EXPRESSIONS");

        doWithPrintable(() -> System.out.println("Hello World!"));

        System.out.println("--------------------------- METHOD REFERENCES");

        doWithPrintable(Main::doPrint);
        doWithPrintable(System.out::println);
    }

    public static void doPrint() {
        System.out.println("Hello world!");
    }

    public static void doWithPrintable(IPrintable printable) {
        printable.print();
    }
}
