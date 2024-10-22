public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1012", "Ryandika");
        System.out.println("Student details: ");
        student1.printStudentDetails();
        student1.addCourses("Math");
        student1.addCourses("Science");
        student1.addCourses("English");
        System.out.println(student1.name + "'s courses: " + student1.getCourses());

        Teacher teacher1 = new Teacher("0011", 2000000);
        System.out.println("Teacher details: ");
        teacher1.printTeacherDetails();

    }
    
}