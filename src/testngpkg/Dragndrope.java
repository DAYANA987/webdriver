package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragndrope {
	ChromeDriver driver;
	String main="https://demo.guru.99.com/test/drag_drop.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(main);
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement five=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement damount=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
		WebElement caccount=driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/h3"));
		WebElement daccount=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/h3"));
        WebElement camount=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
        
        act.dragAndDrop(five,damount).perform();
        act.dragAndDrop(bank,daccount).perform();
        act.dragAndDrop(five,camount).perform();
        act.dragAndDrop(bank,caccount).perform();
        
		
	}

}
