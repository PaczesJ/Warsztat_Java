package pl.testExam3;

public class Test_Manager {
    public static void main(String[] args) {
        User user1 = new User("Jan", "Maria", "jan.maria@wp.pl");

        Department department1 = new Department("HR");

        Manager manager1 = new Manager();

        manager1.welcome();
    }
}
