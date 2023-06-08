package Opportunities;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOpportunity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 EdgeDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://login.salesforce.com/");
		 driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		 driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		 driver.findElement(By.id("Login")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		 Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[text()='View All']")).click();
	     driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Opportunities");
	     driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[1]")).click();
	      
	     //driver.findElement(By.xpath("//span[text()='New Opportunity']")).click();
	     driver.findElement(By.xpath("//div[text()='New']")).click();
	     driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Salesforce Automation by Aathi");
	     driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("6/5/2023");
	     Thread.sleep(3000);
	    
	     WebElement value = driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[2]"));
         value.click();       
         Thread.sleep(3000);
         WebElement need = driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]"));
         need.click();
          
         driver.findElement(By.xpath("//button[text()='Save']")).click();
	     
	     
	     
	     
	     
	   }

}
