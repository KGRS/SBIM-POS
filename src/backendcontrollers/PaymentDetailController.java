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
import model.PaymentDetail;

/**
 *
 * @author Administrator
 */
public class PaymentDetailController {

    public static int insertPaymentDetail(PaymentDetail detail) throws ClassNotFoundException, SQLException{
        String query = "insert into tblPaymentDetails ("
                + "payment_id,"
                + "card_holderName,"
                + "card_number,"
                + "card_expDate,"
                + "card_type,"
                + "card_bank"
                + ")"
                + "values('" + detail.getPaymentID() + "','" + detail.getCardHolderName() + "',"
                + "'" + detail.getCardNumber() + "','" + detail.getCardExpireDate() + "','" + detail.getCardType() + "','" + detail.getCardBank() + "')";
        System.out.println(query);
        int result = ConnectionControll.setData(query, DBConection.getConnection());

        return result;
    }
    
    public static ArrayList<String> getPaymentType() throws SQLException, ClassNotFoundException{
        ArrayList<String> paymentTypeList = new ArrayList<String>();
        String query ="SELECT TypeId,PaymentType  FROM PaymentType";
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        if (result != null) {
            while (result.next()) {                
                paymentTypeList.add(result.getString("PaymentType"));
            }            
        }
        return paymentTypeList;
    }
}
