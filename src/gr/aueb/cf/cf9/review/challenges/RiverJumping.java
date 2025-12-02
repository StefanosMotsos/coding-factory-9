package gr.aueb.cf.cf9.review.challenges;

public class RiverJumping {
    public static void main(String[] args) {
        int[] T = {1,1,2,2,4,3,1};
        System.out.println(getMinTime(4, T));
    }

    public static int getMinTime(int y,int[] arr) {
        int[] helper = new int[y + 1];
        int stepLeft = y;
        int time = -1;

        for (int i = 0; i < arr.length; i++) {
            if (helper[arr[i]] == 0) {
                helper[arr[i]] = 1;
                stepLeft--;
            } else continue;

            if (stepLeft == 0) {
                time = i;
                break;
            }
        }
        return time;
    }
}
