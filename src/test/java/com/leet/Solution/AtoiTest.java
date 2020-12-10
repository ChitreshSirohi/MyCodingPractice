package com.leet.Solution;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AtoiTest {

    @Test
    public void myAtoi() {
        String n = "1.2e2";
        assertThat(n.matches("[+-e.\\d]*")).isTrue();
        final boolean f = n.toLowerCase().contains("f");
        Double.valueOf("1 ".trim());
        Atoi atoi = new Atoi();
        assertThat(atoi.myAtoi("42")).isEqualTo(42);
        assertThat(atoi.myAtoi("-42")).isEqualTo(-42);
        assertThat(atoi.myAtoi("4193 with words")).isEqualTo(4193);
        assertThat(atoi.myAtoi("words and 987")).isEqualTo(0);
        assertThat(atoi.myAtoi("-91283472332")).isEqualTo(-2147483648);
        assertThat(atoi.myAtoi("2147483647")).isEqualTo(2147483647);
        assertThat(atoi.myAtoi("+")).isEqualTo(0);
        assertThat(atoi.myAtoi("-")).isEqualTo(0);
        assertThat(atoi.myAtoi("/")).isEqualTo(0);
        assertThat(atoi.myAtoi("-000000")).isEqualTo(0);
        assertThat(atoi.myAtoi("  0000000000012345678")).isEqualTo(12345678);
        assertThat(atoi.myAtoi("  -0000000000012345678")).isEqualTo(-12345678);


    }
}