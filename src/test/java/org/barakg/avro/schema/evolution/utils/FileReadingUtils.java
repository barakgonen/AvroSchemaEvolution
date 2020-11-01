package org.barakg.avro.schema.evolution.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReadingUtils {

    public static String getFileContent(String fileName, Class c){
        InputStream inputStream = c.getClassLoader().getResourceAsStream(fileName);
        String data = null;
        try {
            data = StringUtils.deleteWhitespace(readFromInputStream(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line);
            }
        }
        return resultStringBuilder.toString();
    }
}
