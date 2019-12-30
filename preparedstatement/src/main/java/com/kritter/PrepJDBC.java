package com.kritter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepJDBC {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws SQLException {

        // variables
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Step 1: Loading or registering MySQL JDBC driver class
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in loading MySQL JDBC driver");
            cnfex.printStackTrace();
        }

        // Step 2: Opening database connection
        try {

            // Step 2.A: Create and get connection using DriverManager
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sample",
                    "bincy",
                    "Kritter12!");

            // Start of JDBC transaction
            connection.setAutoCommit(false);

            // Insert query
            String sqlInsertQuery = "INSERT INTO PLAYER (NAME, AGE, MATCHES)"
                    + " VALUES (?, ?, ?)";

            // Step 2.B: Creating JDBC PreparedStatement
            preparedStatement = connection
                    .prepareStatement(sqlInsertQuery); // for insert

            // set values
            preparedStatement.setString(1, "Justin Langer");
            preparedStatement.setInt(2, 45);
            preparedStatement.setInt(3, 105);

            // Step 2.C: Execute
            preparedStatement.executeUpdate();

            // Update query -&gt; this is written to throw ERROR
            // data-type mismatch
            String sqlUpdateQuery = "UPDATE PLAYER"
                    + " SET MATCHES = ?"
                    + " WHERE PLAYER_ID = ?";

            // Step 2.B: Creating JDBC Statement
            preparedStatement = connection
                    .prepareStatement(sqlUpdateQuery); // for update

            // purposely setting wrong data-type to cause db ERROR
            preparedStatement.setString(1, "Steve Waugh");
            preparedStatement.setInt(2, 11);

            // Step 2.C: Execute
            preparedStatement.executeUpdate();

            // End of JDBC transaction
            connection.commit(); // commit, if successful

            System.out.println("All DML operations are successful");
        }
        catch(SQLException sqlex){

            // rollback, if any of the DML operation is failure
            connection.rollback();
            System.out.println("roll back done !!");
            // sqlex.printStackTrace();
        }
        finally {
            // Step 3: Closing database connection
            try {
                if(null != connection) {
                    // cleanup resources, once after processing
                    preparedStatement.close();

                    // and then finally close connection
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }
}
