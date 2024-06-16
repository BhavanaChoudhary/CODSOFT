import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String title;
    private String description;
    private int capacity;
    private List<String> enrolledStudents;

    public Course(String courseCode, String title, String description, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }
    public boolean registerStudent(String studentId) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(studentId);
            return true;
        }
        return false;
    }
    public boolean removeStudent(String studentId) {
        return enrolledStudents.remove(studentId);
    }
    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }
}
