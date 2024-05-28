package pkg;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Rediffmail { 
		
		ChromeDriver driver;
		String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
		
		
		@Before
		public void setUp()
		{
			  driver = new ChromeDriver();
			  driver.get(baseurl);
		}
		
		@org.junit.Test
		public void setvalues()
		{
			driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("dayu");
			driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input")).sendKeys("dayu@rediff.com");
			driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		}
}
