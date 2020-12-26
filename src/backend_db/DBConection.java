/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_db;


import functions.ReadConfig;
import java.sql.Connection;
import java.sql.SQLException;
import pool.ConnectionFactory;

/**
 *
 * @author TiVA
 */
public class DBConection {
    
    private Connection connection;
    private static DBConection dbCon =null;
    
    
    private DBConection() throws ClassNotFoundException, SQLException{
        ConnectionFactory factory = new ConnectionFactory(ReadConfig.db_driver, ReadConfig.db_url, ReadConfig.db_username, ReadConfig.db_password, 100);
        connection = factory.connect();
    }
    
   private static DBConection  getDBConn() throws ClassNotFoundException, SQLException{
        if (dbCon==null) {
           dbCon = new DBConection();
       }
        return dbCon;
    }
   
   public static Connection getConnection() throws ClassNotFoundException, SQLException{
       
       return getDBConn().connection;
       
   }
    
    
    
    //ConnectionFactory factory = new ConnectionFactory(driver, url, user_name, password, poolSize)
    
    
    
    
    
    
    
    
            
    
            
            
}
