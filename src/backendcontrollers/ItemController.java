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
import model.Item;

/**
 *
 * @author Administrator
 */
public class ItemController {

    public static ResultSet findItem(String column, String value) throws ClassNotFoundException, SQLException {
        //String sql = "Select * from tblItemMaster where " + column + " like'" + value + "%';";
        String sql = "Select * from Items where " + column + " like'" + value + "%' and Type!='STOCK' AND Visibility = 'Yes' ;";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        return rst;
    }

    public static ArrayList<Item> getItemsWith_common_Coloumns(String column, String value) throws ClassNotFoundException, SQLException {
        ArrayList<Item> itemList = new ArrayList<Item>();
        String sql = "select itemcode," //1
                + "description," //2
                + "printName," //3
                + "Cost," //3
                + "Quantity,"
                + "SellingPrice,"
                + "Reorder_Qty,"
                + "Min_Qty,"
                + "Max_Qty "
                + "from dbo.tblItemMaster where " + column + " like '" + value + "%';";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        Item item;
        while (rst.next()) {
            item = new Item();
            item.setItemCode(rst.getString(1));
            item.setDescription(rst.getString(2));
            item.setPrintName(rst.getString(3));
            item.setCost(rst.getDouble(4));
            item.setQuantity(rst.getInt(5));
            item.setSellingPrice(rst.getDouble(6));
            item.setReorderQty(rst.getInt(7));
            item.setMin_qty(rst.getInt(8));
            item.setMax_qty(rst.getInt(9));
            itemList.add(item);

        }

        return itemList;

    }

    public static ArrayList<Item> find_itemCode_printName_desc(String columnName, String value) throws ClassNotFoundException, SQLException {
        ArrayList<Item> itemList = new ArrayList<Item>();
        String query = "select itemcode," //1
                + "printName," //2
                + "description " // 3                               
                + " from dbo.tblItemMaster where " + columnName + " like '" + value + "%' ;";
        // System.out.println("Query is : "+query);

        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());

