package gr.aueb.cf.cf9.ch17.enums;

public class Main {
    public static void main(String[] args) {
        UserRole role = UserRole.ADMIN;

        String roleAdmin = role.name();     //Admin
        System.out.println(roleAdmin);
        System.out.println("role:" + roleAdmin + ", ordinal:" + role.ordinal());
        for (UserRole r : UserRole.values()) {
            System.out.println(r.ordinal() + ": " + r);
        }
    }
}
