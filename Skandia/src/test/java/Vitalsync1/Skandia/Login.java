package Vitalsync1.Skandia;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	public static String freshwinid;
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://os5appqa-gl.os.zephyranywhere.com/om/login?no#");
	 
	driver.findElement(By.id("username")).sendKeys("systemadmin");
	driver.findElement(By.id("password")).sendKeys("Team1984");
	driver.findElement(By.xpath(".//*[@id='login-form']/input[2]")).click();
	driver.findElement(By.xpath(".//*[@id='manage-customer_wrapper']/div[1]/a[1]/span")).click();
	
	/*Set<String> s=driver.getWindowHandles();
	Iterator<String> itr=s.iterator();
	while(itr.hasNext())
	{
		 freshwinid = itr.next();
		
	}
	driver.switchTo().window(freshwinid);

	Thread.sleep(500);*/
	driver.findElement(By.xpath("//input[@id='DTE_Field_name']")).sendKeys("hello");
}	
}