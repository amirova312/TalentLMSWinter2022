package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {
    @Test
    public void createNewTest(){
        User firstUser = null;
        Assert.assertNotNull(firstUser);
    }
    @Test(dependsOnMethods = "createNewTest")
    public void loginTest(){
        Assert.assertTrue(true);

    }
    @DataProvider (name = "inputValues")
    public static Object[][]getInputValues(){
        return new Object[][]{
                {"john@gmail.com", "ValidPass"},
                {"johngmail.com", "ValidPass"},
                {"johng@mail.com", "InvalidPass"},

        };
    }
    @Test (dataProvider = "inputValues")
    public void testLoginFun(String username, String password){
        System.out.println(username + " " + password);
    }
}
