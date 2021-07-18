package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Mainprop {
    private static String configPath= "src/test/resources/main.properties";

    public static String getProperty(String key)  {
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream(configPath));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return prop.getProperty(key);
    }
}



