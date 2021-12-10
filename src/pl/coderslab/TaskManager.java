package pl.coderslab;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

    static String FILE_NAME = "src/pl/tasks.csv";
    static String[][] tasks;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        tasks = loadDataToTab(FILE_NAME);
        displayOptions();
        chooseAction();

    }

    public static void displayOptions() {

        String[] options = {"add", "remove", "list", "exit"};
        System.out.println("\033[0;34mPlease select an option:");

        for (String option : options) {
            System.out.println(ConsoleColors.RESET + option);
        }
    }

    public static String[][] loadDataToTab(String fileName) {

        Path dir = Paths.get(fileName);
        if (!Files.exists(dir)) {
            System.out.println("File don't exist");
            System.exit(0);
        }
        String[][] tab = null;
        List<String> strings = null;
        try {
            strings = Files.readAllLines(dir);
            tab = new String[strings.size()][strings.get(0).split(",").length];

            for (int i = 0; i < strings.size(); i++) {
                String[] split = strings.get(i).split(",");
                for (int j = 0; j < split.length; j++) {
                    tab[i][j] = split[j];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tab;
    }

    public static void chooseAction() {
        String option = "";

        while (!"exit".equals(option)) {
            option = scan.next();
            displayOptions();
            switch (option) {
                case "add":
                    addNewTask();
                    System.out.println();
                    break;
                case "remove":
                    System.out.println("Remove");
                    removeTask(tasks, getTheNumber());
                    System.out.println("Value was successfully deleted");
                    break;
                case "list":
                    System.out.println("list");
                    displayList();
                    System.out.println();
                    break;
                case "exit":
                    System.out.println("exit");
                    exitProgram(FILE_NAME, tasks);
                    System.out.println(ConsoleColors.RED + "Bye Bye");
                    break;
                default:
                    System.out.println("Please type in proper option name");
                    System.out.println();

            }
        }
    }

    public static void addNewTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add");
        System.out.println("Please add task description");
        String description = scanner.nextLine();
        System.out.println("Please add due date");
        String dueDate = scanner.nextLine();
        System.out.println("Is task important?");
        String isImportant = scanner.nextLine();

        tasks = Arrays.copyOf(tasks, tasks.length + 1);
        tasks[tasks.length - 1] = new String[3];
        tasks[tasks.length - 1][0] = description;
        tasks[tasks.length - 1][1] = dueDate;
        tasks[tasks.length - 1][2] = isImportant;
    }

    public static void displayList() {

        for (int i = 0; i < tasks.length; i++) {
            String row = Arrays.toString(tasks[i]).replace(",", "").replace("[", i + " : ").replace("]", "");
            System.out.println(row);
        }
    }
    public static boolean isNumberGreaterEqualZero(String input) {
        if (NumberUtils.isParsable(input)) {
            return Integer.parseInt(input) >= 0;
        }
        return false;
    }
    public static int getTheNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select number to remove.");

        String n = scanner.nextLine();
        while (!isNumberGreaterEqualZero(n)) {
            System.out.println("Incorrect argument passed. Please give number greater or equal 0");
            scanner.nextLine();
        }
        return Integer.parseInt(n);
    }
    private static void removeTask(String[][] tab, int index) {
        try {
            if (index < tab.length) {
                tasks = ArrayUtils.remove(tab, index);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Element not exist in tab");
        }
    }
    public static void exitProgram(String fileName, String[][] tab) {

        Path dir = Paths.get(fileName);

        String[] lines = new String[tasks.length];
            for(int i=0;i<tab.length;i++) {
                lines[i] = String.join(",", tab[i]);
            }
            try {
                Files.write(dir, Arrays.asList(lines));

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}



