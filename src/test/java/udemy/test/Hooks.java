package udemy.test;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
public class Hooks {
    @AfterAll
    public static void initWebDriver1(){
        System.out.println("This happens after ALL TEST - DESPUES DE TODO TEST");
    }
    @After
    public  void initWebDriver2(){
        System.out.println("This happens after each scenario - DESPUES DE CADA TEST");
    }
    @Before("@UdemyTest")//El tag sirve para incluir el hook en la prueba que requiero ejecutar
    public void initWebDriver3(){
        System.out.println("This happens before each scenario - ANTES DE CADA TEST");
    }
    @BeforeAll
    public static void initWebDriver4(){
        System.out.println("This happens before ALL TEST - ANTES DE TODO EL TEST");
    }

}
