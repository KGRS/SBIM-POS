/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendcontrollers;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import java.sql.SQLException;
import model.Refund;
import model.RefundItems;

/**
 *
 * @author Sameera
 */
public class RefundController {

    public static int insertRefundDetail(Refund refund) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO RefundSale\n"
                + "           (RefundId\n"
                + "           ,Refund_from\n"
                + "           ,Refund_Total\n"
                + "           ,Refund_user\n"
                + "           ,RefundLocation\n"
                + "           ,RefundDate)"
                + "     VALUES\n"
                + "           ('" + refund.getRefund_id() + "','" + refund.getRefund_from() + "'," + refund.getRefund_amount() + ",'" + refund.getRefund_user() + "','" + refund.getRefund_cashierPoint() + "','" + refund.getRefund_date() + "')";
        System.out.println(query);
        int result = ConnectionControll.setData(query, DBConection.getConnection());
        return result;
    }

    public static int insertRefundItems(RefundItems refundItems) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO RefundSaleItems\n"
                + "           (RefundId\n"
                + "           ,ItemCode\n"
                + "           ,Description\n"
                + "           ,SellingPrice\n"
                + "           ,Quantity\n"
                + "           ,Total"
                + "           ,Return_reason)\n"
                + "     VALUES\n"
                + "           ('" + refundItems.getRefund_id() + "','" + refundItems.getItemCode() + "','" + refundItems.getDescription() + "',"
                + "            '" + refundItems.getSellingPrice() + "','" + refundItems.getQty() + "','" + refundItems.getTotal() + "','"+refundItems.getReason()+"')";
        System.out.println(query);
        int result = ConnectionControll.setData(query, DBConection.getConnection());
        return result;
    }

}
