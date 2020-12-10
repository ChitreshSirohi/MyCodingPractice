package com;

import org.junit.Test;

import java.text.ParseException;

import static org.assertj.core.api.Assertions.*;

public class DateFormatterTest {
    public static final String D_MMM_YYYY_HH_MM_SS = "d-MMM-yyyy HH:mm:ss";
    public static final String YYYY_MM_DD_T_HH_MM_SS_Z = "yyyy-MM-dd'T'HH:mm:ssXXX";
    @Test
    public void convert() throws ParseException {
        assertThat(DateFormatter.convert(D_MMM_YYYY_HH_MM_SS,YYYY_MM_DD_T_HH_MM_SS_Z,"13-Aug-2020 23:41:55")).isEqualTo("2020-08-13T23:41:55+10:00");
    }
}