package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RediffRadioBtn {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeMethod
	public void start() {
	
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() {
		WebElement radiobtn=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean isSelected=radiobtn.isSelected();
		System.out.println("Is Radio Button Selected? "+ isSelected);
	}
}
