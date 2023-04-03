package demoTest;

import org.testng.Assert;
import org.testng.annotations.*;

public class DemoClass {

    @Test
    public void demoTest(){
        System.out.println("Demo test");
    }
    @Test
    public void demoTest2(){
        System.out.println("Demo Test 2");
        Assert.assertEquals(100,100);
    }
    @BeforeMethod
    public void demoBefore(){
        System.out.println("Demo Before");
}
    @AfterMethod
    public void demoAfter(){
        System.out.println("Demo After");
}
}
/*    @BeforeClass
    public void DemoBeforeClass() {
        System.out.println("Demo Before Class");
    }

    @BeforeMethod
    public void demoBeforeMethod() {
        System.out.println("Demo Before Method");
    }

    @Test (groups = "group1")
    public void demoTest1() {
        System.out.println("Demo Test1");
    }

    @Test (groups = "group2")
    public void demoTest2() {
        System.out.println("Demo Test2");
    }


    @AfterMethod
    public void demoAfterMethod() {
        System.out.println("Demo After Method");
    }

    @AfterClass
    public void demoAfterClass() {
        System.out.println("Demo After Class");
    }

    @BeforeTest
    public void demoBeforeTest() {
        System.out.println("Demo Before Test");
    }

    @AfterTest
    public void demoAfterTest() {
        System.out.println("Demo After Test");
    }

    @BeforeSuite
    public void demoBeforeSuite() {
        System.out.println("Demo Before Suite");
    }

    @AfterSuite
    public void demoAfterSuite() {
        System.out.println("Demo After Suite");
    }

    @BeforeGroups (groups = "group1")
    public void demoBeforeGroup() {
        System.out.println("Demo Before Group1");
    }

    @AfterGroups (groups = "group1")
    public void demoAfterGroup() {
        System.out.println("Demo After Group1");
    }

    @BeforeGroups (groups = "group2")
    public void demoBeforeGroup2() {
        System.out.println("Demo Before Group2");
    }

    @AfterGroups (groups = "group2")
    public void demoAfterGroup2() {
        System.out.println("Demo After Group2");
    }*/
