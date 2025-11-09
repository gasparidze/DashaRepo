package org.example.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileExample {
    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("src/main/java/org/example/test.txt")){
            String str = "Hello World123456";
            outputStream.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
