import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private List<Course> registeredCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }
    public boolean registerCourse(Course course) {
        if (registeredCourses.contains(course)) {
            System.out.println(name +" has already registered for " + course.getTitle());
            return false;
        }
        if (course.registerStudent(studentId)) {
            registeredCourses.add(course);
            System.out.println(name + " has successfully registered for the course " + course.getTitle());
            return true;
        }
        System.out.println("Slots for " + course.getTitle() + " are full");
        return false;
    }

    public boolean dropCourse(Course course) {
        if (course.removeStudent(studentId)) {
            registeredCourses.remove(course);
            return true;
        }
        return false;
    }

}
