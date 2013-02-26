package com.chinasofti.basic.utils;

import org.apache.commons.lang.StringUtils;

import com.chinasofti.basic.framework.common.Constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 * @author zengzj
 *
 */
public class DateUtils {   


  
    public static String getDatePattern() {
        return Constants.DEFAULT_DATE_PATTERN;
    }

  
    public static String getToday() {
        Date today = new Date();
        return format(today);
    }

    public static String format(Date date) {
        return date == null ? "" : format(date, getDatePattern());
    }

  
    public static String format(Date date, String pattern) {
        return date == null ? "" : new SimpleDateFormat(pattern).format(date);
    }

  
    public static Date parse(String strDate) throws ParseException {
        return StringUtils.isBlank(strDate) ? null : parse(strDate, getDatePattern());
    }

 
    public static Date parse(String strDate, String pattern) throws ParseException {
        return StringUtils.isBlank(strDate) ? null : new SimpleDateFormat(pattern).parse(strDate);
    }

   
    public static Date addMonth(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
    

}