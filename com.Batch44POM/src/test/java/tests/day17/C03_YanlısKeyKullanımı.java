package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlısKeyKullanımı {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
         //eger key olarak girdiğimiz String configuration.properties dosyasında yoksa
        // Örnegin:HMCUrl yerine HMCurl
        //ConfigReader.getProperty() o key'i bulamaz
        //ve nullPointerException fırlatır
    }
}
