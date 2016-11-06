package sample.Main;

import java.sql.*;

/**
 * Created by Allen on 11/6/2016.
 */
public class UserManagement {
    public  User currentUser;
    public void register(String user_name, String GT_email,String password){
        Connection con = null;
        Statement stmt;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_Team_72",
                    "cs4400_Team_72",
                    "mmZwNaCR");
            if(!con.isClosed())
                System.out.println("Successfully connected to " +
                        "MySQL server using TCP/IP...");
            //This will be the first sql statement!
            stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql;
            sql= "INSERT INTO User (user_name, password, stuflag, GT_email, year, Major_name, Adminflag)" +
                    "VALUES ("+user_name+","+password+","+"student,"+GT_email+")";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
            //Clean-up environment
            stmt.close();
            con.close();
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            try {
                if(con != null)
                    con.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
