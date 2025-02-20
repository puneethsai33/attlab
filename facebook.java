package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Cse");
		Thread.sleep(2000);
		WebElement surname=driver.findElement(By.name("lastname"));
		surname.sendKeys("b");
		Thread.sleep(2000);
		WebElement mobileno=driver.findElement(By.name("reg_email__"));
		mobileno.sendKeys("1234567890");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("12345");
		Thread.sleep(2000);
		Select dateDropdown=new Select(driver.findElement(By.name("birthday_day")));
		dateDropdown.selectByValue("19");
		Thread.sleep(2000);
		Select monthDropdown=new Select(driver.findElement(By.name("birthday_month")));
		monthDropdown.selectByValue("5");
		Select yearDropdown=new Select(driver.findElement(By.name("birthday_year")));
		yearDropdown.selectByValue("2005");
		Thread.sleep(2000);
		WebElement maleRadioBtn=driver.findElement(By.xpath("//*[@id=\"sex\"]"));
		maleRadioBtn.click();
		Thread.sleep(2000);
		WebElement signupBtn=driver.findElement(By.name("websubmit"));
		signupBtn.click();

	}

}
