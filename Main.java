import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("## Manage Student Course ##");

       Student student1 = new Student(null, null);
       student1.printStudentDetails();

       Teacher teacher1 = new Teacher(null, 0);
       teacher1.printTeacherDetails();
    }
    
}