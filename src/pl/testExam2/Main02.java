package pl.testExam2;

public class Main02 {
    public static void main(String[] args) {
        String query1 = "SELECT * FROM students WHERE firstName = 'Jan' AND lastName = 'Kowalski';";
        String query2 = "SELECT * FROM exercises WHERE points = (SELECT MAX(points) FROM exercises)";
        String query3 = "SELECT * FROM exercises WHERE title LIKE 'W pli%';";
        String query4 = "SELECT DISTINCT id, email, firstName,lastName FROM students s\n" +
                "    JOIN students_exercises se ON s.id = se.student_id WHERE exercise_id IS NOT NULL";
        String query5 = "SELECT DISTINCT id, email, firstName,lastName,  COUNT(exercise_id) AS tasksAssigned FROM students s\n" +
                "    JOIN students_exercises se ON s.id = se.student_id GROUP BY id";
        String query6 = "SELECT DISTINCT s.id, email, firstName,lastName,  SUM(points) AS summedTasks FROM students s\n" +
                "    JOIN students_exercises se ON s.id = se.student_id JOIN exercises e ON se.exercise_id = e.id GROUP BY s.id " +
                "   ORDER BY summedTasks DESC LIMIT 3";
        String query7 = "SELECT DISTINCT id, email, firstName,lastName FROM students s\n" +
                "    JOIN students_exercises se ON s.id = se.student_id WHERE exercise_id IS NULL";
        String query8 = "SELECT * FROM exercises WHERE created BETWEEN '2020-07-01 09:30:00' AND '2020-07-01 12:30:00'";
    }
}
