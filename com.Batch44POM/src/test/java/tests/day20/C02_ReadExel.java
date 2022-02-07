package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExel {

    @Test
    public void test01() throws IOException {

        //ülkerler excelinin 3 .satırını yazdırın

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fis);
        for (int i=0;i<4;i++){
            System.out.println(workbook.getSheet("Sayfa1").getRow(2).getCell(i).toString());

        }
        System.out.println("********************");
        // ilk 20 ülkenin başkentlerinin türkçe isimlerini yazdırın
        for (int i=0;i<=20; i++){

            System.out.println(workbook.getSheet("sayfa1").getRow(i).getCell(3).toString());
        }




    }
}
