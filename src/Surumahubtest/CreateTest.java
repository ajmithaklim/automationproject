package Surumahubtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Surumahubpages.createacpage;

public class CreateTest {
	WebDriver driver;
	 
	@BeforeTest
	 public void setup()
		{
		driver=new ChromeDriver();
	    driver.get("https://suruma.in/");                                                                                                                                                             //driver = new ChromeDriver();
	    driver.navigate().to("https://suruma.in/user-register");
        }
    

@Test
public void register() throws InterruptedException
{
Thread.sleep(6000);
createacpage ob = new  createacpage (driver);
ob.setValue1("ammu");
ob.setValue2("astdvafm@gmail.com");
ob.setValue3("6988788999");
ob.submit();

}
}
