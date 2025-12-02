package gr.aueb.cf.cf9.ch2;

/**
 * Παράγει ένα τυχαίο ακέραιο μεταξύ 1 - 6 (ζάρι)
 */
public class RandomApp {

    public static void main(String[] args) {
        int die = 0;
        int max = 10; // max till mul was not used by teacher
        int min = 3;
        int mul = max-min + 1;

        die = (int) (Math.random() * mul) + min; //(Math.random() * 6) + 1

        System.out.println(die);
    }
}
