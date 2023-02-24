
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedloRegister {
    @Test
    public void testSignUpSuccess() {
        // Inicializa el driver de Selenium para Chrome
        WebDriver driver = new ChromeDriver();

        driver.get("https://dev.redlo.com.pe/");
        WebElement boton = driver.findElement(By.cssSelector("#root > div > div.d-flex.row > div.order-2-1.col-md-5.col-12 > div > div > div:nth-child(1) > button"));
        boton.click();
        
        WebElement ruc = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(3) > input"));
        ruc.sendKeys("12345678999");
       
        WebElement direccion = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(7) > input"));
        direccion.sendKeys("Av Amazonas");
        
        WebElement correo = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(8) > input"));
        correo.sendKeys("user99@example.com");
        
        WebElement fono = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(9) > input"));
        fono.sendKeys("987654321");
        
        WebElement nombres = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(10) > input"));
        nombres.sendKeys("Prueba99");
        
        WebElement cargo = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(11) > input"));
        cargo.sendKeys("CEO");
        
        WebElement contra = driver.findElement(By.cssSelector("#formBasicEmail"));
        contra.sendKeys("prueba99@Aa");
        
        WebElement contrarep = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div.col-12.col-sm-6.mb-5 > input"));
        contrarep.sendKeys("prueba99@Aa");
        
        //DEPARTAMENTO
        WebElement dropdown1 = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(4) > div > select"));
        Select select1 = new Select(dropdown1);
        select1.selectByValue("PE-01");
        WebElement selectedOption1 = select1.getFirstSelectedOption();
        assertEquals("Amazonas", selectedOption1.getText());

        try {
            Thread.sleep(8000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //PROVINCIA
        WebElement dropdown2 = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(5) > div > select"));
        Select select2 = new Select(dropdown2);
        select2.selectByValue("PE-01-02");
        WebElement selectedOption2 = select2.getFirstSelectedOption();
        assertEquals("Bagua", selectedOption2.getText());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //DISTRITO
        WebElement dropdown3 = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(6) > div > select"));
        Select select3 = new Select(dropdown3);
        select3.selectByValue("PE-01-02-01");
        WebElement selectedOption3 = select3.getFirstSelectedOption();
        assertEquals("La Peca", selectedOption3.getText());
        
       
        WebElement submit = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > form > div:nth-child(14) > button"));
        submit.click();
       
    }
        
}

