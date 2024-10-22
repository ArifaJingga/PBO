public class Teacher {
    String nip;
    double salary;

    public Teacher(String nip, double salary) {
        this.nip = nip;
        this.salary = salary;
    }

    public void printTeacherDetails() {
        // Print the name of the student
        System.out.println("nip: " + nip);
        
        // Print the grade of the student
        System.out.println("salary: " + salary);
      }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
