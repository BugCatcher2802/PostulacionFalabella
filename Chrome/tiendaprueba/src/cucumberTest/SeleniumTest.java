package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	//private static WebDriver driver = null;
	public static void main(String[] args) {
		// Create a new instance of the google driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaguilar\\Desktop\\instalar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.linkedin.com");
        // ingreso de datos login site
        driver.findElement(By.id("login-email")).sendKeys("jpaguilar2802@gmail.com"); 
        driver.findElement(By.id("login-password")).sendKeys("JPA321prz23");
        // boton acceso site
        driver.findElement(By.id("login-submit")).click();
        // realiza click en cuadro de texto buscar
        driver.findElement(By.cssSelector("input[type=\"text\"]")).click();
        // busqueda por nombre de perfil seleccionado
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Mar�a Jos� Silva Hern�ndez");
        //seleccion icono search 
        driver.findElement(By.cssSelector("li-icon[type=\"search-icon\"]")).click();
        // Ingreso perfil seleccionado 
        driver.findElement(By.cssSelector("span.name.actor-name")).click();

 
	}
 
}
