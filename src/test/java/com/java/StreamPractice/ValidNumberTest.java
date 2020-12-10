package com.java.StreamPractice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidNumberTest {

    @Test
    public void isNumber() {
        ValidNumber validNumber = new ValidNumber();
        assertThat(validNumber.isNumber("1  ")).isTrue();
    }
}