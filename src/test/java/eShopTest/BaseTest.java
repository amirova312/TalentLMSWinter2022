package eShopTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeSuite
    public void setup(){
        System.out.println("chrome");
    }
    @BeforeTest
    public void openSite(){
        System.out.println("Open site");
    }
}
