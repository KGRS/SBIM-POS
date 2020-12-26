/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendcontrollers;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import model.GrnItem;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.BinCard;
import model.Item;

/**
 *
 * @author Sameera
 */
public class GrnController {

    public static GrnItem getReduceQtyOfItem(String itemCode) throws SQLException, ClassNotFoundException {

        GrnItem grnItem = null;
        String query = "SELECT GRNID, ItemCode, ItemName, UnitPurchase, Quantity, QuantityAfterReturn, PurchasePrice, Tax1, Tax2, OtherChargers, ItemPriceAmount, \n"
                + " ItemPriceAmountAfterReturn, IsReturn, ExpireDate, GRNDate, ReduceQuantity \n"
                + "FROM GRNItems WHERE ItemCode like '" + itemCode + "' AND ReduceQuantity > 0 \n"
                + "ORDER BY GRNDate ";
        System.out.println("grn query :" + query);

        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());

        if (result.next()) {
            grnItem = new GrnItem();
            grnItem.setGrnDate(result.getString("GRNDate"));
            grnItem.setQuantity(result.getDouble("ReduceQuantity"));
            grnItem.setGrnId(result.getString("GRNID"));
        }
        return grnItem;
    }

    public static int updateGrnQuantity(GrnItem item) throws ClassNotFoundException, SQLException {

        String query = "UPDATE GRNItems SET ReduceQuantity = '" + item.getQuantity() + "'\n"
                + " WHERE GRNID = '" + item.getGrnId() + "' AND ItemCode = '" + item.getItemCode() + "'";
        System.out.println("grn update :" + query);
        int res = ConnectionControll.setData(query, DBConection.getConnection());
        return res;
    }

    public static int insertDataToBinCard(BinCard binCard, int isReturnOrSale) throws ClassNotFoundException, SQLException {

        double currentQuantity = -200;
        double new_Qty = 0;
        String query = null;

        currentQuantity = ItemController.getCurrentQuantityOfThisItem(binCard.getItemCode());
        if (isReturnOrSale == 0) {//sale
            new_Qty = currentQuantity - binCard.getIssueQty();
            binCard.setBalanceQty(new_Qty);
            query = "INSERT INTO BinCard\n"
                    + "           (ItemCode\n"
                    + "           ,Date\n"
                    + "           ,Time\n"
                    + "           ,OtherNotes         \n"
                    + "           ,RecivedID        \n"
                    + "           ,RecivedFrom         \n"
                    + "           ,IssuedID\n"
                    + "           ,IssuedTo\n"
                    + "           ,IssuedQuantity\n"
                    + "           ,StockEditID\n"
                    + "           ,BalanceQty)\n"
                    + "     VALUES\n"
                    + "           ('" + binCard.getItemCode() + "','" + binCard.getDate() + "','" + binCard.getTime() + "','" + binCard.getLocation() + "',"
                    + "'" + binCard.getRecivedID() + "','" + binCard.getRecivedFrom() + "','" + binCard.getIssueId() + "',"
                    + "'" + binCard.getIssueTo() + "','" + binCard.getIssueQty() + "','" + binCard.getStockEditID() + "','" + binCard.getBalanceQty() + "')";
        } else {// return
            new_Qty = currentQuantity + binCard.getIssueQty();
            binCard.setBalanceQty(new_Qty);
            query = "INSERT INTO BinCard\n"
                    + "           (ItemCode\n"
                    + "           ,Date\n"
                    + "           ,Time\n"
                    + "           ,OtherNotes         \n"
                    + "           ,RecivedID        \n"
                    + "           ,RecivedFrom         \n"
                    + "           ,IssuedID\n"
                    + "           ,IssuedTo\n"
                    + "           ,RecivedQuantity\n"
                    + "           ,StockEditID\n"
                    + "           ,BalanceQty)\n"
                    + "     VALUES\n"
                    + "           ('" + binCard.getItemCode() + "','" + binCard.getDate() + "','" + binCard.getTime() + "','" + binCard.getLocation() + "',"
                    + "'" + binCard.getRecivedID() + "','" + binCard.getRecivedFrom() + "','" + binCard.getIssueId() + "',"
                    + "'" + binCard.getIssueTo() + "','" + binCard.getRecivedQty() + "','" + binCard.getStockEditID() + "','" + binCard.getBalanceQty() + "')";
        }

        System.out.println("query :" + query);

        int res = ConnectionControll.setData(query, DBConection.getConnection());
        return res;
    }

}
