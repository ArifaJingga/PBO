import java.util.Scanner;

public class Teacher {
    String nip;
    double salary;

    public Teacher(String nip, double salary) {
        this.nip = nip;
        this.salary = salary;
    }

    public void printTeacherDetails() {
        System.out.println("NIP: " + nip);
        System.out.println("Salary: " + salary);
    }
    
}
