import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
WebElement userName =driver.findElement(By.id("usernamwew"));
userName.sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
	}

}
