package testNG;

import com.digital.Calculator;
import com.digital.SomeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static org.testng.Assert.*;

public class CalculatorTest {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void addTwoNumsTest(){
        assertEquals(Calculator.add(2,2), 4);
        System.out.println(("1"));
        assertEquals(Calculator.add(2,2), 3);
        System.out.println("2");
        assertEquals(Calculator.add(2,3), 5);

    }
    @Test
    public void testSoftAssert(){
        softAssert.assertEquals(Calculator.add(2,2),4);
        System.out.println(("1"));
        softAssert.assertEquals(Calculator.add(2,2),5);
        System.out.println(("2"));
        softAssert.assertEquals(Calculator.add(2,2),4);
        System.out.println(("3"));
        softAssert.assertEquals(Calculator.add(2,2),4);
        System.out.println(("4"));
        softAssert.assertAll();

        }
        @Test
    public void testAssertTrue(){
         assertTrue(SomeClass.isFunny(true));
            assertFalse(false);
        }

        @Test
    public void test123(){

        Object obj = new Object();
        obj = null;
        assertNotNull(null);
        }
    }

