package SaticDemo;

import java.sql.*;
public class StaticClass {

    //this class is working on database part
    static class Database {

        //this variable hold the database password

        static String DBpassword = "root";

        //this static block make a database connection
        static {
            System.out.println("Assume that Connection is created inside static block So Connection is created Done....");

        }

        //this method return connection Class Object

        public static String DatabaseConnection()
        {
            return "Connection Object";
        }
    }

    public static void main(String[] args) {
     StaticClass s = new StaticClass();
        System.out.println(Database.DatabaseConnection());
    }
}
