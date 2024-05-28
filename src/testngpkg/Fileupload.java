package testngpkg;


	import org.openqa.selenium.By;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Fileupload {
		ChromeDriver driver;
		String baseurl="https://demo.guru99.com/test/upload/";
		@BeforeTest
		public void start()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);	
		}
		@Test
		public void test() {
			WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
			upload.sendKeys("C:/Users/Dayana/Downloads/HT_3_Grp_hallticket.pdf");
			WebElement check=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
			check.click();
			
			WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
			submit.click();
		}
		
		

}
