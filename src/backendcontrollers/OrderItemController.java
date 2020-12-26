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
import model.OrderItems;

/**
 *
 * @author TiVA
 */
public class OrderItemController {

    public static ArrayList<OrderItems> findThisOrder(String orderid) throws ClassNotFoundException, SQLException {
        ArrayList<OrderItems> list = new ArrayList<OrderItems>();
        String query = "SELECT Order_Id\n"
                + "      ,ItemCode\n"
                + "      ,ItemName\n"
                + "      ,Qty\n"
                + "      ,SellPrice\n"
                + "      ,Discount\n"
                + "      ,Total\n"
                + "      ,TotalWithDiscount\n"
                + "      ,Status\n"
                + "  FROM OrderDetails WHERE Order_Id like '" + orderid + "' AND Status != '2'";
        

        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        OrderItems items = null;
        while (result.next()) {
            items = new OrderItems();
            items.setOrderId(result.getString(1));
            items.setItemCode(result.getString(2));
            items.setItemName(result.getString(3));
            items.setItemQty(result.getInt(4));
            items.setItemPrice(result.getDouble(5));
            items.setItemDiscount(result.getDouble(6));
            items.setTotalValue(result.getDouble(7));
            items.setTotalValueWithDiscount(result.getDouble(8));
            items.setItemStatus(result.getInt(9));
            list.add(items);
        }
        return list;
    }

