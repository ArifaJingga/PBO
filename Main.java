import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("## Latihan PBO ##");
        
        // STUDENT
        Student student1 = new Student("231010","Ryan");
        student1.printStudentDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah course: ");
        int jumlahCourse = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahCourse; i++) {
            System.out.print("Masukkan Code Course: ");
            String code = scanner.nextLine();
            System.out.print("Masukkan Nama Course: ");
            String courseName = scanner.nextLine();
            Course course = new Course(code, courseName);
            student1.addCourseObj(course);
        }
        
        student1.getCoursesObj();

        // TEACHER
        System.out.println("Informasi Teacher");
        
        System.out.print("Masukan NIP: ");
        String nip = scanner.nextLine();
        System.out.print("Masukkan Salary: ");
        Double salary = scanner.nextDouble();

        Teacher teacher1 = new Teacher(nip, salary);
        teacher1.printTeacherDetails();
    }
    
}