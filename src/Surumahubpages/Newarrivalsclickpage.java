package Surumahubpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Newarrivalsclickpage {
	WebDriver driver;
	By newarrivals=By.xpath("/html/body/div[1]/header/div[2]/div/div/div/div/div[2]/div/ul/li[2]/a");
    By tops =By.xpath("//*[@id=\"head_menu2\"]/a");
    By croptops=By.xpath("//*[@id=\"head_menuul2\"]/li[5]/a");

//By scart= By.xpath("//*[@id=\"latest-product-listing\"]/div[1]/div/div[2]/div[3]/ul/li[1]/button");
    public Newarrivalsclickpage(WebDriver driver) {
    	this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
    public void  newarrivals(){
		driver.findElement(newarrivals).click();
	}
	//public void searchbutton() {
		//driver.findElement(Ssearch).click();
		
	//}
	public void  tops(){
		driver.findElement(tops).click();
	}

}
