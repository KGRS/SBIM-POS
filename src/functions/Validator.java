/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Administrator
 */
public class Validator {

    public static String BuildTwoDecimals(double value) {
        NumberFormat df = new DecimalFormat("#.00");
        String format = df.format(value);
        return format;
    }

    public static void DigitsValitor(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_PERIOD|| c == KeyEvent.VK_ENTER)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
    
    public static void TelephoneNoValidate(java.awt.event.KeyEvent evt,String text) {
        char c = evt.getKeyChar();
        int length = text.length();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_PERIOD|| c == KeyEvent.VK_ENTER)|| length > 9) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();        
        }
    }
}
