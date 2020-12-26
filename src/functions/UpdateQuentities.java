/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import backendcontrollers.GrnController;
import backendcontrollers.ItemController;
import gui.FormPayment;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.GrnItem;
import model.Item;

/**
 *
 * @author Sameera
 */
public class UpdateQuentities {

    public static void updateItemQuantities(String itemCode, double orderQty) {
        try {
            double currentQuantity = -200;
            double new_Qty = 0;

            currentQuantity = ItemController.getCurrentQuantityOfThisItem(itemCode);
            new_Qty = currentQuantity - orderQty;
            Item newItem = new Item();
            newItem.setItemCode(itemCode);
            newItem.setQuantity(new_Qty);
            /**
             * update ItemMaster table
             */
            ItemController.updateItemQuantity(newItem);
            /**
             * update GRNItem table
             */
            GrnItem item = GrnController.getReduceQtyOfItem(itemCode);
            if (item != null) {
                new_Qty = item.getQuantity() - orderQty;
                item.setQuantity(new_Qty);
                item.setItemCode(itemCode);
                GrnController.updateGrnQuantity(item);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormPayment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormPayment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public static void updateBinCard(String itemCode, double orderQty) {
        try {
            double currentQuantity = -200;
            double new_Qty = 0;

            currentQuantity = ItemController.getCurrentQuantityOfThisItem(itemCode);
            new_Qty = currentQuantity - orderQty;
            Item newItem = new Item();
            newItem.setItemCode(itemCode);
            newItem.setQuantity(new_Qty);
            /**
             * update ItemMaster table
             */
            ItemController.updateItemQuantity(newItem);
            /**
             * update GRNItem table
             */
            GrnItem item = GrnController.getReduceQtyOfItem(itemCode);
            if (item != null) {
                new_Qty = item.getQuantity() - orderQty;
                item.setQuantity(new_Qty);
                GrnController.updateGrnQuantity(item);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormPayment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormPayment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
