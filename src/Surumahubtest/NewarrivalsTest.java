package Surumahubtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Surumahubpages.Newarrivalsclickpage;


public class NewarrivalsTest {
	 WebDriver driver;
		@BeforeTest
		public void setup()
		{
		driver = new ChromeDriver();
		driver.get("https://suruma.in/");
		
		}
		@Test
		public void search () throws InterruptedException {
		Thread.sleep(8000);
		Newarrivalsclickpage ob = new Newarrivalsclickpage(driver);
		ob.newarrivals();
		ob.tops();
}
}
