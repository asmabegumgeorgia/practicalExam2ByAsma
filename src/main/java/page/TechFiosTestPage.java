package page;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TechFiosTestPage  {
	
	
	WebDriver driver;

	public  TechFiosTestPage(WebDriver driver) {
		this.driver = driver;
	}	
	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement Add_Locator;
	
	@FindBy(how = How.XPATH, using = "   //body/div[@class='advance-controls']/input[2]")
	WebElement Click_Add_Locator;
	
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement Month_dropdown;
	
	public void addCategoryToList() throws InterruptedException {
		Add_Locator.sendKeys("Add TestObject");
		Click_Add_Locator.click();
		Thread.sleep(5000);
		String addedText= driver.findElement(By.xpath("//body[contains(text(),'Sorry that TODO item already exists.')]")).getText();
		System.out.println(addedText);
		driver.findElement(By.xpath("//a[contains(text(),'Back')]")).click();
			
		
	}
	
	public void addCategory() throws InterruptedException {
		if (!Add_Locator.isSelected()) {

			Add_Locator.sendKeys("Beautiful");
			System.out.println("Add Beautiful");
			Thread.sleep(2000);
		} else if (Add_Locator.isSelected()) {
			System.out.println(" Already Add Beautiful!");
		}//else if(Add_Locator.isSelected()){
			
			//Add_Locator.sendKeys("Beautiful");
			//System.out.println("The category you want to add already exists: Beautiful");
		//}
		
		//Add_Locator.sendKeys("Beautiful");
		
	}
	
	
	
	public void clickAddButton() {
		Click_Add_Locator.click();
	}
	
	
	public void clickDropDowun() {
		WebElement Month_dropdown=driver.findElement(By.xpath("//select[@name='due_month']"));
		 
		Select select_month = new Select(Month_dropdown);
		select_month.selectByVisibleText("Mar");
		
		List<WebElement> dropdown= select_month.getOptions();
		 
		 for(int i=0;i<dropdown.size();i++){
		 
		 String drop_down_values=dropdown.get(i).getText();
		 
		 System.out.println("dropdown values are "+drop_down_values);
		 
		 }
	
	}

}
