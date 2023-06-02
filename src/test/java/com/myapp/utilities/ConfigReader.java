package com.myapp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //this class will read configuration.properties file using JAVA
    //create properties object

    private static Properties properties;

    //static block

    static {
        String path = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //create method that accepts KEY and returns VALUE
    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        return value;
    }
    /*
    //test
    public static void main(String[] args) {
        System.out.println(ConfigReader.getProperty("amazon_prod_url"));
        System.out.println(ConfigReader.getProperty("amazon_qa_url"));
        System.out.println(ConfigReader.getProperty("browser"));
        System.out.println(ConfigReader.getProperty("abcde"));//null

     */

    }

