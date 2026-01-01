package gr.aueb.cf.cf9.ch15.welcome;

public interface Iwelcome {
    void doSomething(String message);

    default void sayHelloCodingFactory() {
        System.out.print("Hello ");
        sayCodingFactory();
    }

    private void sayCodingFactory() {
        System.out.println("Coding Factory");
    }

    static void sayHelloCoding() {
        System.out.print("Hello");
        sayCoding();
    }

    private static void sayCoding() {
        System.out.println("Coding");
    }
}