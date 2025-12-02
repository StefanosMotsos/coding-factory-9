package gr.aueb.cf.cf9.ch6;

public class ReplaceWithMethod {
    public static void main(String[] args) {
        int[] grades = {4, 2, 8, 9, 5};

        upscaleByOne(grades);
        printArrays(grades);
    }

    public static void printArrays(int[] grades) {
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
    }

    public static void upscaleByOne(int[] grades) {
        for (int grade = 0; grade < grades.length; grade++) {
            grades[grade] += 1;
        }
    }
}
