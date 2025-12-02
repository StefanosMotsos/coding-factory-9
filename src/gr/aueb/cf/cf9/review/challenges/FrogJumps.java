package gr.aueb.cf.cf9.review.challenges;

/**
 * Απο ενα σημειο x, α παει σε ενα σημειο y
 * οπου καθε αποσταση jump, ειναι jump.
 *
 * Εστω οτι
 * x = 10
 * y = 55
 * jump = 25
 */
public class FrogJumps {
    public static void main(String[] args) {
        int x = 10;
        int y = 55;
        int j = 25;
        System.out.println(frogJumps(x,y,j));

    }

    public static int getJumps(int start, int end, int jump) {
        int jumpCount = 0;
        while (start < end) {
            jumpCount++;
            start += jump;
        }
        return jumpCount;
    }

    public static int frogJumps(int start, int end, int jump) {
        return (int) Math.ceil((end - start) / (double) jump);
    }
}
