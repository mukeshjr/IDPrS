package com.R2L;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Naz on 13/5/16.
 */
public class DatabaseConnector {

    //to be edited due to mysql on Sara's Comp

        public static void main(String args[]){
            try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con= DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6127999","sql6127999","iKjhSEP2ew");


//here sonoo is database name, root is username and password

                Statement stmt=con.createStatement();

                ResultSet rs=stmt.executeQuery("SELECT * FROM ddos");

                while(rs.next())
                    System.out.println(rs.getString(1));

                con.close();

            }catch(Exception e){ System.out.println(e);}

        }
    }
