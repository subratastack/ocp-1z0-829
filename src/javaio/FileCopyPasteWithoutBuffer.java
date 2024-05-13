package javaio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyPasteWithoutBuffer {

    public static void main(String[] args) {

        File srcFile = new File("C:\\Users\\dell\\Documents\\Java Programming\\ocp-1z0-829\\src\\javaio\\source.txt");
        File destFile = new File("C:\\Users\\dell\\Documents\\Java Programming\\ocp-1z0-829\\src\\javaio\\destination.txt");

        // we are using try-with-resource so that close() method is applied on our objects
        try (var reader = new FileReader(srcFile); var writer = new FileWriter(destFile)) {

            int c;
            while ((c = reader.read()) != -1) { // -1 indicates end of stream
                writer.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
