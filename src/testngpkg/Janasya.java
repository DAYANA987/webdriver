package testngpkg;
	import java.io.File;
	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;

	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.ExpectedConditions;


	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	
		public class Janasya {

		ChromeDriver driver;
		String baseurl="https://www.janasya.com";
		
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		
		@Test(priority = 1)
		public void arrivals()
		{
			driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")).click();
		}
		
		@Test(priority = 2)
		public void logo()
		{
			boolean logo=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16316676800682__9c03747e-b054-4db8-8194-5a35c71f82ca\"]/div/div/div/div[1]/div/a/img")).isDisplayed();
			if(logo)
			{
				System.out.println("Logo is present");
			}
			else
			{
				System.out.println("Logo is not present");
			}
		}
		
		@Test(priority = 3)
		public void items()
		{
			driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/div/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/ul/li[2]")).click();
		}
		
		@Test(priority = 4)
		public void category()
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement cat= driver.findElement(By.xpath("//*[@class='sidebarBlock-headingWrapper']/h3"));
			cat.click();
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='navPages-action link link-underline']/span")))).click();
			
		}
		
		@Test(priority = 5)
		public void links()
		{	
			WebElement el=driver.findElement(By.xpath("/html/body/div[3]"));
				List<WebElement> li=el.findElements(By.tagName("a"));
				System.out.println("Total no of links: "+li.size());
		
		}
		
		@Test(priority = 6)
		public void menus()
		{
			WebElement m=driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul"));
			List<WebElement> li=m.findElements(By.tagName("li"));
			for(WebElement menu:li)
			{
				System.out.println(menu.getText());
			}
		}
		
		@Test(priority = 7)
		public void wishlist()
		{
				
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement button=driver.findElement(By.xpath("//*[@class='collection']/ul/li[1]/div/div/div[1]/div/div[3]/div/button"));
			Actions act=new Actions(driver);
			act.moveToElement(button).click().perform();
				
		}

		@Test(priority = 8)
		public void cart()
		{             
			driver.findElement(By.xpath("//*[@id=\"main-collection-product-grid\"]/li[1]/div"));
			driver.findElement(By.xpath("//*[@class='collection']/ul/li[1]/div/div/button")).click();
			
		}
		
		@Test(priority = 9)
		public void viewcart()
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement view= driver.findElement(By.xpath("//*[@id=\"halo-cart-sidebar\"]"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='previewCartGroup']/a"))).click();
		}
		
		@Test(priority = 10)
		public void contishop()
		{
			driver.findElement(By.xpath("//*[@id='MainContent']/div[1]/cart-coupon-discount/cart-items/div"));
			driver.findElement(By.xpath("//*[@class='cart-actions']/div/a")).click();
		}

		
		@Test(priority = 11)
		public void ethnic()
		{

			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		    WebElement el=driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/a/span[1]"));
		    Actions act=new Actions(driver);
			act.moveToElement(el).perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[2]/a/span"))).click();
			
		}

		
		@Test(priority = 12)
		public void screenshot() throws Exception
		{
			WebElement screenshot=driver.findElement(By.xpath("//*[@id=\"MainContent\"]"));
			File src=((TakesScreenshot)screenshot).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C:\\Users\\hp admin//ethnic.png"));
		}
		
	}



