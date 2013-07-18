
package com.xiaoqlu.framework.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFile {
    public static void write(String fileName, String text) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File(fileName).getAbsolutePath());
        out.write(text);
        out.close();
    }

    public static String read(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(
                new File(fileName).getAbsolutePath()));
        String s;
        StringBuilder result = new StringBuilder();
        while ((s = reader.readLine()) != null) {
            result.append(s);
        }
        reader.close();
        return result.toString();
    }
}
