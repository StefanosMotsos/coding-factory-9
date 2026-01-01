package gr.aueb.cf.cf9.ch11;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student alicia = new Student();
        Student verso =  new Student();

        User andreas22 =  new User(1L, "Andreas", "Motsos", "andrew", "12345", true);
        System.out.println(andreas22.getUsername());
        System.out.println(andreas22.isActive());

        Student student2 = new Student(4, "Μάκης", "Καπέτης");
        student2.setFirstname("Χρυσόστομος");
        Student student3 =  new Student(5, "Ichiban", "Kasuga");

        Product milk = new Product(1L, "DELTA", "Light Milk", 1.5, 2, true);

//        alicia.id = 1;
//        verso.id = 2;
//        student.firstname = "Renoir";

        alicia.setId(1);                        // setter
        alicia.setFirstname("Alicia");
        alicia.setLastname("Dessendre");

        verso.setId(2);
        verso.setFirstname("Verso");
        verso.setLastname("Dessendre");

        student.setId(3);
        student.setFirstname("Renoir");
        student.setLastname("Dessendre");

        System.out.println(alicia.getId());     // getter
        System.out.println(alicia.getLastname());
        System.out.println(alicia.getFirstname());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alicia.getId(), alicia.getFirstname(), alicia.getLastname());

        System.out.println(Student.getStudentCount());
    }
}
