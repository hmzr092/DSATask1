import java.util.Map;
import java.util.TreeMap;

public class ScoreManager {

    private TreeMap<String, Integer> studentScores;

    public ScoreManager() {
        studentScores = new TreeMap<>();
    }

    public void addOrUpdateScore(String name, int score) {
        studentScores.put(name, score);
    }

    public void removeStudent(String name) {
        studentScores.remove(name);
    }

    public Integer getScore(String name) {
        return studentScores.get(name);
    }

    public void displayAllStudents() {
        System.out.println("Student Records:");

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void displayStudentsInRange(String start, String end) {
        System.out.println("Students between " + start + " and " + end + ":");

        Map<String, Integer> range =
                studentScores.subMap(start, true, end, true);

        for (Map.Entry<String, Integer> entry : range.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}