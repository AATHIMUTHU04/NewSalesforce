package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MandatoryFieldTask {

	public static void main(String[] args) {
		
				EdgeDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://login.salesforce.com/");
			    driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			    driver.findElement(By.id("password")).sendKeys("Leaf@1234");	
			    driver.findElement(By.id("Login")).click();
			    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			    driver.findElement(By.xpath("//button[text()='View All']")).click();
			    driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Tasks",Keys.ENTER);
			     driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
			    driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[4]")).click();
				driver.findElement(By.xpath("//a[@class='slds-button slds-button--icon-x-small slds-button--icon-border-filled']")).click();
				WebElement findElement = driver.findElement(By.xpath("//div[text()='New Task']"));
				driver.executeScript("arguments[0].click();",findElement);
				driver.findElement(By.xpath("//textarea[@class='textarea textarea uiInput uiInputTextArea uiInput--default uiInput--textarea']")).sendKeys("SALESS FORCE");
			    driver.findElement(By.xpath("//span[text()='Save']")).click();
			    WebElement findElement2 = driver.findElement(By.xpath("//span[@class='genericError uiOutputText']"));
			    System.out.println(findElement2.getText());

	}

}
