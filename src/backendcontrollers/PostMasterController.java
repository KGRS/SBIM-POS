/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backendcontrollers;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import java.net.NoRouteToHostException;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PosMaster;

/**
 *
 * @author TiVA
 */
public class PostMasterController {

    public static int insertPosMasterToDB(PosMaster pos) throws ClassNotFoundException, SQLException{
        String query = "insert into tblPosmaster( "
                + "TRNNO,"
                + "TrnDate,"
                + "InvoiceNO,"
                + "DeptCode,"
                + "SubTotal,"                
                + "DiscountPercent,"
                + "DiscountAmount,SubAfterDiscount,GrandTotal,PriceLevel,PaymentType,ItemCount,Tax_Status,Tax1,Tax2,"
                + "Tax3,"
                + "Tax4,"
                + "Tax5,"
                + "Settled,"
                + "Reason,"
                + "Canceled,"
                + "Disc_remarks,"
                + "Disc_Reason	"
                + ") "
                + "values('Trn0006',2012-03-14,'IN0025','CMP',1000,2,150,850,1500,'PriceLevel','Card',2,100,1.1,2.2,3.3,4.4,5.5,100,'cancel_reason',100,'disc_remarks','disc_reason');";
        int result = ConnectionControll.setData(query, DBConection.getConnection());
        return result;
    }
    
    public static void updatePosMaster(PosMaster pos){
        String query = "update  tblPosmaster SET "
                + "TRNNO ='"+pos.getTransactionNo()+"' ,"
                + "TrnDate ="+pos.getTrnsactionDate()+" ,"
                + "InvoiceNO ='"+pos.getInvoiceNo()+"',"
                + "DeptCode ='"+pos.getDepCode()+"',"
                + "SubTotal ="+pos.getSubTotal()+","                
                + "DiscountPercent ="+pos.getDiscount()+" ,"
                + "DiscountAmount ="+pos.getDiscountAmount()+","
                + "SubAfterDiscount ="+pos.getSubTotalAfterDisc()+","
                + "GrandTotal = "+pos.getGrandTotal()+","
                + "PriceLevel ="+pos.getPriceLevel()+","
                + "PaymentType ="+pos.getPriceLevel()+","
                + "ItemCount="+pos.getItemCount()+","
                + "Tax_Status="+pos.getTaxStatus()+","
                + "Tax1="+pos.getTax1()+","
                + "Tax2="+pos.getTax2()+","
                + "Tax3="+pos.getTax2()+","
                + "Tax4="+pos.getTax3()+","
                + "Tax5="+pos.getTax4()+","
                + "Settled="+pos.getSettled()+","
                + "Reason="+pos.getCancelReasoned()+","
                + "Canceled="+pos.getCancelled()+","
                + "Disc_remarks="+pos.getDiscountRemarks()+","
                + "Disc_Reason="+pos.getDiscountReasons()+"" ;       
        
    }
    
    public static void getPosItemsByInvoiceCode(PosMaster pos){
        ArrayList<PosMaster> list = new ArrayList<PosMaster>();
        
       // String query = "SE"
                
    }
    
    
    
    
    
}
