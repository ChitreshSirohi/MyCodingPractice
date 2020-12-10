package com.java.StreamPractice;

import com.sun.javaws.Globals;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\d_drive\\Projects\\MyCodingPractice\\src\\main\\java\\com\\java\\StreamPractice\\hello.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
        archiveRawAsZip(fileInputStream,"hello.zip");
    }

    public static String archiveRawAsZip(InputStream inputStream, String filename) throws IOException {
        String archiveLocation = null;
        ZipOutputStream zipStream;
        ZipEntry zipEntry;
        FileTime ft;
        try {
            File file1 = new File("C:\\d_drive\\Projects\\MyCodingPractice\\src\\main\\java\\com\\java\\StreamPractice\\hello.zip");
            String xMessageContextId = "hll.o.zip";
            String zipEntryName= (xMessageContextId.contains(".")?xMessageContextId.substring(0,xMessageContextId.lastIndexOf(".")):xMessageContextId)+".xml";
            FileOutputStream fileOutputStream = new FileOutputStream(file1);
            zipStream = new ZipOutputStream(fileOutputStream, Charset.isSupported("UTF-8") ? StandardCharsets.UTF_8 : Charset.defaultCharset());


            zipEntry = new ZipEntry("Chitresh.xml");
            zipStream.putNextEntry(zipEntry);
            readBytes(inputStream).writeTo(zipStream);
            zipStream.closeEntry();
            zipStream.finish();
            zipStream.flush();
            fileOutputStream.flush();
            zipStream.close();

        } catch (NullPointerException | IOException e) {
            throw e;
        }
        return archiveLocation;
    }

    private static ByteArrayOutputStream readBytes(InputStream inputStream) throws IOException {
        int bufLength = 0;
        byte bytes[] = new byte[32768];
        ByteArrayOutputStream content = new ByteArrayOutputStream();

        try {
            while ((bufLength = inputStream.read(bytes, 0, 32768)) != -1) {
                content.write(bytes, 0, bufLength);
            }
        } catch (NullPointerException | IOException e) {

            throw e;
        }
        return content;
    }
}
