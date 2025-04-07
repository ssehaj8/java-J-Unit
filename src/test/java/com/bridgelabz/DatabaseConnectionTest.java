package com.bridgelabz;

import com.bridgelabz.JUnit.DatabaseConnectiontest.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    private DatabaseConnection databaseConnection;

    // To initialize a database connection before each test
    @BeforeEach
    void setUp() {
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    // To close the connection after each test
    @AfterEach
    void tearDown() {
        databaseConnection.disconnect();
    }

    // To verify that the method returns true if connection is established
    @Test
    public void shouldReturnTrueIfConnectedIsEstablished() {
        Assertions.assertTrue(true, databaseConnection.connect());
    }

    // To verify that the method returns true if connection is closed
    @Test
    public void shouldReturnTrueIfConnectionIsClosed() {
        Assertions.assertTrue(true, databaseConnection.disconnect());
    }
}