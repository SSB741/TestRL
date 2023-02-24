
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redlo_Login {

    @Test
    public void testSignUpSuccess() {
    	//WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://dev.redlo.com.pe/");
        WebElement boton = driver.findElement(By.cssSelector("#root > div > div.d-flex.row > div.order-2-1.col-md-5.col-12 > div > div > div:nth-child(2) > button"));
        boton.click();
        
        WebElement usuario = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div > form > div.col-12.pt-5 > input"));
        usuario.sendKeys("user@example.com");
        
        WebElement password = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div > form > div.col-12.py-5.d-flex > input"));
        password.sendKeys("stringchange");
            
        WebElement submit = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div > form > button"));
        //Hacer clic en el botón
        submit.click();
        
        driver.get("https://dev.redlo.com.pe/home");
        WebElement ingresov = driver.findElement(By.cssSelector("#root > div > div > div.mb-3.sticky-top.bg-white.navbar.align-items-center.justify-content-center.row > div > div > div > div.justify-content-center.col-lg-10.col-md-10.col-sm-6.col-6 > form > button"));
        ingresov.sendKeys("encontrado");
        // Hacer clic en el botón
        ingresov.click();
        driver.quit();   
    }
    
    @Test
    public void testSignUp() {
    //WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.redlo.com.pe/");
        WebElement boton = driver.findElement(By.cssSelector("#root > div > div.d-flex.row > div.order-2-1.col-md-5.col-12 > div > div > div:nth-child(2) > button"));
        boton.click();
        
        WebElement usuario = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div > form > div.col-12.pt-5 > input"));
        usuario.sendKeys("userfalsoooo@example.com");
        
        WebElement password = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div > form > div.col-12.py-5.d-flex > input"));
        password.sendKeys("stringchange");
            
        WebElement submit = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div > form > button"));
        submit.click();
        
        driver.get("https://dev.redlo.com.pe/home");
        WebElement ingresov = driver.findElement(By.cssSelector("#root > div > div > div.mb-3.sticky-top.bg-white.navbar.align-items-center.justify-content-center.row > div > div > div > div.justify-content-center.col-lg-10.col-md-10.col-sm-6.col-6 > form > button"));
        ingresov.sendKeys("encontrado");
        ingresov.click();
    }
}
