package gr.aueb.cf.cf9.ch7;

/**
 * Concat becomes efficient with StringBuilder.
 */
public class StrBuilder {
    public static void main(String[] args) {
        String concatStr = "";
        long timeStart = 0l;
        long timeEnd = 0l;
        double elapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
            concatStr = concatStr + i;
        }

        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;
        System.out.println("Elapsed time: " + elapsedTime + "seconds");

        // String Builder
        StringBuilder sb = new StringBuilder();
        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;
        System.out.println("Elapsed time: " + elapsedTime + "seconds");
    }
}
