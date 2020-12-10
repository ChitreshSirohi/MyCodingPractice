package com.leet.Solution;

import java.util.*;

public class ReorderLines {
    public List<String> reorderLines(int logFileSize, List<String> logLines)
    {
        logLines.sort((str1, str2) -> {
            int res = String.CASE_INSENSITIVE_ORDER.compare(str1.substring(str1.indexOf(" ")), str2.substring(str2.indexOf(" ")));
            res = res*-1;
            if (res == 0) {
                res = str1.compareTo(str2);
            }
            return res;
        });
        return logLines;
    }


    /* SortedSet<String> s =  new TreeSet<>();
        s.add("923");
        s.add("ghg");
        s.add("2333");
        s.forEach(s1 -> System.out.println(s1));*/


}
