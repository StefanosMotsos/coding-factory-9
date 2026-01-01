package gr.aueb.cf.cf9.ch15;

public class Main {
    public static void main(String[] args) {
        ISpeakable cat = new Cat("Alicia");
        ISpeakable dog = new Dog("Bob", 5);

        doSpeak(cat);
        doSpeak(dog);

        GenericSpeakingSchool aliciaSpeakingSchool = new GenericSpeakingSchool(cat);
        GenericSpeakingSchool bobSpeakingSchool = new GenericSpeakingSchool(dog);
        aliciaSpeakingSchool.speak();
    }

    public static void doSpeak(ISpeakable ispeakable) {
        ispeakable.speak();
    }
}
