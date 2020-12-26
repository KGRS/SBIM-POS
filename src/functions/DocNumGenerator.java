/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package functions;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import db.ConnectSql;
import java.net.NoRouteToHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thushara
 */
public class DocNumGenerator {

    private int DocNumber;
    private String DocChr,mode;


    public void methodNumGen(String docType) throws SQLException{

    /*
    * tblName = name of the number generator table - currently used one table for all number generations
    * as    tblDocCodeGenerator
    * Status = 1 then get available value of PR code  * PRStatus = 2 then update ++
    * docType = PO / PR/ GRN / Event Code to search the particuler record from table..
    * DocNumber = document number from the number generator table (only digits)(ie AutoCode or ManualCode)
    * DocChr = Document start charactors
    * DocDetails = details of the document.
    * formName = currently use form Name
    *
    */
        try {
            //ConnectSql.conect();

//            java.sql.Statement stmt = ConnectSql.conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
//            ResultSet rset = stmt.executeQuery("Select * from tblDocCodeGenerator where DocType='"+docType+"'");
            String query1 = "Select * from SystemAutoCodes where DocType='"+docType+"'";
            ResultSet rset = ConnectionControll.getDataAsViewableandUpdatele(query1, DBConection.getConnection());

            if (!rset.next()) {
                String query    =   "Insert into SystemAutoCodes (AutoCode,AutoStartChr,DocType) Values ('1001','"+docType+"','"+docType+"')";
                Connection connection = DBConection.getConnection();
                Statement stmt = connection.createStatement();
                stmt.execute(query);
                DocNumber   =   1000;
                DocChr      =   docType;
            } else {
                DocNumber   =   rset.getInt("AutoCode");
                DocChr      =   rset.getString("AutoStartChr");
                rset.updateInt("AutoCode", (DocNumber+1));
                rset.updateRow();
            }
            rset.close();       
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DocNumGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public String getDocChar(){
        return DocChr;
    }

    public String getMode(){
        return mode;
    }

    public int getDocNumber(){
        return DocNumber;
    }
}
