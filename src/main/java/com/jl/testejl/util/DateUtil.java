/*
 */
package com.jl.testejl.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francisco
 */
public class DateUtil {

    public static String convertDate(Date date) {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    public static Date convertDate(String source) {
        try {

            return new SimpleDateFormat("dd/MM/yyyy").parse(source);
        } catch (ParseException ex) {
            Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
