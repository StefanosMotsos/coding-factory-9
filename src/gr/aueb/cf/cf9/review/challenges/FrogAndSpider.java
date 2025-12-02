package gr.aueb.cf.cf9.review.challenges;

public class FrogAndSpider {
    public static void main(String[] args) {
        int[][] grid = {
                {1,2,3},
                {7,3,2},
                {2,4,3},
                {1,2,1},
                {14,12,10},
        };

        for (int i = 0; i < grid.length; i++) {
            printWhichFrogOrSpider(grid[i][0], grid[i][1], grid[i][2]);
        }
    }

    public static void printWhichFrogOrSpider(int frog1, int frog2, int spider) {
        int distance1; int distance2;

        distance1 = Math.abs(frog1 - spider);
        distance2 = Math.abs(frog2 - spider);

        if (distance1 < distance2) System.out.println("Frog N.1");
        else if (distance2 < distance1) System.out.println("Frog N.2");
        else System.out.println("Spider");
    }
}
