package pl.testExam2;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        String query = "CREATE TABLE books (\n" +
                "    id INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "    title VARCHAR(45) DEFAULT NULL,\n" +
                "    author VARCHAR(45) DEFAULT NULL,\n" +
                "    isbn VARCHAR(45) DEFAULT NULL,\n" +
                "    PRIMARY KEY (id)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8";

            Scanner scan = new Scanner(System.in);
            System.out.println("Wprowadź tytuł książki:");
            String insertTitle = scan.nextLine();
            System.out.println("Wprowadź autora");
            String insertAuthor = scan.nextLine();
            System.out.println("Wprowadź isbn");
            String insertISBN = scan.nextLine();
            addBook(insertTitle, insertAuthor, insertISBN);
    }

    public static void addBook (String title, String author, String isbn) {
        try (Connection conn = DBUtil.connect2("exam1")) {
            String insertQuery = "INSERT INTO books(title, author, isbn) VALUES (?, ?, ?)";
            DBUtil.insert(conn, insertQuery, title, author, isbn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
