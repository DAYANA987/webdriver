package pkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Fileuploadauto {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void main () throws  IOException,Exception
	{
      driver.get("https://www.ilovepdf.com/word_to_pdf");
      driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click(); //button click
      Thread.sleep(3000);
      Runtime.getRuntime().exec("C:\\Users\\Dayana\\Documents\\FileuploadAutoit");
      Thread.sleep(3000);
      

	}

	}
