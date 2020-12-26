package functions;

import backend_db.DBConection;
import db.ConnectSql;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

    public class ReportGenerat {

        JasperDesign jasperdesign;
        JasperReport jasperreport;
        JasperPrint jasperprint;
        Map map;
        String projectPath;

        public ReportGenerat() {
            projectPath =System.getProperty("user.dir")+"\\iReports\\";
        }

        public void PrintReport(String report, Map map) {
            try {
                report = projectPath +report;
                System.out.println("report path :"+report);
                jasperdesign = JRXmlLoader.load(report);
                jasperreport = JasperCompileManager.compileReport(jasperdesign);
                jasperprint = JasperFillManager.fillReport(jasperreport, map, DBConection.getConnection());
                
                List pages = jasperprint.getPages();
                if (!pages.isEmpty()) {
                    JasperViewer.viewReport(jasperprint, false);
                } else {
                    JOptionPane.showMessageDialog(null, "Document has no pages","No Pages",JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (JRException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                Logger.getLogger(ReportGenerat.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ReportGenerat.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ReportGenerat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }