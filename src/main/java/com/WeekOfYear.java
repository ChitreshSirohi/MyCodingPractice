package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.IsoFields;
import java.time.temporal.WeekFields;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class WeekOfYear {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of ( "Australia/Brisbane" );
        ZonedDateTime now = ZonedDateTime.now ( zoneId );
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         LocalDate of = LocalDate.of(2010, 12, 31);

        System.out.println("Week no ISO:"+of.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
        System.out.println("Week Year:"+of.get(IsoFields.WEEK_BASED_YEAR ));
        System.out.println("Week noJava:"+of.get(WeekFields.of(Locale.getDefault()).weekOfYear()));
         of = LocalDate.of(2011, 1, 1);

        System.out.println("Week no ISO:"+of.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
        System.out.println("Week year:"+of.get(IsoFields.WEEK_BASED_YEAR ));
        System.out.println("Week noJava:"+of.get(WeekFields.of(Locale.getDefault()).weekOfYear()));
    }
}
