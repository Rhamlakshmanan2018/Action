package org.movetoweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmathod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rhamlakshmanan\\eclipse-workspace\\Action\\driver\\chromedriver.exe");
		WebDriver allow =new ChromeDriver();
		allow.get("https://lh.inmakesedu.com/home/login");
		allow.manage().window().maximize();
		Thread.sleep(3000);
		//To create object in Action
		Actions a = new Actions(allow);
		//To find the webElement mouse in Course
		WebElement Course = allow.findElement(By.id("navbarDropdown"));
		//move the courser to Course
		a.moveToElement(Course).perform();
		//To move the SoftwareTesting mouse over
		WebElement ST = allow.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
		a.moveToElement(ST).perform();
		//To find the software Master webElement in mouse over
		WebElement SM = allow.findElement(By.xpath("//a[text()='ST Master Class']"));
	    SM.click();
	}

}
