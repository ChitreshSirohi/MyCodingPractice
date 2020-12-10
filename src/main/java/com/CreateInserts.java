package com;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class CreateInserts {
    public void readAndCreateInsertStmtFile(final String srcFile, final String destFile, final String template){
        try {
            try (final BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFile));
                 final BufferedReader bufferedReaderTemp = new BufferedReader(new FileReader(template));
                 final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFile));
            ) {
                final String commentTemplate =  "";
                final StringBuffer buffer = new StringBuffer();
                bufferedReaderTemp.lines().forEach(line -> buffer.append(line).append('\n'));
                final String templateStr = buffer.toString();
                buffer.setLength(0);
                final HashSet<String> crcodes = new HashSet<>();
                final String delim = ",";
                bufferedReader.lines().forEach(line -> {
                    final String[] colVals = line.split(delim);
                    final String finalInsertStmt = String.format(templateStr, colVals);
                    try {
                        /*if(!crcodes.contains(colVals[0])) {
                            bufferedWriter.write(String.format(commentTemplate, colVals[0]));
                            bufferedWriter.newLine();
                            crcodes.add(colVals[0]);
                        }*/
                        bufferedWriter.write(finalInsertStmt);
                    } catch (final IOException e) {
                        e.printStackTrace();
                    }
                });
                crcodes.stream().sorted().forEach(crcode -> {
                    try {
                        bufferedWriter.write(crcode+",");
                    } catch (final IOException e) {
                        e.printStackTrace();
                    }
                });
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }

    }
}
