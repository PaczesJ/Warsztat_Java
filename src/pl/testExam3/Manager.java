package pl.testExam3;

import java.util.Arrays;

public class Manager extends User {

    private User[] users;
    private Department department;

    public void welcome() {
        String greetings = "Hello Manager ";
        System.out.println(greetings + firstName + " " + lastName);
    }


}
