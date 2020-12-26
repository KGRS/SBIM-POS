/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backendcontrollers;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import model.Company;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Controller for tblLicense.
 *
 * @author TiVA
 */
public class CompanyController {

    /**
     * Retrieving company information. 
     * 
     * @throws SQLException 
     */
    public static Company getCompanyInfor() throws SQLException, ClassNotFoundException  {
        String query = "SELECT [Com_name]\n"
                + "      ,[Address]\n"
                + "      ,[Telephone]\n"
                + "      ,[Email]\n"
                + "      ,[VATRegistrationNo]\n"
               // + "      ,[Fax]\n"
                + "  FROM tblLicense";
        System.out.println("company query : "+query);
        ResultSet data = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        Company com = null;
        if (data.next()) {
            com = new Company();
            com.setCompanyName(data.getString(1));
            com.setAddres(data.getString(2));
            com.setTelephoneNo(data.getString(3));
            com.setEmail(data.getString(4));
            com.setVatRegistrationNo(data.getString(5));
           // com.setFax(data.getString("Fax"));
        }
        return com;
    }
    
   
}
