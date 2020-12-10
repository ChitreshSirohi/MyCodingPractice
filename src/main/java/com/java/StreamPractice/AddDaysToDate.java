package com.java.StreamPractice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class AddDaysToDate {
    public static void main(final String[] args) throws ParseException {
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        final Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, -400);
        System.out.println(dateFormat.format(c.getTime()));
        System.out.println(getNow());
    }

    public static String convert(String fromPattern, String toPattern, String value) throws ParseException {
        if(value == null || value.trim().isEmpty()){
            return value;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(fromPattern);
        Date date = sdf.parse(value);
        sdf.applyPattern(toPattern);
        return sdf.format(date.toInstant().atOffset(ZoneOffset.ofHours(10)));
    }

    public static String getTimeAppendingOffsetHours(final String receivedDateTime, final String pattern) throws ParseException {
        //final ZoneOffset offset = OffsetDateTime.now().getOffset();
        final Date formattedDate = new SimpleDateFormat(pattern).parse(receivedDateTime);
        final OffsetDateTime offsetDateTime = formattedDate.toInstant().atOffset(ZoneOffset.ofHours(10));
        return offsetDateTime.toString();
    }


    public static String getNow() throws ParseException {
        final LocalDateTime ldt = LocalDateTime.now();
        return getTimeAppendingOffsetHours(ldt.withNano(0).toString(), "yyyy-MM-dd'T'HH:mm:ss");
    }
}
