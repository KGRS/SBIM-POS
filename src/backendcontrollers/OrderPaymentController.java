/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package backendcontrollers;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import java.net.NoRouteToHostException;
import java.sql.SQLException;
import model.OrderPayment;

/**
 *
 * @author Administrator
 */
public class OrderPaymentController {


    public static int insertOrderPayment(OrderPayment  payment) throws ClassNotFoundException, SQLException {
        String query = "insert into OrderPayments ("              
                + "order_id,"
                + "payment_type,"
                + "pay_amount,"
                + "CashBillNo,"
                + "CreditTo"
                + ")"
                + "values('"+payment.getOrderID()+"','"+payment.getPaymentType()+"',"+payment.getAmount()+","
                + "'"+payment.getCashBillNo()+"','"+payment.getCreditTo()+"')";
                
        System.out.println(query);
        int result = ConnectionControll.setData(query, DBConection.getConnection());

        return result;
    }

}
