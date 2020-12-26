/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

//import forms.ConfigForm;
import functions.ReadConfig;
import java.sql.Connection;
import javax.swing.JOptionPane;
import pool.ConnectionFactory;

/**
 *
 * @author Chathura Wijesinghe
 */
public class ConnectSql {

    public static Connection conn;

   
    public static boolean isConnect() {
        try {
            if(conn==null){
                ConnectionFactory conF = new ConnectionFactory(ReadConfig.db_driver, ReadConfig.db_url, ReadConfig.db_username, ReadConfig.db_password, 5);
    //            ConnectionFactory conF = new ConnectionFactory("com.microsoft.sqlserver.jdbc.SQLServerDriver", "jdbc:sqlserver://192.168.1.10:1433;databaseName= PMS", "sa", "sa", 5);
                conn = conF.connect();
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Can't connect to database,Please check configuration...");
//             ConfigForm cf=new ConfigForm();
//             cf.setVisible(true);
            return false;
        }
        return true;
    }
}