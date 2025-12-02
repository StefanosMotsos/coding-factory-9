package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {
    public static void main(String[] args) {
        String cf = "Coding Factory";

        int position0fo =  cf.indexOf("o");                      // 1
        int position0fNexto = cf.indexOf("o", 2);  // 11
        int positionOfLasto = cf.lastIndexOf("o");          // 11

        String t = "gr.aueb.cf.cf9.ch7";
        System.out.println(getExtension(t));

    }

    // Μεθοδος που να επιστρεφει την καταληξη του ονοματος ενος αρχειου
    public static String getExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
