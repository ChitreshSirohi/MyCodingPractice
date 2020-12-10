package com.ZipTest;

import sun.rmi.runtime.Log;

import java.io.*;
import java.util.stream.Collectors;
import java.util.zip.ZipInputStream;

public class ZipFileToText {

    private static final int BUF_SIZE = 4096;

    public static void main(final String[] args) {
        File f = new File("C:\\Users\\CSirohi\\Documents\\5MS\\2671\\catsm_greensp_01101104_Inbox.xml");
        getText(f);
    }

    public static String getText(final File file) {
        int readLen;
        final char[] chars = new char[BUF_SIZE];
        StringBuilder builder = new StringBuilder();
        try (final FileInputStream sis = new FileInputStream(file);) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(sis, "UTF-8"));
            System.out.println(reader.lines().collect(Collectors.joining("\r\n")));
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return "";
    }


}

