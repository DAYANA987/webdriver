package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String exp="Google";
		if (actualtitle.equals(exp))
		{
			System.out.println("title comparison pass");
			
		}
		else
		{
			System.out.println("title comparison fail");
		}
	}

}
