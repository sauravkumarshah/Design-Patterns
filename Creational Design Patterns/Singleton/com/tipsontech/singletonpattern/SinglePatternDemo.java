package com.tipsontech.singletonpattern;

import java.sql.Connection;
import java.sql.SQLException;

import com.tipsontech.singletonpattern.singleton.DatabaseConnectionManager;

public class SinglePatternDemo {
    public static void main(String[] args) {
        try {
            // Step 5: Access the singleton instance and use it.
            DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
            Connection connection1 = connectionManager.getConnection();

            // Perform database operations using connection1.
            // ...

            // Even if we try to create another connection manager instance, we get the same one.
            DatabaseConnectionManager connectionManager2 = DatabaseConnectionManager.getInstance();
            Connection connection2 = connectionManager2.getConnection();

            // Verifying that both connection1 and connection2 are the same.
            if (connection1 == connection2) {
                System.out.println("Both connection1 and connection2 are the same instance.");
            } else {
                System.out.println("connection1 and connection2 are different instances.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
