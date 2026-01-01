package gr.aueb.cf.cf9.ch15.welcome;

public class CodingFactory implements Iwelcome{
    @Override
    public void doSomething(String message) {
        System.out.println("Please read the message: " + message);
    }

    @Override
    public void sayHelloCodingFactory() {
        Iwelcome.super.sayHelloCodingFactory();
        System.out.println("\u2764".repeat(5));
    }
}
