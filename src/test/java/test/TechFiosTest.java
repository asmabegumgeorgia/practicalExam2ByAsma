package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.TechFiosTestPage;
import util.Base;

public class TechFiosTest {
	WebDriver driver;

	@Test

	public void UserShouldBeAbleToAdd() throws InterruptedException {
		driver = Base.launchBrowser();
		TechFiosTestPage page = PageFactory.initElements(driver, TechFiosTestPage.class);

		page.addCategoryToList();

		Thread.sleep(2000);
		Base.tearDown();
	}
	@Test
	public void DropDownList() throws InterruptedException {
		driver = Base.launchBrowser();
		TechFiosTestPage page = PageFactory.initElements(driver, TechFiosTestPage.class);

		page.clickDropDowun();
		Thread.sleep(2000);
		Base.tearDown();
	}
}
