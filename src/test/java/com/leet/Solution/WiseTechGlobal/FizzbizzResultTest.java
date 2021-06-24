package com.leet.Solution.WiseTechGlobal;


import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzbizzResultTest {


    @Test
    public void getFizzBuzz() {

        assertThat(FizzbizzResult.getFizzBuzz(3)).isEqualTo(FizzbizzResult.FIZZ);
        assertThat(FizzbizzResult.getFizzBuzz(5)).isEqualTo(FizzbizzResult.BUZZ);
        assertThat(FizzbizzResult.getFizzBuzz(15)).isEqualTo(FizzbizzResult.FIZZ+FizzbizzResult.BUZZ);
        assertThat(FizzbizzResult.getFizzBuzz(7)).isEqualTo("7");
    }


}