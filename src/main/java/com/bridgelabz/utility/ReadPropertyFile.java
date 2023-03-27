package com.bridgelabz.utility;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
    String propertyFilePath = "C:\\Users\\atulk\\IdeaProjects\\POM-Instagram\\testdata.properties";
    public  Properties properties;
    public ReadPropertyFile() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
        properties = new Properties();
        try {
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e + "testData.properties file not found");

        }
    }
}
