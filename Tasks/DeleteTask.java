package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 EdgeDriver driver=new EdgeDriver();
	 	 driver.manage().window().maximize();
	   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 	 driver.get("https://login.salesforce.com/");
	     driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	     driver.findElement(By.id("password")).sendKeys("Leaf@1234");	
	     driver.findElement(By.id("Login")).click();
	     driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//button[text()='View All']")).click();
	     driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Tasks",Keys.ENTER);
	     driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
	    driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[4]")).click();
	    // driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("App launcher");
	 	// driver.findElement(By.xpath("//mark[text()='App Launcher']")).click();
	 	// driver.findElement(By.xpath("(//span[text()='Tasks'])[1]")).click();
	 	 WebElement dropDownIcon = driver.findElement(By.xpath("//a[contains(@class, 'sldsButtonHeightFix')]"));
	 	 //javaexecutionscript method;
	 	 driver.executeScript("arguments[0].click();", dropDownIcon);
	 	 Thread.sleep(10000);
	 	 WebElement element = driver.findElement(By.xpath("//div[text()='Delete']"));
	 	 driver.executeScript("arguments[0].click();",element);
	 	 driver.findElement(By.xpath("(//button[contains(@class, 'forceActionButton')])[2]")).click();
	}

}
