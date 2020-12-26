/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sameera
 */
public class DateFormat {

    public static String getDate(String date) throws ParseException {
        String formated_date = null;

        SimpleDateFormat inFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat outFormat = new SimpleDateFormat("yyyy-MM-dd");
        formated_date = outFormat.format(inFormat.parse(date));
        return formated_date;
    }

    public static String getTime(String date) throws ParseException {
        String formated_time = null;
//        java.text.DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//        Date parse = dateFormat.parse(date);
//        formated_time = dateFormat.format(parse);
//        
        SimpleDateFormat inFormat = new SimpleDateFormat("hh:mm:ss aa");
        SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
        formated_time = outFormat.format(inFormat.parse(date));

        return formated_time;
    }

    public static void main(String[] args) {
        DateFormat d = new DateFormat();
        try {
            String date = DateFormat.getDate("2015/03/13");
            System.out.println("date :"+date);
            String time = DateFormat.getTime("2:50:22 PM");
            System.out.println("time :" + time);
        } catch (ParseException ex) {
            Logger.getLogger(DateFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
