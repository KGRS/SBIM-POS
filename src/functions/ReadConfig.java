/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruwan
 */
public class ReadConfig {

    public static String db_driver;
    public static String db_url;
    public static String db_username;
    public static String db_password;
    public static int printBill;
    public static int customerDetailAtPayment;
    public static int isPriceEdit;

    static {
        try {
            Properties prop = new Properties();
//            String sysFolder    = System.getProperty("user.dir");
//            sysFolder           = sysFolder.substring(0, sysFolder.lastIndexOf("\\"));
//            sysFolder           = sysFolder+"\\Config\\Config.properties";
//            prop.load(new FileInputStream(sysFolder));
//            JOptionPane.showMessageDialog(null, sysFolder);
            prop.load(new FileInputStream("Config\\Config.properties"));

            String driver = prop.getProperty("db_driver");
            String ip = prop.getProperty("db_ip");
            String dbName = prop.getProperty("db_name");
            db_username = prop.getProperty("db_username");
            db_password = prop.getProperty("db_password");
            printBill = Integer.parseInt(prop.getProperty("printBill"));
            customerDetailAtPayment = Integer.parseInt(prop.getProperty("customerDetailatBillingtime"));
            isPriceEdit = Integer.parseInt(prop.getProperty("isPriceEdit"));
            
            if (db_password.equals("")) {
                db_password = "RavSam$#@!";
            }
            if (driver.equals("SQL2000")) {
                db_driver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
                db_url = "jdbc:microsoft:sqlserver://" + ip + ":1433;DatabaseName=" + dbName;
            } else if (driver.equals("SQL2005")) {
                db_driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                db_url = "jdbc:sqlserver://" + ip + ":1433;databaseName=" + dbName;
            } else if (driver.equals("MySQL")) {
                db_driver = "com.mysql.jdbc.Driver";
                db_url = "jdbc:mysql://" + ip + ":3306/" + dbName;
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Can't read cofig files");
            Logger.getLogger(ReadConfig.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }
}
