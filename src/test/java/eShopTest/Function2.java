package eShopTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Function2 extends BaseTest {
    @BeforeMethod
    public void openCatalog(){
        System.out.println("переход в каталог");

    }
    @Test
    public void test21(){
        System.out.println("Проверка цены продукта");
    }
    @Test
    public void test22(){
        System.out.println("Проверка названия продукта");
    }
}
