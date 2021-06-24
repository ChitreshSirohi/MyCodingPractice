package com.leet.Solution.WiseTechGlobal;

import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class ResultFindLowestPriceTest {

    @Test
    public void findLowestPrice() {
        String[][] prod = new String[][]{{"10","sale","january-sale"},{"200","sale","EMPTY"}};
        String[][] disc = new String[][]{{"sale","0","10"},{"january-sale","1","10"}};
        final List<List<String>> collect = Arrays.stream(prod).map(a -> Arrays.stream(a).collect(Collectors.toList())).collect(Collectors.toList());

        assertThat(ResultFindLowestPrice.findLowestPrice(collect, collect));
    }


}