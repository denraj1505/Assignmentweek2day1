package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();		 
		WebElement elementusername= driver.findElement(By.id("username"));
		elementusername.sendKeys("Demosalesmanager");
		WebElement elementpassword= driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		WebElement elementclick= driver.findElement(By.className("decorativeSubmit"));
		elementclick.click();
		WebElement elementlink= driver.findElement(By.linkText("CRM/SFA"));
		elementlink.click();
	
		WebElement leads=driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement Createleads=driver.findElement(By.linkText("Create Lead"));
		Createleads.click();
		WebElement Companyname=driver.findElement(By.id("createLeadForm_companyName"));
		Companyname.sendKeys("Testleaf");
		WebElement Firstname=driver.findElement(By.id("createLeadForm_firstName"));
		Firstname.sendKeys("Dennis");
		WebElement Lastname=driver.findElement(By.id("createLeadForm_lastName"));
		Lastname.sendKeys("Raj");
		WebElement Firstnamelocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		Firstnamelocal.sendKeys("Den");
		WebElement department=driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("Testing");
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Software testing is the act of examining the artifacts and the behavior of the software under test by validation and verification");
		WebElement Email=driver.findElement(By.id("createLeadForm_primaryEmail"));
		Email.sendKeys("Test@test.com");
		WebElement Createbutton=driver.findElement(By.className("smallSubmit"));
		Createbutton.click();
		WebElement Editbutton=driver.findElement(By.linkText("Edit"));
		Editbutton.click();
		WebElement description1=driver.findElement(By.id("updateLeadForm_description"));
		description1.clear();
		WebElement Important=driver.findElement(By.id("updateLeadForm_importantNote"));
		Important.sendKeys("This is a important message");
		WebElement updatebutton=driver.findElement(By.name("submitButton"));
		updatebutton.click();
		String Title=driver.getTitle();
		System.out.println("Title is:" +"\n"+ Title);
		
		
	}

}
