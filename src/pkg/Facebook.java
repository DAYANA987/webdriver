package pkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get(baseurl);
	}
	
	@Test
	public void setvalues()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ab1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

}
}
