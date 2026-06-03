import java.util.Map;
import java.util.TreeMap;

public class CourseEnrollmentManager {

    private TreeMap<String, Course> courses;

    public CourseEnrollmentManager() {
        courses = new TreeMap<>();
    }

    public void addStudentToCourse(String course, String studentName) {

        if (!courses.containsKey(course)) {
            courses.put(course, new Course(course));
        }

        courses.get(course).addStudent(studentName);

        System.out.println(studentName +
                " enrolled in " + course);
    }

    public void removeStudentFromCourse(String course,
                                        String studentName) {

        Course c = courses.get(course);

        if (c != null) {
            c.removeStudent(studentName);
            System.out.println(studentName +
                    " removed from " + course);
        }
    }

    public boolean isStudentEnrolled(String course,
                                     String studentName) {

        Course c = courses.get(course);

        return c != null && c.hasStudent(studentName);
    }

    public void displayCourseRoster(String course) {

        Course c = courses.get(course);

        if (c == null) {
            System.out.println("Course not found.");
            return;
        }

        System.out.println("\nRoster for " + course + ":");

        for (String student : c.getStudents()) {
            System.out.println(student);
        }
    }
}