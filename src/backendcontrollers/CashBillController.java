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
import model.CashBill;

/**
 *
 * @author Sameera
 */
public class CashBillController {

    public static ArrayList<CashBill> getAllCashBills() throws ClassNotFoundException, SQLException {
        ArrayList<CashBill> cashBillList = new ArrayList();
        String sql = "SELECT \n"
                + "      InvoiceNo\n"
                + "      ,TrnDate\n"
                + "      ,CashBillNo\n"
                + "      ,ValidDate\n"
                + "      ,Amount\n"
                + "      ,Create_user\n"
                + "      ,Settle\n"
                + "  FROM CashBill WHERE Settle = 0 ";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        CashBill cashBill = null;
        while (rst.next()) {
            cashBill = new CashBill();
            cashBill.setCashBillNo(rst.getString("CashBillNo"));
            cashBill.setInvoiceNo(rst.getString("InvoiceNo"));
            cashBill.setTrnDate(rst.getString("TrnDate"));
            cashBill.setUser(rst.getString("Create_user"));
            cashBill.setSettle(rst.getInt("Settle"));
            cashBill.setAmount(rst.getDouble("Amount"));
            cashBillList.add(cashBill);
        }
        return cashBillList;
    }

    public static int updateCashBillStatus(CashBill cashBill) throws ClassNotFoundException, SQLException {
        String query = "UPDATE CashBill SET Settle =" + cashBill.getSettle() + "  WHERE CashBillNo = '" + cashBill.getCashBillNo() + "' ";
        int response = ConnectionControll.setData(query, DBConection.getConnection());
        return response;
    }

    public static ArrayList<CashBill> searchCashBills(String searchText) throws ClassNotFoundException, SQLException {
        ArrayList<CashBill> cashBillList = new ArrayList();
        String sql = "SELECT \n"
                + "      InvoiceNo\n"
                + "      ,TrnDate\n"
                + "      ,CashBillNo\n"
                + "      ,ValidDate\n"
                + "      ,Amount\n"
                + "      ,Create_user\n"
                + "      ,Settle\n"
                + "  FROM CashBill WHERE CashBillNo LIKE '" + searchText + "%' AND Settle = 0 ";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        CashBill cashBill = null;
        while (rst.next()) {
            cashBill = new CashBill();
            cashBill.setCashBillNo(rst.getString("CashBillNo"));
            cashBill.setInvoiceNo(rst.getString("InvoiceNo"));
            cashBill.setTrnDate(rst.getString("TrnDate"));
            cashBill.setUser(rst.getString("Create_user"));
            cashBill.setSettle(rst.getInt("Settle"));
            cashBill.setAmount(rst.getDouble("Amount"));
            cashBillList.add(cashBill);
        }
        return cashBillList;
    }

    public static int InsertNewCashBIll(CashBill cashBill) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO CashBill\n"
                + "           (InvoiceNo\n"
                + "           ,TrnDate\n"
                + "           ,CashBillNo\n"
                + "           ,Amount\n"
                + "           ,Create_user\n"
                + "           ,Settle)\n"
                + "     VALUES ('" + cashBill.getInvoiceNo() + "','" + cashBill.getTrnDate() + "','" + cashBill.getCashBillNo() + "',"
                + "             " + cashBill.getAmount() + ",'" + cashBill.getUser() + "','" + cashBill.getSettle() + "')";

        int response = ConnectionControll.setData(query, DBConection.getConnection());
        return response;
    }

    public static boolean isHasGenaratedCashBill(String orderId) throws ClassNotFoundException, SQLException {

        boolean isHas = false;
        String sql = "SELECT \n"
                + "      InvoiceNo\n"
                + "      ,TrnDate\n"
                + "      ,CashBillNo\n"
                + "      ,ValidDate\n"
                + "      ,Amount\n"
                + "      ,Create_user\n"
                + "      ,Settle\n"
                + "  FROM CashBill WHERE InvoiceNo LIKE '" + orderId + "%' AND Settle = 0 ";
        System.out.println(sql);
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        if (rst.next()) {
            isHas = true;
        }
        return isHas;

    }

}
