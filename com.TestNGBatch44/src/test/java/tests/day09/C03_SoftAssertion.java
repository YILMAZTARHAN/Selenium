package tests.day09;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertion {

    @Test
    public void test(){

        int a=10;
        int b=20;
        int c=30;

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(a,b,"1.test başarısız");//failed
        softAssert.assertTrue(a>b,"2.test başarısız");//failed
        softAssert.assertTrue(a<c,"3.test başarısız");//passed
        softAssert.assertTrue(c>b,"4.test başarısız");//passed
        softAssert.assertTrue(c<a,"5.test başarısız");//failed

        // assertAll demezsek class çalışır  ve passed yazar,çünkü aslında raporlama yapmaz sadece kodlar  çalışmış olur
        softAssert.assertAll();
        System.out.println("eğer softassert'lerden fail olan varsa bu satır çalışmaz");

        //çalışır
    }
}
