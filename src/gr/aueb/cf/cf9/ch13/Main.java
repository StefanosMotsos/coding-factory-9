package gr.aueb.cf.cf9.ch13;

public class Main {
    public static void main(String[] args) {
        HelloUtil.sayHello();
        OnlyOneCodingFactory instant = OnlyOneCodingFactory.getInstance();
        instant.doSomething();
        OnlyOneCodingLazy instant2 =  OnlyOneCodingLazy.getInstance();
        instant2.doSomething();
    }
}
