import java.util.ArrayList;
import java.util.List;

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
    System.out.println("Name: " + name);
    System.out.println("NIM: " + nim);
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



