package com.leet.Solution.aprilChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidParenthesisTest {

    @Test
    public void checkValidString() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        assertThat(validParenthesis.checkValidString("()")).isTrue();
        assertThat(validParenthesis.checkValidString("(*)")).isTrue();
        assertThat(validParenthesis.checkValidString("(*))")).isTrue();
        assertThat(validParenthesis.checkValidString("())*")).isFalse();
    }
}