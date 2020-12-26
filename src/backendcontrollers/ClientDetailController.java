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
import model.Client;

/**
 *
 * @author Sameera
 */
public class ClientDetailController {

    public static Client getClientDetail() throws ClassNotFoundException, SQLException {
        String sql = "SELECT Companyname\n"
                + "      ,Address\n"
                + "      ,Telephone1\n"
                + "      ,Telephone2\n"
                + "      ,Fax\n"
                + "      ,Email\n"
                + "      ,Web\n"
                + "      ,VATRegistrationNo\n"
                + "  FROM ClientCompany";
        ResultSet rst = ConnectionControll.getDataAsViewable(sql, DBConection.getConnection());
        Client client = new Client();
        if (rst != null) {
            while (rst.next()) {
                 client = new Client();
                client.setClientName(rst.getString("Companyname"));
                client.setAddress(rst.getString("Address"));
                client.setEmail(rst.getString("Email"));
                client.setTel1(rst.getString("Telephone1"));
                client.setTel2(rst.getString("Telephone2"));
                client.setFax(rst.getString("Fax"));
                client.setWebAddress(rst.getString("Web"));
                client.setTel1(rst.getString("Telephone1"));
            }
            return client;
        } else {
            return null;
        }
    }

}
