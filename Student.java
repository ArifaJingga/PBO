import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String nim;
    String name;
    ArrayList courses;
    ArrayList<Course> courseObj = new ArrayList<>();

   public Student(String nim, String name){
    this.nim = nim;
    this.name = name;
    this.courses = new ArrayList();
   }

   public void printStudentDetails() {
    System.out.println("Name: " + name);
    System.out.println("NIM: " + nim);

  }

  public ArrayList getCourses(){
    return courses;
  }

  public void addCourses(String course) {
    courses.add(course);
  }

  public void addCourseObj(Course course) {
    courseObj.add(course);
  }

  public void getCoursesObj() {
    System.out.println("Name: " + name);
    for (Course item : courseObj) {
      System.err.println("Course Code: " + item.code + ", Course Name: " + item.courseName);
    }
  }

}