package gr.aueb.cf.cf9.ch7;

public class StrEtc {
    public static void main(String[] args) {

        //Traverse as array
        String s = "Coding Factory";

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        // Replace
        String firstname = "Maria-Helen";
        String simpleName =  firstname.replace("-", " ");
        System.out.println(simpleName);

        //concat

        String lastname = "Smith";
        String fullname1 =  firstname + " " + lastname;
        String fullname2 = firstname.concat(lastname);
    }
}
