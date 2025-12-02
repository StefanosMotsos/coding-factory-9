package gr.aueb.cf.cf9.ch7;

public class LetterCount {
    public static void main(String[] args) {
        char letter = 'a';
        String s = "racecar";
        System.out.println(countLetters(s, letter));
    }

    public static int countLetters(String s, char letter) {
        if (s == null) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) count++;
        }
        return count;
    }
}
