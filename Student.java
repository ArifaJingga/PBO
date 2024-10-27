import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    String nim;
    String name;
    ArrayList courses;
    List<Course> courseObj;
    // public Person(String id, String name, String age[]){
        
   // }
   public Student(String nim, String name){
    this.nim = nim;
    this.name = name;
    this.courses = new ArrayList();
    this.courseObj = new ArrayList();
   }

   public void printStudentDetails() {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Name: ");
    name = input.nextLine();
    System.out.print("Masukkan NIM: ");
    nim = input.nextLine();
    System.out.print("Masukkan Code: ");
    String code = input.nextLine();
    System.out.print("Masukkan Nama Course: ");
    String course_name = input.nextLine();

    System.out.println("Name: " + name);
    System.out.println("NIM: " + nim);
    System.out.println("Code: " + code);
    System.out.println("Nama Course: " + course_name);

  }

  public ArrayList getCourses(){
    return courses;
  }

  public void addCourses(String course) {
    courses.add(course);
  }

  public void removeCourses(String Course) {
    courses.remove(courses);
  }

  public void addCourseObj(Course course) {
    courseObj.add(course);
  }

  public void getCoursesObj() {
    System.out.println("Name: " + name);
    for (Course item : courseObj) {
        System.out.println("Code: " + item.code+", Name");
    }
  }

}



