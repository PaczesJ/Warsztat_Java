package pl.testExam3;

import org.apache.commons.lang3.math.NumberUtils;
import pl.testExam2.Book;

import java.sql.*;
import java.util.Scanner;

public class DBUtil {
    public static String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    public static String DB_USER = "root";
    public static String DB_PASS = "coderslab";
    private static final String DB_URL_ToChange = "jdbc:mysql://localhost:3306/DBName?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static final String DELETE_QUERY = "DELETE FROM tableName WHERE id = ?";
    private static Scanner scan = new Scanner(System.in);


    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public static Connection connect2(String dataBaseName) throws SQLException {
        return DriverManager.getConnection(DB_URL_ToChange.replace("DBName", dataBaseName), DB_USER, DB_PASS);
    }

    public static void printData(Connection conn, String query, String... columnNames) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                for (String columnName : columnNames) {
                    System.out.println(resultSet.getString(columnName));
                }
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void printDataForMain05(Connection conn, String query) throws SQLException {
        try(PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery()) {
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String isbn = resultSet.getString("isbn");
                Book book = new Book(id, title, author, isbn);

            }
        }
    }
    public static void insert(Connection conn, String query, String...params) {
        try(PreparedStatement statement = conn.prepareStatement(query)) {
            for(int i = 0; i<params.length; i++) {
                statement.setString(i + 1,params[i]);
            }
            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void remove(Connection conn, String tableName, int id) {
        try (PreparedStatement statement = conn.prepareStatement(DELETE_QUERY.replace("tableName", tableName))) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean isNumberGreaterThanZero (String input) {
        if (NumberUtils.isParsable(input)) {
            return Integer.parseInt(input) > 0;
        }
        return false;
    }
    public static int getTheNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert childs age:");

        String age = scanner.nextLine();
        while (!isNumberGreaterThanZero(age)) {
            System.out.println("Incorrect argument passed. Please give number greater than 0");
            scanner.nextLine();
        }
        return Integer.parseInt(age);
    }
    public static int getMeInt() {
        while(!scan.hasNextInt()) {
            scan.next();
            System.out.println("Podaj liczbę typu int:");
        }
        int num = scan.nextInt();
        return num;
    }
    public static String getMeString() {
        return scan.nextLine();
    }
    public static int getMeAge() {
        System.out.println("Wpisz wiek dziecka:");
        while(!scan.hasNextInt()) {
            scan.next();
            System.out.println("Podaj wiek typu int > 0 :");
        }
        int num = scan.nextInt();
        if(num > 0) {
            return num;
        }return 1;
    }
}
