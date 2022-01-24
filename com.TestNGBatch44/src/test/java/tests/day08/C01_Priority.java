package tests.day08;

import org.testng.annotations.Test;

public class C01_Priority {



    @Test(priority = 9)
    public void yotubeTesti(){
        System.out.println("Youtube testi çalıştı");

    }

    @Test(priority = 0)
    public void amazonTesti(){//pririty atanmazsa priority=0 kabul eder
        System.out.println("Amazon testi çalıştı");

    }
    @Test
    public void bestbuyTesti(){
        System.out.println("Bestbuy testi çalıştı");

    }
}
