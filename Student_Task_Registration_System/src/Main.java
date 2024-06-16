import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("CS101", "Introduction to Computer Science", "Basics of CS", 1);
        Course course2 = new Course("MATH101", "Calculus I", "Introduction to Calculus", 2);
        Course course3 = new Course("PHYS101", "Physics I","Basic Physics", 3);

        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");
        Student student3 = new Student("S003", "Charlie");

        System.out.println("*****************\nCourse Available\n*****************");
        printAvailableCourses(course1, course2, course3);
        System.out.println("\n*****\n Course 1 Registrations\n*****\n");
        student1.registerCourse(course1);
        student2.registerCourse(course1);
        student3.registerCourse(course1);

        System.out.println("\n*****\n Courses 2 Registrations\n*****\n");
        student1.registerCourse(course2);
        student2.registerCourse(course2);
        student3.registerCourse(course2);

        System.out.println("\n*****\n Course 3 Registrations\n*****\n");
        student1.registerCourse(course3);
        student2.registerCourse(course3);
        student2.registerCourse(course3);
        student3.registerCourse(course3);


    }
    public static void printAvailableCourses(Course... courses) {
        int i=1;
        for (Course course : courses) {
            System.out.println(i+ ". COURSE CODE: " + course.getCourseCode()+ "\n"+ " COURSE NAME : " + course.getTitle() + "\n" + " COURSE DESCRIPTION : "+ course.getDescription() );
            i++;
        }
    }
}