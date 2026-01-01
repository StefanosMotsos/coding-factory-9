package gr.aueb.cf.cf9.ch11;

/**
 * Java Bean.
 * Data class που έχει
 *  - private πεδία.
 *  - Default constructor
 *  - getters & setters με συμβάσεις
 */
public class Student {
    private static int studentCount;

      // static block
//    static {
//        studentCount = 0;
//    }

    private int id;
    public String firstname;
    public String lastname;

    // Default Constructor
    public Student() {
        studentCount++;
    }

    // Overloaded Constructor
    public Student(int id, String firstname,String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname =  lastname;
        studentCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getStudentCount() {
        return studentCount;
        //id = 0; //απο static καλουμε μονο static, οχι instance
    }
}


