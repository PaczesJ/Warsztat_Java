package pl.testExam3;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try (Connection conn = DBUtil.connect2("exam2")) {
            String query1 = "SELECT id, name FROM parent";

            PreparedStatement statement = conn.prepareStatement(query1);
            ResultSet resultSet1 = statement.executeQuery();
            while (resultSet1.next()) {
                String id = resultSet1.getString("id");
                String name = resultSet1.getString("name");
                System.out.println(id + ", " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection conn = DBUtil.connect2("exam2")) {
            String query2 = "SELECT * FROM child WHERE parent_id=?";
            System.out.println("Podaj numer id rodzica, którego dzieci chcesz wyświetlić:");
            int parentFinder = scan.nextInt();

            PreparedStatement statement = conn.prepareStatement(query2);
            statement.setInt(1, parentFinder);
            ResultSet resultSet2 = statement.executeQuery();
            resultSet2.next();
            String name = resultSet2.getString("name");
            String age = resultSet2.getString("age");
            System.out.println(name + ", " + age);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
