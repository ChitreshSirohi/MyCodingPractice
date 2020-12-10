package com;

import java.io.*;

public class SqlHelp {
    public static void main(final String[] args) throws IOException {
        final File file = new File("src/main/java/com/Sample.txt");
        final File file2 = new File("Sample1.txt");
        final StringBuffer sbuff = new StringBuffer();
        try(final FileReader fis = new FileReader(file);){
            final BufferedReader bis = new BufferedReader(fis);
            bis.lines().forEach(line -> sbuff.append(changeString(line)));
            final FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write(sbuff.toString());
            fileWriter.close();
        }
    }

    private static String changeString(final String line){
         String s = line.replaceFirst(",", " ");
        s=s.replace(',','(');
        s+="),\n";
        return s;
    }


}
