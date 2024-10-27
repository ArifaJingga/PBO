import java.util.Scanner;

public class Teacher {
    String nip;
    double salary;

    public Teacher(String nip, double salary) {
        this.nip = nip;
        this.salary = salary;
    }

    public void printTeacherDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nip: ");
        nip = input.nextLine();
        System.out.print("Masukkan salary: ");
        double salary = input.nextDouble();

        System.out.println("NIP: " + nip);
        System.out.println("Salary: " + salary);
      }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
