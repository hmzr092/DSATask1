import java.util.TreeSet;

public class Course {
    private String courseName;
    private TreeSet<String> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new TreeSet<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public TreeSet<String> getStudents() {
        return students;
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public void removeStudent(String studentName) {
        students.remove(studentName);
    }

    public boolean hasStudent(String studentName) {
        return students.contains(studentName);
    }
}