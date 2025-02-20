package week_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
public class week10 {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com/");
		Thread.sleep(2000);
		WebElement createaccount=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span"));
		createaccount.click();
		Thread.sleep(2000);
		WebElement myself=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]"));
		myself.click();
		Thread.sleep(2000);
		WebElement fname=driver.findElement(By.name("firstName"));
		fname.sendKeys("hardik");
		Thread.sleep(2000);
		WebElement lname=driver.findElement(By.name("lastName"));
		lname.sendKeys("pandya");
		Thread.sleep(2000);
		WebElement bn1=driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
		bn1.click();
		Thread.sleep(2000);
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		month.selectByValue("10");
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		day.sendKeys("11");
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		year.sendKeys("1993");
		Select Gender=new Select(driver.findElement(By.xpath("//*[@id=\"gender\"]")));
		Gender.selectByValue("1");
		Thread.sleep(2000);
		WebElement bn2=driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span"));
		bn2.click();
		Thread.sleep(2000);
		WebElement uid=driver.findElement(By.name("Username"));
		uid.sendKeys("hp0984109");
		WebElement bn3=driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
		bn3.click();
		Thread.sleep(2000);
		WebElement pswd=driver.findElement(By.name("Passwd"));
		pswd.sendKeys("hardik@93");
		WebElement cpswd=driver.findElement(By.name("PasswdAgain"));
		cpswd.sendKeys("hardik@93");
		WebElement bn4=driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span"));
		bn4.click();
		//driver.close();
	}

}
