package com;

import com.sun.javaws.Globals;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CharToStream {
    public static void main(final String[] args) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        String n = "O’Connell";
        for (char c:n.toCharArray()) {
            charArrayWriter.append(c);
        }
        String s = charArrayWriter.toString();
        FileOutputStream fileOutputStream = new FileOutputStream("hello.zip");
        final PrintStream printStream = new PrintStream(fileOutputStream, true, StandardCharsets.ISO_8859_1.toString());

        ByteArrayInputStream inputStream = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zipStream = new ZipOutputStream(printStream);
        zipStream.putNextEntry(new ZipEntry("new.xml"));
        readBytes(inputStream).writeTo(zipStream);
        zipStream.closeEntry();
        zipStream.finish();
        zipStream.flush();
        outputStream.flush();


        //DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("C:\\Users\\CSirohi\\Downloads\\TempTicktFolder\\custm20210201007_Other"));
        //directoryStream.forEach(path -> addToZipFile(path,zipStream));
    }

    private static void addToZipFile(Path file, ZipOutputStream zipStream) {
        String inputFileName = file.toFile().getPath();
        try (FileInputStream inputStream = new FileInputStream(inputFileName)) {

            // create a new ZipEntry, which is basically another file
            // within the archive. We omit the path from the filename
            ZipEntry entry = new ZipEntry(file.toFile().getName());
            entry.setCreationTime(FileTime.fromMillis(file.toFile().lastModified()));
            zipStream.putNextEntry(entry);


            // Now we copy the existing file into the zip archive. To do
            // this we write into the zip stream, the call to putNextEntry
            // above prepared the stream, we now write the bytes for this
            // entry. For another source such as an in memory array, you'd
            // just change where you read the information from.
            byte[] readBuffer = new byte[2048];
            int amountRead;
            int written = 0;

            while ((amountRead = inputStream.read(readBuffer)) > 0) {
                zipStream.write(readBuffer, 0, amountRead);
                written += amountRead;
            }



        }
        catch(IOException e) {

        }
    }

    private static ByteArrayOutputStream readBytes(InputStream inputStream) throws  IOException {
        int bufLength = 0;
        byte bytes[] = new byte[32678];
        ByteArrayOutputStream content = new ByteArrayOutputStream();

        try {
            while ((bufLength = inputStream.read(bytes, 0, 32678)) != -1) {
                content.write(bytes, 0, bufLength);
            }
        } catch (NullPointerException | IOException e) {

            throw e;
        }
        return content;
    }
}
