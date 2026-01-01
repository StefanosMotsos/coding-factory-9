package gr.aueb.cf.cf9.ch15.welcome;

public class Main {
    public static void main(String[] args) {
        Iwelcome welcomeCF = new CodingFactory();
        welcomeCF.sayHelloCodingFactory();
        welcomeCF.doSomething("Wassup");
    }
}
