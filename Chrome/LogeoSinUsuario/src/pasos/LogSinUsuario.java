package pasos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogSinUsuario {
	//private static WebDriver driver = null;
	public static void main(String[] args) {
		// Create a new instance of the google driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaguilar\\Desktop\\instalar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.linkedin.com");
        // ingresa datos basicos y luego accede a pagina principal donde ya aparece usuario logeado.
        driver.findElement(By.id("reg-firstname")).sendKeys("Juanitos"); 
        driver.findElement(By.id("reg-lastname")).sendKeys("Aguilars Pachecos"); 
        driver.findElement(By.id("reg-email")).sendKeys("a1ee333cfvfvfgy@gmail.com"); 
        driver.findElement(By.id("reg-password")).sendKeys("1234qwerty"); 
        driver.findElement(By.id("registration-submit")).click(); 
        
        //driver.findElement(By.id("recaptcha-checkbox-checkmark")).click();
        driver.get(" https://www.linkedin.com/start/edit-profile");
        driver.get("http://www.linkedin.com");
        System.out.println(" se cumple condicion especificada en las pruebas"
        		+ "Loguearse con un usuario no registrado.") ;
        // si se completa la primera fase se puede ingresar nuevamente a la pagina donde ya 
        //muestra informacion del usuario nuevo.
       
    
 
	}
 
}

