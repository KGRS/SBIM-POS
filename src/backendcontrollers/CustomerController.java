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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author Administrator
 */
public class CustomerController {

    public static ArrayList<Customer> searchCustomer(String column, String value) throws ClassNotFoundException, SQLException {
        ArrayList<Customer> customerList = new ArrayList();
        String sql = "SELECT CustomerCode,\n"
                + "CustomerName,\n"
                + "CreditLimit,\n"
                + "Address1,\n"
                + "Address2,\n"
                + "Telephone1,\n"
                + "Mobile1,\n"
                + "Active \n"
                + "FROM Customers WHERE " + column + " LIKE '" + value + "%' AND Active='1' ";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        Customer customer;
        while (rst.next()) {
            customer = new Customer();
            customer.setCus_code(rst.getString(1));
            customer.setCus_name(rst.getString(2));
            customer.setCeditLimit(rst.getDouble(3));
            customer.setCus_address1(rst.getString(4));
            customer.setTelNo1(rst.getString(6));
            customer.setMobileNo1(rst.getString(7));
            customerList.add(customer);
        }
        return customerList;

    }

    public static ArrayList<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> customerList = new ArrayList();
        String sql = "SELECT [CustomerCode]\n"
                + "      ,[CustomerName]\n"
                + "      ,[CreditLimit]\n"
                + "      ,[Address1]\n"
                + "      ,[Address2]\n"
                + "      ,[Telephone1]\n"
                + "      ,[Telephone2]\n"
                + "      ,[Mobile1]\n"
                + "      ,[Mobile2]\n"
                + "      ,[Email]\n"
                + "      ,[Fax]\n"
                + "      ,[ContactPerson]\n" 
                +"      ,[Active]\n"
                + "FROM Customers WHERE Active='1' ";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        Customer customer;
        while (rst.next()) {
            customer = new Customer();
            customer.setCus_code(rst.getString(1));
            customer.setCus_name(rst.getString(2));
            customer.setCeditLimit(rst.getDouble(3));
            customer.setCus_address1(rst.getString(4));
            customer.setCus_address2(rst.getString(5));
            customer.setTelNo1(rst.getString(6));
            customer.setTelNo2(rst.getString(7));
            customer.setMobileNo1(rst.getString(8));
            customer.setMobileNo2(rst.getString(9));
            customer.setEmail(rst.getString(10));
            customer.setFax(rst.getString(11));
            customer.setContactPerson(rst.getString(12));
            customer.setActive(rst.getInt(13));
            
            customerList.add(customer);
        }
        return customerList;
    }

    public static double getCustomerTotalOustandingAmount(Customer customer) {
        double totalOustanding = 0.00;
        try {
            String query = "SELECT SUM (DueAmount) as total FROM CreditInvoice WHERE CustomerCode = '" + customer.getCus_code() + "' AND Status != '1'";
            ResultSet rst = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
            if (rst.next()) {
                totalOustanding = rst.getDouble("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalOustanding;
    }

    public static int insertCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO Customers\n"
                + "           (CustomerCode\n"
                + "           ,CustomerName\n"
                + "           ,CreditLimit\n"
                + "           ,Address1\n"
                + "           ,Address2\n"
                + "           ,Telephone1\n"
                + "           ,Telephone2\n"
                + "           ,Mobile1\n"
                + "           ,Mobile2\n"
                + "           ,Email\n"
                + "           ,Fax\n"
                + "           ,ContactPerson\n"
                + "           ,Active)\n"
                + "     VALUES\n"
                + "           ('"+customer.getCus_code()+"','"+customer.getCus_name()+"','"+customer.getCeditLimit()+"',"
                + "'"+customer.getCus_address1()+"','"+customer.getCus_address2()+"','"+customer.getTelNo1()+"','"+customer.getTelNo2()+"',"
                + "'"+customer.getMobileNo1()+"','"+customer.getMobileNo2()+"','"+customer.getEmail()+"','"+customer.getFax()+"',"
                + "'"+customer.getContactPerson()+"','"+customer.getActive()+"')";
        int result = ConnectionControll.setData(query, DBConection.getConnection());
        return result;

    }

}
