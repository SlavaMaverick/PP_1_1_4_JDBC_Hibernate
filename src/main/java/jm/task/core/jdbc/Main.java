package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Имя1", "Фамилия1", (byte) 39);
        userService.saveUser("Имя2", "Фамилия2", (byte) 41);
        userService.saveUser("Имя3", "Фамилия3", (byte) 42);
        userService.saveUser("Имя4", "Фамилия4", (byte) 36);
        userService.removeUserById(2);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
