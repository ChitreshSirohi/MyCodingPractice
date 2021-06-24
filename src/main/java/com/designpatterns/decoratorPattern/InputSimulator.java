package com.designpatterns.decoratorPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputSimulator {

    public static void main(String[] args) throws IOException {
        int c;
        try (InputStream in = new LowerCaseInputStream(new FileInputStream("src/main/java/com/designpatterns/decoratorPattern/test.txt"))){
            while ((c = in.read()) > 0){
                System.out.print((char) c);
            }
        }
    }
}
