package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {


    public static String convert(String fromPattern, String toPattern, String value) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(fromPattern);
        Date date = sdf.parse(value);
        sdf.applyPattern(toPattern);
        return sdf.format(date);
    }
}
