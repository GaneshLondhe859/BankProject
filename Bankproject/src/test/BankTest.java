package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankTest {
 public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","./drivers/chromedrievr.exe");
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/v3/index.php");
	driver.findElement(By.name("uid")).sendKeys("mngr443617");
	driver.findElement(By.name("password")).sendKeys("uqYbajA ");
	driver.findElement(By.name("btnLogin")).click();
}

}
