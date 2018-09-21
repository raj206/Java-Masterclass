package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try{
            // Connection conn = DriverManager.getConnection("jdbs:sqlite:D:\\databases\\testjava.db");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/raj/Desktop/Udemy-Java/DB/testjava.db");
            // conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS contacts(name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("insert into contacts (name, phone, email) values ('Tom', 343565342, 't@j.m')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Joe', 45632, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Jane', 4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Fido', 9038, 'dog@email.com')");
//            statement.execute("SELECT * FROM contacts");

            ResultSet results = statement.getResultSet();
            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                    results.getInt("phone") + " " +
                    results.getString("email"));
            }

            results.close();
            statement.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
