package Tasks;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.v111.database.model.Error;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateTask {

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
	     driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Tasks",Keys.ENTER);
	     driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
	      
	     driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[4]")).click();
	     Thread.sleep(3000);	
	     driver.findElement(By.xpath("//span[text()='New Task']")).click();
	     // driver.findElement(By.xpath("//span[text()='Recently Completed Tasks']")).click();
		 driver.findElement(By.xpath("slds-combobox__input slds-input")).sendKeys("Bootcamp");
		 WebElement element = driver.findElement(By.xpath("//a[text()='Not Started']"));
		 Select sele=new Select(element);
		 sele.selectByIndex(4);
		 driver.findElement(By.xpath("//span[text()='Save']")).click();
		 
		}

}
