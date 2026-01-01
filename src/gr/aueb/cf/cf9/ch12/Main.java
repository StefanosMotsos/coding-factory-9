package gr.aueb.cf.cf9.ch12;

public class Main {
    public static void main(String[] args) {
        Account aliceAcc = new Account(1L, "GR12345", "Alice", "W.", "A12345", 100);
        try {
            aliceAcc.deposit(500);
            System.out.println(aliceAcc.accountToString());

            aliceAcc.withdraw(100, "A12345");
            System.out.println(aliceAcc.accountToString());

            aliceAcc.withdraw(100, "A123354666");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
