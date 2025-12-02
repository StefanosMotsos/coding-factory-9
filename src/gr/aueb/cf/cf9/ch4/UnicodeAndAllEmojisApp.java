package gr.aueb.cf.cf9.ch4;

public class UnicodeAndAllEmojisApp {
    public static void main(String[] args) {
        int codePoint = 0x1F600;
        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));

        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;

        emoji = emojiStart;
        while (emoji < emojiEnd) {
            counter++;
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            if (counter % 16 == 0) {
                System.out.println(" ");
            }
        }
    }

}
