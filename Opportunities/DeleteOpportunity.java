package Opportunities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteOpportunity {

	public static void main(String[] args) throws InterruptedException {
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
	    //JavascriptExecutor je=(JavascriptExecutor) driver;
		 //je.executeScript("arguments[0].click();",findElement);
		 Thread.sleep(2000);
		 WebElement findElement2 = driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
		 findElement2.click();
		 findElement2.sendKeys("Salesforce Automation by vaan",Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
         driver.findElement(By.xpath("//span[text()='Delete']")).click();
		 driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();
		 WebElement findElement3 = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		 System.out.println(findElement3);
		
         
	}

}
