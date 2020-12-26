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
import java.util.ArrayList;
import model.ItemPrice;

/**
 *
 * @author Administrator
 */
public class ItemPriceController {


    public static ArrayList<ItemPrice> findItem(String itemCode) throws ClassNotFoundException, SQLException{
        ArrayList<ItemPrice> list = new ArrayList<ItemPrice>();
        String query = "select * from tblItemMasterPrice"
                + " where item_code like '"+itemCode+"';";
        //System.out.println("Query : "+query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        ItemPrice itemPrice=null;
        while (result.next()) {
            itemPrice=new ItemPrice();
            itemPrice.setItemCode(result.getString(2));
            itemPrice.setItemPrice(result.getDouble(3));

            list.add(itemPrice);
        }
        return list;
    }
}
