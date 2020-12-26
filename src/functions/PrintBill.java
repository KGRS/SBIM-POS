/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import backend_db.DBConection;
import backendcontrollers.OrderDetailController;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRXmlDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sameera
 */
public class PrintBill {

    static JRXmlDataSource jrxmlds;
    static JasperPrint jasperprint;
    static JasperDesign jasperdesign;
    static JasperReport jasperreport;

    public static void printInvoice(String orderId) {
        try {

            double orderDiscount = OrderDetailController.getOrderDiscount(orderId);

            String reportPath = "";
            String logo_path = Information.PROJECT_LOCATION + "\\picture\\logo\\logo.png";
            Map map = new HashMap();
            map.put("billNo", orderId);
            map.put("logo_path", logo_path);

            if (orderDiscount > 0) {
                reportPath = Information.PROJECT_LOCATION + "\\Reports\\InvoiceWithDiscount.jrxml";
            } else {
                reportPath = Information.PROJECT_LOCATION + "\\Reports\\InvoiceWithoutDiscount.jrxml";
            }
            System.out.println("report path :" + reportPath);
            jasperdesign = JRXmlLoader.load(reportPath);
            jasperreport = JasperCompileManager.compileReport(jasperdesign);
            jasperprint = JasperFillManager.fillReport(jasperreport, map, DBConection.getConnection());

            PrintService ser1 = PrintServiceLookup.lookupDefaultPrintService();

            JRExporter jre = new JRPrintServiceExporter();
            jre.setParameter(JRExporterParameter.JASPER_PRINT, jasperprint);
            jre.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, ser1.getAttributes());
            jre.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, ser1.getAttributes());
            jre.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, false);
            jre.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, false);
            jre.exportReport();

            if (ReadConfig.printBill == 0) {
                JasperViewer.viewReport(jasperprint, false);
            }

        } catch (JRException ex) {
            Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrintBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
