public class task2 {

    public static void main(String[] args) {

        ScoreManager manager = new ScoreManager();

        manager.addOrUpdateScore("Hamza", 85);
        manager.addOrUpdateScore("Abdullah", 92);
        manager.addOrUpdateScore("Umair", 88);

        // Update score
        manager.addOrUpdateScore("Hamza", 90);

        // Display all records
        manager.displayAllStudents();

        // Retrieve score
        System.out.println("\nUmair's Score: "
                + manager.getScore("Umair"));

        // Display students in range
        System.out.println();
        manager.displayStudentsInRange("A", "U");

        // Remove a student
        manager.removeStudent("Abdullah");

        System.out.println("\nAfter removing Abdullah:");
        manager.displayAllStudents();
    }
}