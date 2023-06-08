package Opportunities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EditOpportunity {

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
	      
	    driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon slds-button_icon-border-filled'])[2]")).click();
	      
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='uiScroller scroller-wrapper scroll-bidirectional native']")).click();
	    driver.findElement(By.xpath("(//span[@class='triggerContainer'])[1]")).sendKeys("6/7/23");
	    

		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='--None--'])[4]")).click();
		driver.findElement(By.xpath("//span[text()='In progress']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement findElement3 = driver.findElement(By.xpath("//div[@class='slds-align-middle slds-hyphenate']//span"));
		System.out.println(findElement3.getText());

	 
	}

}
