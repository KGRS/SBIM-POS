/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendcontrollers;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OtherPayments;

/**
 *
 * @author Sameera
 */
public class OtherPaymentController {

    public static int insertOrderPayment(OtherPayments payment) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO OtherExpensesPayments \n"
                + "           (Pay_Type,description,Pay_date,Pay_Time,Amount,UserName,Remark) VALUES\n"
                + "           ('" + payment.getType() + "','" + payment.getDescription() + "','" + payment.getDate() + "','" + payment.getTime() + "',"
                + "'" + payment.getAmount() + "','" + payment.getUser() + "','" + payment.getRemark() + "')";

        System.out.println(query);
        int result = ConnectionControll.setData(query, DBConection.getConnection());
        return result;
    }

    public static int deleteTransaction(OtherPayments payments) {
        int setData = 0;
        try {
            String query = "DELETE FROM OtherExpensesPayments\n"
                    + "      WHERE pay_id = '" + payments.getId() + "'";
            setData = ConnectionControll.setData(query, DBConection.getConnection());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OtherPaymentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OtherPaymentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return setData;
    }

    public static OtherPayments gettranactionDetail(OtherPayments payment) {
        OtherPayments payments = null;
        try {
            String query = "SELECT pay_id ,Pay_Type ,description ,Pay_date ,Amount,Remark\n"
                    + "  FROM OtherExpensesPayments WHERE pay_id = " + payment.getId() + " ";

            System.out.println("query :" + query);
            ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
            if (result.next()) {
                payments = new OtherPayments();
                payments.setDescription(result.getString("description"));
                payments.setType(result.getString("Pay_Type"));
                payments.setDate(result.getString("Pay_date"));
                payments.setAmount(result.getDouble("Amount"));
                payments.setRemark(result.getString("Remark"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(OtherPaymentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OtherPaymentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return payments;
    }

    public static int updateDetails(OtherPayments payments) {
        int response = -1;
        try {
            String query = "UPDATE OtherExpensesPayments\n"
                    + "   SET \n"
                    + "   Pay_Type = '" + payments.getType() + "'\n"
                    + "   ,description = '" + payments.getDescription() + "'\n"
                    + "   ,Pay_date = '" + payments.getDate() + "'      \n"
                    + "   ,Amount = " + payments.getAmount() + "   \n"
                    + "   ,Remark = '" + payments.getRemark() + "'\n"
                    + " WHERE pay_id = '" + payments.getId() + "' ";
            response = ConnectionControll.setData(query, DBConection.getConnection());
            return response;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OtherPaymentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OtherPaymentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
}
