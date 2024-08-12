package com.tipsontech.singletonpattern.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    // Step 1: Create a private static instance of the class (initialized as null).
    private static DatabaseConnectionManager instance = null;

    // The actual database connection object.
    private Connection connection;

    // Database URL, username, and password.
    private String url = "jdbc:mysql://localhost:3306/mydatabase";
    private String username = "root";
    private String password = "password";

    // Step 2: Make the constructor private to prevent instantiation.
    private DatabaseConnectionManager() throws SQLException {
        // Initialize the connection.
        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Failed to create the database connection.");
        }
    }

    // Step 3: Provide a public static method to access the instance.
    public static DatabaseConnectionManager getInstance() throws SQLException {
        if (instance == null) {
            // Step 4: Lazy initialization - create the instance only when needed.
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Method to get the database connection.
    public Connection getConnection() {
        return connection;
    }
}
