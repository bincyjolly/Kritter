package com.kritter;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/sample";

    //  Database credentials
    static final String USER = "bincy";
    static final String PASS = "Kritter12!";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "UPDATE orders set order_amt=130 WHERE orderid=103";

            // Let us check if it returns a true Result Set or not.
            Boolean ret = stmt.execute(sql);
            System.out.println("Return value is : " + ret.toString() );

            // Let us update age of the record with ID = 103;
            int rows = stmt.executeUpdate(sql);
            System.out.println("Rows impacted : " + rows );

            // Let us select all the records and display them.
            sql = "SELECT orderid, order_amt,order_item FROM orders";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("orderid");
                double amount = rs.getDouble("order_amt");
                String item = rs.getString("order_item");


                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Amount: " + amount);
                System.out.print(", Item: " + item);

            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample

