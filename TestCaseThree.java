package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manoj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabhakar");
		WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId"));
		WebElement mc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd1 = new Select (src);
		Select dd2 = new Select (mc);
		dd1.selectByValue("LEAD_EMPLOYEE");
		dd2.selectByIndex(4);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Man");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Pra");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("J");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/12/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000000");
		WebElement pc = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd3 = new Select(pc);
		dd3.selectByVisibleText("CZK - Czech Krona");
		WebElement indus = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd4 = new Select(indus);
		dd4.selectByVisibleText("Distribution");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd5 = new Select(own);
		dd5.selectByIndex(2);
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestCaseThree");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Fill all the fields in all sections");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("232");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Manoj");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Manoj");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Prabhakar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("23, Redline st");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Near Bus Stop, Velachery");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement dd7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select con = new Select(dd7);
		con.selectByValue("IND");
		Thread.sleep(2000);
		WebElement 	state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd6 = new Select (state);
		dd6.selectByValue("IN-TN");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600042");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("133");
		driver.findElement(By.className("smallSubmit")).click();
		
		String fname = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println("The Firstname is: "+fname);
		String title = driver.getTitle();
		System.out.println("Title of the Page: "+title);
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("Title of the page is matching");
		}
		else
			System.out.println("Title of the page is not matching");

	}

}
