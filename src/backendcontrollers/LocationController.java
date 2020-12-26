/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backendcontrollers;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Location;

/**
 *
 * @author Administrator
 */
public class LocationController {

    public static ArrayList<Location> getLocation() throws SQLException, ClassNotFoundException {
        ArrayList<Location> locationList = new ArrayList<Location>();
        String sql = "Select * from Departments where Type = 'POS' ;";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        Location location = null;
        if (rst != null) {
            while (rst.next()) {
                location= new Location();
                location.setLocation_code(rst.getString(1));
                location.setDiscription(rst.getString(2));
                locationList.add(location);
            }
            return locationList;
        } else {
            return null;
        }
    }

    public static Location getLocationByDiscription(String loc_discription) throws ClassNotFoundException, SQLException{
        String sql = "Select LocCode from tblLocations where Description='"+loc_discription+"';";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        Location location=null;
        if (rst!=null) {
            while(rst.next()){
                location=new Location();
                location.setLocation_code(rst.getString(1));
            }
            return location;
        }else{
            return null;
        }
    }
}
