/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Controlling how data been invoking.
 *
 * @author TiVA
 */


public class ConnectionControll {
    
    public static ResultSet getDataAsViewable(String sql,Connection connection) throws SQLException{
        Statement statemant = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statemant.executeQuery(sql);
        return resultSet;
        
    }    
     public static ResultSet getDataAsViewableandUpdatele(String sql,Connection connection) throws SQLException{
        Statement statemant = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet = statemant.executeQuery(sql);
        return resultSet;

    }
    public static int setData(String sql,Connection connection) throws SQLException{
        Statement statemant = connection.createStatement();
        int result = statemant.executeUpdate(sql);
        return result;        
        
    }
    
}
