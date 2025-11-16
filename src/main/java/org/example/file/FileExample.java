package org.example.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileExample {
    public static void main(String[] args) throws IOException {
//        try (OutputStream outputStream = new FileOutputStream("src/main/java/org/example/test.txt")){
//            String str = "Hello World123456";
//            outputStream.write(str.getBytes());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try (FileInputStream fileInputStream = new FileInputStream("src/main/java/org/example/test.txt")){
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//
//            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
//                System.out.println(bytesRead);
//            }
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
        try (FileReader reader = new FileReader("src/main/java/org/example/test.txt")){
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileWriter writer = new FileWriter("src/main/java/org/example/test.txt")){
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write("hello world");
            bw.newLine();
            bw.write("from Russia");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
