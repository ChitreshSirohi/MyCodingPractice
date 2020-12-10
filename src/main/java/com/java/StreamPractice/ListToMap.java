package com.java.StreamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.function.Function.*;

public class ListToMap {

    public static void main(String[] args) {
        final ArrayList<ReportCount> list = new ArrayList<>();
        IntStream.range(1,4).forEach(ctr -> list.add(new ReportCount("AGLE"+ctr, ctr)));
        final Map<String, ReportCount> collect = list.stream().collect(Collectors.toMap(ReportCount::getPartId, identity()));
    }
    public static class ReportCount{
        public ReportCount(final String partId, final Integer count) {
            this.partId = partId;
            this.count = count;
        }

        String partId;
        Integer count;



        public String getPartId() {
            return this.partId;
        }

        public void setPartId(final String partId) {
            this.partId = partId;
        }

        public Integer getCount() {
            return this.count;
        }

        public void setCount(final Integer count) {
            this.count = count;
        }



    }
}
