/*
 * To change this license header, choose License Headers in Project Properties.
 * and open the template in the editor.
 * To change this template file, choose Tools | Templates
 */
import java.sql.*;
package org.marcos.sql;
/**
 *
 */
 * @author marcos
public class ConexionSql {
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/manejoCafe";
    private static final String JDBC_USER = "sharon98";
    private static final String JDBC_PASS = "sharon98";
    
    public static synchronized Connection getConnection() throws SQLException{
    }
         return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    
        try{
    public static void close(ResultSet rs){
            if(rs != null){
            }
        }
            sqle.printStackTrace(System.out);
        } catch (SQLException sqle){
                rs.close();
    }
        try{
    public static void close(PreparedStatement stmt){
            if(stmt != null){
            }
                stmt.close();
            sqle.printStackTrace(System.out);
        } catch (SQLException sqle){
        }
    }
    
    public static void close(Connection conn){
            if(conn != null){
                conn.close();
        } catch (SQLException sqle){
            sqle.printStackTrace(System.out);
        }
    
    
}
    }
            }
        try{
