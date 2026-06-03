public class task3 {

    public static void main(String[] args) {

        CourseEnrollmentManager manager =
                new CourseEnrollmentManager();

        manager.addStudentToCourse(
                "Data Structures", "Hamza");

        manager.addStudentToCourse(
                "Data Structures", "Abdullah");

        manager.addStudentToCourse(
                "Data Structures", "Umair");

        manager.addStudentToCourse(
                "Database Systems", "Hamza");

        manager.addStudentToCourse(
                "Database Systems", "Umair");

        manager.displayCourseRoster(
                "Data Structures");

        System.out.println();

        System.out.println(
                "Is Hamza enrolled in Data Structures? "
                        + manager.isStudentEnrolled(
                        "Data Structures",
                        "Hamza"));

        manager.removeStudentFromCourse(
                "Data Structures",
                "Umair");

        System.out.println();

        manager.displayCourseRoster(
                "Data Structures");
    }
}