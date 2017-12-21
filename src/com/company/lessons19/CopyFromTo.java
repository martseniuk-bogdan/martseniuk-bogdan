package com.company.lessons19;

import java.io.*;

public class CopyFromTo {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/company/lessons19/copied_file.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/company/lessons19/newfile.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

