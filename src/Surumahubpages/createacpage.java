package Surumahubpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createacpage {
	WebDriver driver;
	//object repository
	By sname = By.name("name");
	By sEmail =By.name("email");
	By sphone =By.name("phone");
	By ssubmit=By.xpath("/html/body/div[1]/div/section/div/div/div/form/div/div[5]/button");
	
	
	
	public createacpage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public void setValue1(String firstname) {
		driver.findElement(sname).sendKeys(firstname);
	}

	public void setValue2(String Email) {
		driver.findElement(sEmail).sendKeys(Email);
	}

	public void setValue3(String phonenumber) {
		driver.findElement(sphone).sendKeys(phonenumber);
	}
	public void submit() {
		driver.findElement(ssubmit).click();
		}
	}

