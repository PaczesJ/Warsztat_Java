package pl.testExam2;

public class Main01 {
    public static void main(String[] args) {
        String query1 = "CREATE DATABASE exam1 CHARACTER SET utf8mb4 " +
                "    COLLATE utf8mb4_unicode_ci;";
        String query2 = "create table students (\n" +
                "    id INT AUTO_INCREMENT,\n" +
                "    email VARCHAR(80) UNIQUE,\n" +
                "    firstName VARCHAR(80),\n" +
                "    lastName VARCHAR(80),\n" +
                "    PRIMARY KEY (id)\n" +
                ")";
        String query3 = "CREATE TABLE exercises (\n" +
                "    id INT AUTO_INCREMENT,\n" +
                "    title VARCHAR(80),\n" +
                "    points INT,\n" +
                "    created DATETIME,\n" +
                "    description TEXT,\n" +
                "    PRIMARY KEY (id)\n" +
                ")";
        String query4 = "CREATE TABLE students_exercises (\n" +
                "    student_id INT,\n" +
                "    exercise_id INT,\n" +
                "    FOREIGN KEY (student_id) REFERENCES students(id),\n" +
                "    FOREIGN KEY (exercise_id) REFERENCES exercises(id)\n" +
                ")";
    }
}
