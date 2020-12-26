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
import model.OrderDetail;

/**
 *
 * @author Administrator
 */
public class OrderDetailController {

    public static int insertOredrDetail(OrderDetail orderDetail) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO [Orders]\n"
                + "           ([order_id]\n"
                + "           ,[user_id]\n"
                + "           ,[location]\n"
                + "           ,[order_date]\n"
                + "           ,[order_discount]\n"
                + "           ,[Sub_Total]\n"
                + "            ,[Grand_Total]\n"
                + "           ,[paid_amount]\n"
                + "           ,[itemCount]\n"
                + "           ,[order_status]\n"
                + "           ,[remark]\n"
                + "            ,[discount_remark])\n            "
                + "     VALUES\n"
                + "           ('" + orderDetail.getOrderID() + "'\n"
                + "           ,'" + orderDetail.getUserID() + "'\n"
                + "           ,'" + orderDetail.getLocation() + "'\n"
                + "           ,'" + orderDetail.getOrderDate() + "'\n"
                + "           ," + orderDetail.getOrderDiscount() + "\n"
                + "           ," + orderDetail.getSubTotal() + "\n"
                + "           ," + orderDetail.getGrandTotal() + "\n"
                + "           ," + orderDetail.getPaidAmount() + "\n"
                + "           ," + orderDetail.getItemCount() + "\n"
                + "           ," + orderDetail.getOrderStatus() + "\n"
                + "           ,'" + orderDetail.getRemarks() + "'\n"
                + "           ,'" + orderDetail.getDiscountRemark() + "')";
        System.out.println(query);
        int result = ConnectionControll.setData(query, DBConection.getConnection());
        return result;
    }

    public static ArrayList<OrderDetail> getThisOrder(OrderDetail orderDetail) throws ClassNotFoundException, SQLException {
        ArrayList<OrderDetail> list = new ArrayList<OrderDetail>();
        String query = "Select user_id,order_dateTime,order_amount,order_status,order_id "
                + "from Orders where order_id like  '" + orderDetail.getOrderID() + "%'";
        // System.out.println("Query : " + query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        OrderDetail order = null;
        while (result.next()) {
            order = new OrderDetail();

            order.setUserID(result.getString(1));
            order.setOrderDate(result.getString(2));
            order.setGrandTotal(result.getDouble(3));
            order.setOrderStatus(result.getInt(4));
            order.setOrderID(result.getString(5));
            list.add(order);
        }
        return list;
    }

    public static int getOrderStatus(String orderId) throws ClassNotFoundException, SQLException {
        String query = "select order_status from Orders where order_id ='" + orderId + "' ";
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        int respons = -1;
        if (result.next()) {
            respons = result.getInt(1);
        }
        return respons;
    }

    public static int setOrderStatus(OrderDetail detail) throws ClassNotFoundException, SQLException {
        String query = "UPDATE  Orders set order_status = " + detail.getOrderStatus() + ",Refund_total = " + detail.getRefundTotal() + "  "
                + "  where order_id = '" + detail.getOrderID() + "'  ";
        System.out.println("Query : " + query);
        int response = ConnectionControll.setData(query, DBConection.getConnection());
        return response;

    }

    public static ArrayList<OrderDetail> getAllOrders() throws ClassNotFoundException, SQLException {
        ArrayList<OrderDetail> list = new ArrayList<OrderDetail>();
        String query = "SELECT order_id\n"
                + "      ,user_id\n"
                + "      ,location\n"
                + "      ,order_date\n"
                + "      ,order_discount\n"
                + "      ,Sub_Total\n"
                + "      ,Grand_Total\n"
                + "      ,paid_amount\n"
                + "      ,itemCount\n"
                + "      ,order_status\n"
                + "      ,remark\n"
                + "  FROM Orders WHERE order_status != '3' ";
        // System.out.println("Query : " + query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        OrderDetail order = null;
        while (result.next()) {
            order = new OrderDetail();
            order.setOrderID(result.getString(1));
            order.setUserID(result.getString(2));
            order.setLocation(result.getString(3));
            order.setOrderDate(result.getString(4));
            order.setOrderDiscount(result.getDouble(5));
            order.setSubTotal(result.getDouble(6));
            order.setGrandTotal(result.getDouble(7));
            order.setPaidAmount(result.getDouble(8));
            order.setItemCount(result.getInt(9));
            order.setOrderStatus(result.getInt(10));
            order.setRemarks(result.getString(11));
            list.add(order);
        }
        return list;
    }

    public static ArrayList<OrderDetail> searchOrders(String value, String searchBy) throws ClassNotFoundException, SQLException {
        ArrayList<OrderDetail> list = new ArrayList<OrderDetail>();
        String query = null;

        if (searchBy.equals("order_id")) {
            query = "SELECT order_id\n"
                    + "      ,user_id\n"
                    + "      ,location\n"
                    + "      ,order_date\n"
                    + "      ,order_discount\n"
                    + "      ,Sub_Total\n"
                    + "      ,Grand_Total\n"
                    + "      ,paid_amount\n"
                    + "      ,itemCount\n"
                    + "      ,order_status\n"
                    + "      ,remark\n"
                    + "  FROM Orders WHERE " + searchBy + " LIKE '" + value + "%' AND order_status != '3' ";
        } else {
              query = "SELECT order_id\n"
                + "      ,user_id\n"
                + "      ,location\n"
                + "      ,order_date\n"
                + "      ,order_discount\n"
                + "      ,Sub_Total\n"
                + "      ,Grand_Total\n"
                + "      ,paid_amount\n"
                + "      ,itemCount\n"
                + "      ,order_status\n"
                + "      ,remark\n"                
                + "  FROM Orders WHERE order_date = '"+value+"' AND order_status != '3' ";
        }

        System.out.println("Query search order : " + query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        OrderDetail order = null;
        while (result.next()) {
            order = new OrderDetail();
            order.setOrderID(result.getString(1));
            order.setUserID(result.getString(2));
            order.setLocation(result.getString(3));
            order.setOrderDate(result.getString(4));
            order.setOrderDiscount(result.getDouble(5));
            order.setSubTotal(result.getDouble(6));
            order.setGrandTotal(result.getDouble(7));
            order.setPaidAmount(result.getDouble(8));
            order.setItemCount(result.getInt(9));
            order.setOrderStatus(result.getInt(10));
            order.setRemarks(result.getString(11));
            list.add(order);
        }
        return list;
    }

    public static double getOrderDiscount(String orderId) throws ClassNotFoundException, SQLException {
        String query = "SELECT order_discount FROM Orders WHERE order_id = '" + orderId + "' ";
        double discount = 0;
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        if (result.next()) {
            discount = result.getDouble("order_discount");
        }
        return discount;
    }
}
