package com.company;

import java.sql.*;

interface JDBCConnection {
    //Final variables like jdbc url,port go here
    final String IP_ADDRESS = "127.0.0.1";
    final String SCHEMA = "bankaccountschema";
    final String DB_USERNAME = "root";
    final String PASSWORD = "root";
    PreparedStatement preparedStatement = null;

    public static void getConnection() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://" + IP_ADDRESS + ":3306/" + SCHEMA, "root", "root");
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public static void setQuery(String query) {
        try {
            ResultSet resultSet;
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

}
