package week_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
public class Myntra {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			Actions builder=new Actions(driver);
			driver.get("https://www.myntra.com/");
			//WebElement searchbar=driver.findElement(By.name("q"));
			//searchbar.sendKeys("Myntra");
			//Thread.sleep(500);
			//searchbar.submit();
			//WebElement myntralink=driver.findElement(By.xpath("//*[@id=\"tads\"]/div[3]/div/div/div/div[1]/a/div[1]/span"));
			//myntralink.click();
			WebElement profileHyperlink=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[1]/span[2]"));
			profileHyperlink.click();
			WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a"));
			loginbtn.click();
			WebElement phno=driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input"));
			phno.sendKeys("1234567890");
			WebElement continuebtn=driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]"));
			continuebtn.click();
			Thread.sleep(500);
	}

}