        while (result.next()) {
            Item item = new Item();
            item.setItemCode(result.getString(1));
            item.setPrintName(result.getString(2));
            item.setDescription(result.getString(3));
            itemList.add(item);
        }
        return itemList;

    }

    public static Item getItem_With_common_Coloumns(String column, String value) throws ClassNotFoundException, SQLException {

        String sql = "select itemcode," //1
                + "description," //2
                + "printName," //3
                + "Cost," //3
                + "Quantity,"
                + "SellingPrice,"
                + "Reorder_Qty,"
                + "Min_Qty,"
                + "Max_Qty ,"
                + "Sub_Cat1"
                + " from dbo.tblItemMaster where " + column + " like '" + value + "';";
        //System.out.println(sql);
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        Item item = null;
        while (rst.next()) {
            item = new Item();
            item.setItemCode(rst.getString(1));
            item.setDescription(rst.getString(2));
            item.setPrintName(rst.getString(3));
            item.setCost(rst.getDouble(4));
            item.setQuantity(rst.getDouble(5));
            item.setSellingPrice(rst.getDouble(6));
            item.setReorderQty(rst.getInt(7));
            item.setMin_qty(rst.getDouble(8));
            item.setMax_qty(rst.getDouble(9));
            item.setSubCategory(rst.getString(10));
        }

        return item;

    }

    public static int updateItem_commonColomns(Item item) throws ClassNotFoundException, SQLException {
        String query = "update dbo.tblItemMaster SET "
                + "printName = '" + item.getPrintName() + "'," //3
                + "Cost = " + item.getCost() + " ," //3
                + "Quantity = " + item.getQuantity() + ","
                + "SellingPrice = " + item.getSellingPrice() + ","
                + "Reorder_Qty= " + item.getReorderQty() + ","
                + "Min_Qty= " + item.getMin_qty() + ", "
                + "Max_Qty=" + item.getMax_qty() + " ,"
                + "Sub_Cat1='" + item.getSubCategory() + "' "
                + "where itemcode ='" + item.getItemCode() + "';";
        System.out.println("Query : " + query);
        int response = ConnectionControll.setData(query, DBConection.getConnection());
        return response;
    }

    public static Item getItem_ByItemCode(String column, String value) throws ClassNotFoundException, SQLException {
        String sql = "select ItemCode," //1
                + "ItemName," //2
                + "PrintName," //3
                + "PurchasePrice," //3
                + "Quantity,"
                + "SellPrice,"
                + "ReorderQty,"
                + "MinimumQty,"
                + "MaximumQty ,"
                + "SubCategoryCode,"
                + "MinusSell,"
                + "PresentageBillSellPrice"
                + " from Items where " + column + " like '" + value + "' AND Type != 'STOCK' AND Visibility='Yes';";
        //System.out.println(sql);
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        Item item = null;
        if (rst.next()) {
            item = new Item();
            item.setItemCode(rst.getString(1));
            item.setDescription(rst.getString(2));
            item.setPrintName(rst.getString(3));
            item.setCost(rst.getDouble(4));
            item.setQuantity(rst.getDouble(5));
            item.setSellingPrice(rst.getDouble(6));
            item.setReorderQty(rst.getInt(7));
            item.setMin_qty(rst.getDouble(8));
            item.setMax_qty(rst.getDouble(9));
            item.setSubCategory(rst.getString(10));
            item.setMinusSell(rst.getString(11));
            item.setSelling_margin(rst.getDouble(12));
            return item;
        } else {
            return null;
        }

    }
    
     public static ArrayList<Item> getAllItems() throws ClassNotFoundException, SQLException {
         ArrayList<Item> itemList = new ArrayList<Item>();
        String sql = "select ItemCode," //1
                + "ItemName," //2
                + "PrintName," //3
                + "PurchasePrice," //3
                + "Quantity,"
                + "SellPrice,"
                + "ReorderQty,"
                + "MinimumQty,"
                + "MaximumQty ,"
                + "SubCategoryCode,"
                + "MinusSell,"
                + "PresentageBillSellPrice"
                + " from Items WHERE Type != 'STOCK' AND Visibility='Yes';";
        //System.out.println(sql);
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        Item item = null;
        while (rst.next()) {
            item = new Item();
            item.setItemCode(rst.getString(1));
            item.setDescription(rst.getString(2));
            item.setPrintName(rst.getString(3));
            item.setCost(rst.getDouble(4));
            item.setQuantity(rst.getDouble(5));
            item.setSellingPrice(rst.getDouble(6));
            item.setReorderQty(rst.getInt(7));
            item.setMin_qty(rst.getDouble(8));
            item.setMax_qty(rst.getDouble(9));
            item.setSubCategory(rst.getString(10));
            item.setMinusSell(rst.getString(11));
            item.setSelling_margin(rst.getDouble(12));
            itemList.add(item);
           
        } 
         return itemList;
    }

    public static Item getPrintNameCategory(String itemCode) throws ClassNotFoundException, SQLException {
        String query = "Select PrintName,Sub_Cat1 from dbo.tblItemMaster where itemcode ='" + itemCode + "' ";
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        Item item = null;
        while (result.next()) {
            item = new Item();
            item.setPrintName(result.getString(1));
            item.setSubCategory(result.getString(2));
        }
        return item;

    }

    public static double getItemSellingPrice(String itemCode) throws ClassNotFoundException, SQLException {
        String query = "Select sellingprice from tblItemMaster where itemcode ='" + itemCode + "' ";
        ResultSet set = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        double price = -100;
        if (set.next()) {
            price = set.getDouble(1);
        }
        return price;
    }

    public static ArrayList<Item> getItemCodePrice(String itemName) throws ClassNotFoundException, SQLException {
        String query = "select itemcode,sellingprice,printName from tblItemMaster where printname like '" + itemName + "%'";
        ResultSet resultSet = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        ArrayList<Item> itemList = new ArrayList<Item>();
        Item item = null;
        while (resultSet.next()) {
            item = new Item();
            item.setItemCode(resultSet.getString(1));
            item.setSellingPrice(resultSet.getDouble(2));
            item.setPrintName(resultSet.getString(3));
            itemList.add(item);
        }
        return itemList;

    }

    /**
     * Given Item will update with specified quantity..
     *
     * @param item which item to updated.
     * @return 1 if update was successful
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static int updateItemQuantity(Item item) throws ClassNotFoundException, SQLException {
        String query = "UPDATE Items SET  Quantity = '"+item.getQuantity()+"' WHERE ItemCode = '"+item.getItemCode()+"'";
        int response = ConnectionControll.setData(query, DBConection.getConnection());
        return response;

    }

    /**
     * Get current quantity of given tiem code.
     *
     * @param itemCode
     * @return current item quantity default will be -200
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getCurrentQuantityOfThisItem(String itemCode) throws ClassNotFoundException, SQLException {
        String query = "select Quantity from Items where  ItemCode like '" + itemCode + "' ";
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        double quantity = -200;
        if (result.next()) {
            quantity = result.getDouble(1);
        }
        return quantity;

    }

    /**
     * This method is used to retrieve current quantity of an item form
     * tblItemMaster
     *
     * @param item whose quantity to be looked for.
     * @return quantity of an item.
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static int getCurrentQtyForThisItem(Item item) throws ClassNotFoundException, SQLException {
        int currentQty = 0;
        String query = "SELECT [Quantity]      \n"
                + "  FROM [tblItemMaster]"
                + "  WHERE [ItemCode] = '" + item.getItemCode() + "' ";
        System.out.println("Query current quantity : " + query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        while (result.next()) {
            currentQty = result.getInt("Quantity");
        }
        System.out.println("Current Quantity : " + currentQty);
        return currentQty;
    }

    /**
     * Get location code for given itemCode.
     * @param itemCode whose location to be found.
     */
    public static String getLocationForThisItem(String itemCode) throws SQLException, ClassNotFoundException {
        String query = "SELECT [LocCode]      \n"
                + "  FROM [tblItemMaster]\n"
                + "Where  ItemCode like '"+itemCode+"' ";
        System.out.println("Loce code for itemcode : "+query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        String locationCode = "";
        if (result.next()) {
            locationCode = result.getString("LocCode");
        }
        return locationCode;
    }    
}