package pl.testExam3;

public class Main01 {
    public static void main(String[] args) {
        String query1="CREATE TABLE departments (\n" +
                "    id INT AUTO_INCREMENT,\n" +
                "    name VARCHAR(60),\n" +
                "    PRIMARY KEY (id)\n" +
                ")";
        String query2="CREATE TABLE users (\n" +
                "    id INT AUTO_INCREMENT,\n" +
                "    firstName VARCHAR(60),\n" +
                "    lastName VARCHAR(60),\n" +
                "    email VARCHAR(60) UNIQUE,\n" +
                "    sex INT,\n" +
                "    PRIMARY KEY (id)\n" +
                ")";
        String query3="CREATE TABLE projects_departments (\n" +
                "    id INT AUTO_INCREMENT,\n" +
                "    project_id INT NOT NULL,\n" +
                "    department_id INT NOT NULL,\n" +
                "    PRIMARY KEY (id),\n" +
                "    FOREIGN KEY (department_id) REFERENCES departments(id),\n" +
                "    FOREIGN KEY (project_id) REFERENCES projects(id)\n" +
                ")";
        String query4="SELECT AVG(salary) averageWomenSalary FROM exam2.users WHERE sex = 2";
        String query5="SELECT MAX(salary) FROM exam2.users WHERE department_id = 2";
        String query6="SELECT u.id, firstName, lastName, email, sex, department_id, salary, d.name FROM exam2.users u\n" +
                "    JOIN departments d ON d.id = u.department_id WHERE salary > 5000";
    }
}