    public static int addThisOrder(OrderItems order) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO [OrderDetails]\n"
                + "           ([order_id]\n"
                + "           ,[ItemCode]\n"
                + "           ,[ItemName]\n"
                + "           ,[Qty]\n"
                + "           ,[SellPrice]\n"
                + "           ,[Discount]\n"
                + "           ,[Total]\n"
                + "           ,[TotalWithDiscount]\n"
                + "           ,[Status]\n"
                + "           ,[Discount_remark]"
                + "           ,[Trn_date])\n"
                + "     VALUES\n"
                + "           ('" + order.getOrderId() + "'\n"
                + "           ,'" + order.getItemCode() + "'\n"
                + "           ,'" + order.getItemName() + "'\n"
                + "           ," + order.getItemQty() + "\n"
                + "           ," + order.getItemPrice() + "\n"
                + "           ," + order.getItemDiscount() + "\n"
                + "           ," + order.getTotalValue() + "\n"
                + "           ," + order.getTotalValueWithDiscount() + "\n"
                + "           ," + order.getItemStatus() + ""
                + "           ,'" + order.getDiscount_remark() + "'\n"
                + "           ,'" + order.getTrn_date() + "'  )";
        System.out.println("OrderItem insert Query : " + query);
        int response = ConnectionControll.setData(query, DBConection.getConnection());
        return response;

    }

    public static int setItemStatus(OrderItems order, int status) throws ClassNotFoundException, SQLException {
        String query2 = "update tblOrderitems set item_status = " + status + "   "
                + " WHERE order_id = '" + order.getOrderId() + "' AND "
                + " item_code   ='" + order.getItemCode() + "' AND "
                + " item_qty    = " + order.getItemQty() + " AND "
                + " item_price  =" + order.getItemPrice() + "  AND "
                + "item_status = " + order.getItemStatus() + ";";

        System.out.println("Query(Item update) : " + query2);

        int response = ConnectionControll.setData(query2, DBConection.getConnection());
        return response;

    }

    public static int getItemQuantity(OrderItems order) throws ClassNotFoundException, SQLException {
        String query = " select item_qty from tblOrderItems where "
                + "order_id ='" + order.getOrderId() + "' and "
                + "item_code   = '" + order.getItemCode() + "' and "
                + "item_price  = " + order.getItemPrice() + " and "
                + "item_status = " + order.getItemStatus() + ";   ";
        System.out.println("Query : " + query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        int quantity = -100;
        if (result.next()) {
            quantity = result.getInt(1);
        }

        return quantity;
    }

    public static int getQuanityOfThisItem(OrderItems order) throws ClassNotFoundException, SQLException {
        String query = "select item_qty from tblOrderItems where order_id = '" + order.getOrderId() + "' "
                + " and item_code =  '" + order.getItemCode() + "'  and item_price =" + order.getItemPrice() + " "
                + " and item_status = 0 ;";

        System.out.println("Query(get item Quanitty) : " + query);

        ResultSet data = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        int quantity = -100;
        if (data.next()) {
            quantity = data.getInt(1);
        }
        return quantity;
    }

    public static int updateItemQuatity(OrderItems order, int oldQuantiy) throws ClassNotFoundException, SQLException {
        String query = "update tblOrderItems set "
                + " item_qty = " + order.getItemQty() + "  "
                + " where "
                + " order_id = '" + order.getOrderId() + "' and "
                + " item_code = '" + order.getItemCode() + "' and "
                + " item_price = " + order.getItemPrice() + " and "
                + " item_qty=" + oldQuantiy + " and "
                + " item_status=" + order.getItemStatus() + " ; ";
        System.out.println("Query(itemQuantity) : " + query);
        int setData = ConnectionControll.setData(query, DBConection.getConnection());
        return setData;

    }

    /**
     *
     *
     * @param orderItems
     * @return object array which include a boolean as first index of array if
     * boolean was true 2nd index of array indicates that Specified OrderItems
     * is inside.
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Object[] isThisItemAlreadyRefunded(OrderItems orderItems) throws ClassNotFoundException, SQLException {
        String query = "SELECT order_id,item_code,item_price,item_qty,item_status  FROM  tblOrderItems WHERE "
                + "order_id = '" + orderItems.getOrderId() + "' AND "
                + "item_code ='" + orderItems.getItemCode() + "'  AND "
                + "item_price = " + orderItems.getItemPrice() + " AND "
                + "item_status = " + orderItems.getItemStatus() + " ;";
        System.out.println("Query(itemAlreadyRefunded ) : " + query);
        OrderItems or = null;
        boolean itemExist = false;

        ResultSet result = ConnectionControll.getDataAsViewableandUpdatele(query, DBConection.getConnection());
        if (result.next()) {
            itemExist = true;
            or = new OrderItems();
            or.setOrderId(result.getString(1));
            or.setItemCode(result.getString(2));
            or.setItemPrice(result.getDouble(3));
            or.setItemQty(result.getInt(4));
            or.setItemStatus(result.getInt(5));
        }

        Object[] data = new Object[2];
        data[0] = itemExist;
        data[1] = or;
        return data;
    }

    public static int updateItemQuantity(OrderItems items) throws ClassNotFoundException, SQLException {
        String query = " update tblOrderitems set item_qty = " + items.getItemQty() + " WHERE "
                + "order_id    = '" + items.getOrderId() + "'   AND "
                + "item_code   = '" + items.getItemCode() + "'  AND "
                + "item_price  =  " + items.getItemPrice() + "  AND "
                + "item_status =  " + items.getItemStatus() + ";  ";

        System.out.println("Query(update Item quantity ) : " + query);
        int setData = ConnectionControll.setData(query, DBConection.getConnection());
        return setData;
    }

    public static int getNo_ofItemsForThisOrder(String orderId) throws ClassNotFoundException, SQLException {
        String query = "select  count(item_code) from tblOrderItems where order_id ='" + orderId + "';";
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        int count = -1;
        if (result.next()) {
            count = result.getInt(1);
        }
        return count;
    }

    public static int deleteThisOrderItem(OrderItems orderItems) throws ClassNotFoundException, SQLException {
        String query = "delete from tblOrderItems where "
                + " order_id ='" + orderItems.getOrderId() + "' AND "
                + " item_code = '" + orderItems.getItemCode() + "' AND "
                + " item_qty= " + orderItems.getItemQty() + " AND "
                + " Item_price = " + orderItems.getItemPrice() + " and "
                + " item_status= " + orderItems.getItemStatus() + " ;";
        System.out.println("Query(Delete) : " + query);
        int setData = ConnectionControll.setData(query, DBConection.getConnection());
        return setData;

    }

    /**
     * This method is using when whole order is refunded.
     *
     * @param order which order to refund include with Order_Id and
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static int setItemStatus(OrderItems order) throws ClassNotFoundException, SQLException {
        String query2 = "update tblOrderitems set item_status = 2   "
                + "where order_id = '" + order.getOrderId() + "' AND item_code ='" + order.getItemCode() + "' ";

        System.out.println("Query(Item update) : " + query2);

        int response = ConnectionControll.setData(query2, DBConection.getConnection());
        return response;

    }

    /**
     * By calling this method,total quantity of (not refunded) item will for
     * specific given order id.
     *
     * @param orderID which order to be found total amount form
     * @return total Amount of Quantity for not refunded items.
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getRefundTotalForThisOrder(String orderID) throws ClassNotFoundException, SQLException {
        double refundTotal = -100;
        String query = "SELECT SUM(Total) AS total_Refunded "
                + " FROM OrderDetails\n"
                + " WHERE Order_Id = '" + orderID + "' AND Status = 2;";
        System.out.println("Query(Total not refunded) : " + query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        while (result.next()) {
            refundTotal = result.getInt("total_Refunded");
        }
        System.out.println("Total Total not refunded  : " + refundTotal);
        return refundTotal;
    }

    public static ArrayList<OrderItems> getAllItem() throws ClassNotFoundException, SQLException {
        ArrayList<OrderItems> list = new ArrayList<OrderItems>();
        String query = "SELECT Order_Id\n"
                + "      ,ItemCode\n"
                + "      ,ItemName\n"
                + "      ,Qty\n"
                + "      ,SellPrice\n"
                + "      ,Discount\n"
                + "      ,Total\n"
                + "      ,TotalWithDiscount\n"
                + "      ,Status\n"
                + "  FROM OrderDetails WHERE  Status != '2'";

        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        OrderItems items = null;
        while (result.next()) {
            items = new OrderItems();
            items.setOrderId(result.getString(1));
            items.setItemCode(result.getString(2));
            items.setItemName(result.getString(3));
            items.setItemQty(result.getInt(4));
            items.setItemPrice(result.getDouble(5));
            items.setItemDiscount(result.getDouble(6));
            items.setTotalValue(result.getDouble(7));
            items.setTotalValueWithDiscount(result.getDouble(8));
            items.setItemStatus(result.getInt(9));
            list.add(items);
        }
        return list;
    }

    public static int updateRefundItems(OrderItems items) throws ClassNotFoundException, SQLException {
        String query = " UPDATE OrderDetails\n"
                + "   SET Status = '" + items.getItemStatus() + "'   \n"               
                + " WHERE  Order_Id ='" + items.getOrderId() + "'\n"
                + "      AND ItemCode ='" + items.getItemCode() + "'\n"
                + "      AND SellPrice ='" + items.getItemPrice() + "' ";

        System.out.println("Query(update Item quantity ) : " + query);
        int setData = ConnectionControll.setData(query, DBConection.getConnection());
        return setData;

    }

}
