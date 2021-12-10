package pl.testExam3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {


        try (Connection conn = DBUtil.connect2("exam2")) {
            System.out.println("Wpisz imię i nazwisko dziecka:");
            String childName = DBUtil.getMeString();
            System.out.println("Wpisz numer id rodzica dziecka, którego imię i nazwisko wpisałeś:");
            int parentsId = DBUtil.getMeInt();
            int childAge = DBUtil.getMeAge();

            String query = "INSERT INTO child(name, parent_id, age) VALUES (?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, childName);
            statement.setInt(2, parentsId);
            statement.setInt(3, childAge);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
