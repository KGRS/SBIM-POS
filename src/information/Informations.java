/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package information;

import gui.FormBilling;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Timer;

/**
 *
 * @author Sameera
 */
public class Informations {
    
     public static void setTimeAnd_date() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Calendar calendar = new GregorianCalendar();
                int hh = calendar.get(Calendar.HOUR);
                int mm = calendar.get(Calendar.MINUTE);
                int ss = calendar.get(Calendar.SECOND);
                int am_pm = calendar.get(Calendar.AM_PM);


                String hour = "";
                String minute = "";
                String second = "";
                String AM_PM = "";

                if (1 <= hh && hh < 10) {
                    //System.out.println("hh : " + hh);
                    hour += "0" + hh;
                } else if (hh >= 10) {
                    hour += hh + "";
                } else if (hh == 0) {
                    hour = 12 + "";
                }

                if (mm < 10) {
                    minute += "0" + mm;
                } else {
                    minute += mm + "";
                }

                if (ss < 10) {
                    second += "0" + ss;
                } else {
                    second += ss + "";
                }

                if (am_pm == Calendar.AM) {
                    AM_PM = "AM";
                } else {
                    AM_PM = "PM";
                }


                String currentTime = "" + hour + ":" + minute + ":" + second + " " + AM_PM;

                FormBilling.lblTime.setText(currentTime);
            }
        });
        timer.start();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String cur_date = dateFormat.format(date);
        FormBilling.lblDate.setText(cur_date);
    }
    
}
