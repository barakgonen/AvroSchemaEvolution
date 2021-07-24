package org.barakg.avro.schema.evolution.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReadingUtils {

    public static String getFileContent(String pathToFile) {
        Path path = Paths.get(pathToFile);

        String data = null;
        try {
            Stream<String> lines = Files.lines(path);
            data = lines.collect(Collectors.joining("\n"));
            lines.close();
            data = StringUtils.deleteWhitespace(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

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
