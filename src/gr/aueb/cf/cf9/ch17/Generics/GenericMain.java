package gr.aueb.cf.cf9.ch17.Generics;

public class GenericMain {
    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>();  //Οχι primitives ως παραμετρικοι τυποι
        var intNode = new GenericNode<Integer>();

        doubleNode.setValue(10.5);
        strNode.setValue("Hello");
    }
}
