package com.leet.Solution.sepChallenge;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class EvaluateDivisionTest {

    @Test
    public void calcEquation() {
        EvaluateDivision evaluateDivision = new EvaluateDivision();

        String[][] eq1 = new String[][]{{"a","b"},{"b","c"}};
        String[][] q1 = new String[][]{{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}};
        assertThat(evaluateDivision.calcEquation(getEquationOrQueries(eq1), new double[]{2.0, 3.0}, getEquationOrQueries(q1))).contains(6.0, 0.5, -1.0, 1.0, -1.0);
    }

    private List<List<String>> getEquationOrQueries(final String[][] equations){
        final List<List<String>> eqs = new ArrayList<>();
        List<String> curList = null;
        for (final String[] equation:equations) {
            curList = new ArrayList<>();
            eqs.add(curList);
            curList.addAll(Arrays.asList(equation));
        }
        return eqs;
    }
}