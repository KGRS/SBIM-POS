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
import model.OtherPaymentType;
import model.OtherPayments;

/**
 *
 * @author Sameera
 */
public class OtherPaymentTypeController {

    public static ArrayList<OtherPaymentType> getAll() throws ClassNotFoundException, SQLException {
        ArrayList<OtherPaymentType> itemList = new ArrayList<OtherPaymentType>();
        String sql = "SELECT Description FROM ExpensesTypes";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        OtherPaymentType type;
        while (rst.next()) {
            type = new OtherPaymentType();
            type.setDescription(rst.getString("Description"));
            itemList.add(type);
        }
        return itemList;
    }

    public static int insertNew(OtherPaymentType expenssType) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO ExpensesTypes (Description,Remark)VALUES ('" + expenssType.getDescription() + "','" + expenssType.getRemark() + "')";
        System.out.println(query);
        int result = ConnectionControll.setData(query, DBConection.getConnection());
        return result;
    }
    
    public static ArrayList<OtherPayments> getAllTransactions() throws ClassNotFoundException, SQLException {
        ArrayList<OtherPayments> list = new ArrayList<OtherPayments>();
        String sql = "SELECT pay_id,description,Pay_date,Amount FROM OtherExpensesPayments ORDER BY Pay_date desc";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        OtherPayments payments;
        while (rst.next()) {
            payments = new OtherPayments();
            payments.setId(rst.getInt("pay_id"));
            payments.setDescription(rst.getString("description"));
            payments.setDate(rst.getString("Pay_date"));
            payments.setAmount(rst.getDouble("Amount"));
            list.add(payments);
        }
        return list;
    }
}
