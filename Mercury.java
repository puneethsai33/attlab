package week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mercury {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.mercurytravels.co.in/");
    Thread.sleep(2000);
    Actions builder=new Actions(driver);
    WebElement customerLogin=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
    builder.moveToElement(customerLogin).perform();
    Thread.sleep(2000);
    WebElement register=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
    register.click();
    Thread.sleep(2000);
    WebElement firstname=driver.findElement(By.xpath("//*[@id=\"acc_first_name\"]"));
    firstname.sendKeys("P");
    Thread.sleep(2000);
    WebElement secondname=driver.findElement(By.xpath("//*[@id=\"acc_last_name\"]"));
    secondname.sendKeys("Sai");
    Thread.sleep(2000);
    WebElement email=driver.findElement(By.xpath("//*[@id=\"acc_user_email\"]"));
    email.sendKeys("pune@gmail.com");
    Thread.sleep(2000);
    WebElement password=driver.findElement(By.xpath("//*[@id=\"acc_user_password\"]"));
    password.sendKeys("12345");
    Thread.sleep(2000);
    WebElement conpass=driver.findElement(By.xpath("//*[@id=\"acc_user_passconf\"]"));
    conpass.sendKeys("12345");
    Thread.sleep(2000);
    WebElement mobileno=driver.findElement(By.xpath("//*[@id=\"acc_mobile_no\"]"));
    mobileno.sendKeys("7998253421");
    Thread.sleep(2000);
    WebElement registerbtn=driver.findElement(By.xpath("//*[@id=\"modalUserLogin\"]/div/div/div[2]/form/button"));
    registerbtn.click();
    Thread.sleep(2000);
    driver.close();
	}

}
