package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExistsTesti {

    @Test
    public void Test01(){

        String dosyaYolu = System.getProperty("user.dir") + "\\pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
