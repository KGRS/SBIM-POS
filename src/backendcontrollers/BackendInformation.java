/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backendcontrollers;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import java.net.NoRouteToHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TiVA
 */
public class BackendInformation {
    
    
    public static String[] getDateAndTime() throws ClassNotFoundException, SQLException{
        String timeAndDate[]=null;
        
        String query = "SELECT GETDATE() AS CurrentDateTime";
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        String time=null;
        if (result.next()) {
            timeAndDate = new String[2];
            time = result.getString(1);
            timeAndDate[0]=time.substring(0,11);
            timeAndDate[1]=time.substring(11,19);
            System.out.println("date :"+timeAndDate[0]);
            System.out.println("time :"+timeAndDate[1]);
        }    
        
        return timeAndDate;
    }
    
    /**
     * 
     * @return Server Current Date format YYYY-MM-DD HH:MM:SS:ss
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static String getServerDate() throws ClassNotFoundException, SQLException{
        String query = "SELECT GETDATE() AS CurrentDateTime";
        String date ="";
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        while(result.next()){
        date = result.getString(1);        
        }
        return date;
    }
    
    public static void main(String[] args) throws NoRouteToHostException {
        try {
            String serverDate = getServerDate();
            System.out.println(serverDate);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BackendInformation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BackendInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
