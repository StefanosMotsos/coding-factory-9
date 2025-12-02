package gr.aueb.cf.cf9.ch4;

public class CompareApp {
    public static void main(String[] args) {
        char a = 'α';
        char b = 'b';
        boolean isGreekGreater = false;

        System.out.println((int)a);
        System.out.println((int)b);

        if (a > b) isGreekGreater = true;

        System.out.println(isGreekGreater);
    }
}
