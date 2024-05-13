package javaio;

import java.io.*;

public class FileCopyPasteWithBuffer {

    public static void main(String[] args) {
        File srcFile = new File("C:\\Users\\dell\\Documents\\Java Programming\\ocp-1z0-829\\src\\javaio\\source.txt");
        File destFile = new File("C:\\Users\\dell\\Documents\\Java Programming\\ocp-1z0-829\\src\\javaio\\destination.txt");

        try (var reader = new BufferedReader(new FileReader(srcFile));
             var writer = new BufferedWriter(new FileWriter(destFile))) {

            // We can read line by line
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // We use this because readLine() strips out the end-of-line character
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
